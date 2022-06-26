package com.upskill.assignment1;

public class Assignment_1_2 {

	/*Problem 02: A rectangle width and length are: 9 and 13 inches.
	Write a method to display the perimeter of rectangle in console output. */


		public static void main(String[] args) {
			rectanglePerimeter();
			
			System.out.println ("Return type method of The perimeter of the rectagle "+returnPerimeter());
		
		}
		
		public static void rectanglePerimeter(){
			int a = 9;
			int b = 13;
			int result = 2 * (a + b);
			
			System.out.println ("The perimeter of rectangle with arm 9 and 13 is "+result);
			
		}
		
		public static int returnPerimeter(){
			int a = 9;
			int b = 13;
			int result = 2 * (a + b);
			return result;
			
		}

	
}