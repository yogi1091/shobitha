package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Employee {
	public static void main(String[] args) throws AWTException {
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
	}

}
