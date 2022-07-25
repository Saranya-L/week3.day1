package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("My desktop size is 15 inches");
	}

	public static void main(String[] args) {
		Desktop dk=new Desktop();
		dk.computerModel();//inhereted from COmputer class
		dk.desktopSize();
	}
}
