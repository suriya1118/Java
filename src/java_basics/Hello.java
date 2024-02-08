package java_basics;

import java.util.Scanner;


public class Hello {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row : ");
		int r = s.nextInt();
		System.out.println("Enter column : ");
		int c = s.nextInt();
		int[][] arr = new int[r][c];
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				arr[i][j] = s.nextInt();
			}
			
		}
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
}
