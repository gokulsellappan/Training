package newpackage;

import java.util.Scanner;

public class Twodimentionalarray {
	
	public static void main(String arg[]) {
		int [][] arr = new int[2][3];
		Scanner input =new Scanner(System.in);
		System.out.println("enter value");
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=input.nextInt();				
			}
			System.out.println();
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");				
			}
			System.out.println();
		}
	}

}
