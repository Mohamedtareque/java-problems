import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
public class soduku{

	public static void main(String [] args){
		int [][] grid = establishGame(); 
		System.out.println(isValid(grid)? "Valid" : "Invalid") ;
	}
	public static int [][] establishGame(){
		int [][]grid = new int [9][9];
		Scanner input = new Scanner(System.in);
		for (int i=0;i<9 ;i++ ) {
			for (int j=0;j<9 ;j++ ) {
				System.out.println("Enter val");
				grid[i][j]=input.nextInt();
			}
		}
		return grid;
	} 
	public static boolean isValid(int grid[][]){
		for (int i=0;i<9 ;i++ ) {
			if (! is1To9(grid[i])) {
				return false ;
			}
		}
		for (int j=0;j<9 ;j++ ) {
			int [] col = new int [9]; 
			for (int i=0;i<9 ;i++ ) {
				col[i]=	grid[i][j];
			}if (! is1To9(col)) {
				return false;
			}
		}
		return true ;
	}
	public static boolean is1To9(int []list){
		int []temp = new int [list.length];
		java.lang.System.arraycopy(list,0,temp,0,list.length);
		java.util.Arrays.sort(temp);
		for (int i =0;i<9 ;i++ ) 
			if(temp[i] != i+1)
				return false ;
			
				return true ;
			
		
	}
}
