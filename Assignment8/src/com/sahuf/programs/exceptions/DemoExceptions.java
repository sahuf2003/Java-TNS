package com.sahuf.programs.exceptions;

public class DemoExceptions {
	public static void main(String args[]) {
		try { 
			//outer block
			int b = 0;
			try {
				//inner block 1
				String s = null;
				System.out.println(s.length()); // This line will give NullPointerException 
			}
			catch(NullPointerException e){
				System.out.println("Exception " +e.getMessage());
			}
			try {
				//inner block 2
				int[] a = {5,6,9};
				System.out.println(a[4]); // This line will give ArrayIndexOutOfBoundsException
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Exception occured"+e.getMessage());
			}
			
			int g = 100/0;
			System.out.println("Dividing the number we get"+g);
		}
		catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
		finally {
			System.out.print("The program is executed");
		}
	}
}
