/*
Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements
*/
import java.util.*;
public class summatrix{
	public static void main(String[]args){
			int [][] arr= new int[4][4];
			int sum = 0 ;
			Scanner input = new Scanner(System.in);
			for (int i=0;i<4 ;i++ ) {
				for (int j=0;j<4 ; j++) {
					System.out.println("Enter val");
					arr[i][j]=input.nextInt();
					sum = arr[i][j]+sum;
				}
			}
	System.out.println(sum);
	}
}
