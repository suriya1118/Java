package java_basics;

import java.util.*;

public class stringSpace {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row : ");
		int r = s.nextInt();
		System.out.println("Enter column : ");
		int c = s.nextInt();
		int[][] arr = new int[r][c];
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				arr[r][c] = s.nextInt();
			}
			
		}
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(arr[r][c] + " ");
			}
			System.out.println(" ");
		}
	}
	
	

}
