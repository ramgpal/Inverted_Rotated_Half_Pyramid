/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void Inverted_Rotated_Half_Pyramid(int n) {
	    for(int i=1;i<=n;i++) {
	        for (int j=1;j<=n-i;j++) { //spaces
	   System.out.print(" ");
	    }
	    for (int j=1;j<=i;j++) {
	        System.out.print("*");
	        
	    }
	    System.out.println();
	} }
	public static void main(String[] args) {
	Half_Rotated_Pyramid(4);	
} }
