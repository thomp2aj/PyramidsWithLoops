/* 
 * Alexander Thompson
 * Description: Loop Pyramid
 * Due Date: 9/26/19 at 8 AM
 * email:thomp2aj@mail.uc.edu
 * Printing pyramids using loops. It works
 *
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		
		int x;
			
		for (int i=0; i<n; i++) {
			
			//Inner Loop to set the spaces for each number
			for (int j=n-i; j>1; j--){
				//Below prints the actual spaces
				System.out.print(" ");
			}
				x= i+1;
				System.out.print(x);
				
	
				
				//Inner Loop to set the correct number of columns
				//Each of these values will change due to outer loop
				for (int j=1; j<=i; j++ ){
					System.out.print(x + "" + x);
					
					
				}
				//Below is the ending line for every row
			System.out.println();
		}
	}
}

