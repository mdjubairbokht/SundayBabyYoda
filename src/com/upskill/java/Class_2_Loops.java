package com.upskill.java;

public class Class_2_Loops {
		/* Type of Loops
		 1. For Loops
		 2. While Loop
		 3. Do While Loop
		 4. Infinite Loop
	 */
		
	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestedForLoop();
				
	}
	
	public static void practiceForLoop(){                      // For Loop - do again and again upto upper limit
		int i;                                                 // Initialize variable
		for (i = 1; i<100; i++){                               // Setting lower limit, upper limit, increment or decrement
			System.out.println("For loops Numbers = " + i);    // Statement
				
		}
	}
	
	public static void practiceWhileLoop(){                         // While Loop -  Do again and again upto condition match
		int i = 1;                                                  // Initialize variable
		while(i<=1000){                                             // Setting condition
			System.out.println("While loops Numbers = " + i);       // Statement
			i ++;                                                   // Increment or decrement 
			
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i = 1;                                                  // Do While Loop - Do action then match condition
		do {                                                        // Initialize variable
			System.out.println("Do-While loops Numbers = " + i);    // Statement
			i ++;                                                   // Increment or decrement 
		} while (i <=1000);                                         // Checking Condition 
		
	}
	
	public static void practiceInfiniteLoop(){
		int i;                                                       // Initialize variable
		for (i = 1; ; i++){                                          // Setting No upper limit
			System.out.println("Infinite loops Numbers = " + i);     // Statement
	}
	
	}

		public static void practiceNestedForLoop(){                   // Nested For Loop - loop inside another loop
			int i;                                                    // Initialize variable i
			int j;                                                    // Initialize variable j
			for (i = 1; i<=10; i++){                                  // First loop for i
				for (j=1; j<=10; j++){                                // Second loop for j
					System.out.println("Nested For loops Numbers = " + i + ":" + j );   
			}
		System.out.println("Increase value of i - > " + i);
		
					
   }
	
   }
}


	
	
	
	
	
	
	
	
	