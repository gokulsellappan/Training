package newpackage;


import java.util.Scanner;

public class threedimentionalarray {
	public static void main(String arg[]) {
		int[][][] arr = new int[2][3][4];
		Scanner  s1= new Scanner(System.in);
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print("enter value");
					System.out.print(arr.length);
					System.out.print(arr[i].length);
					System.out.print(arr[i][j].length);
					arr[i][j][k]=s1.nextInt();
					//System.out.print(arr[i][j][k]+"");
				}
				System.out.println();
			}
			System.out.println();
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			
		}
		
		
	}

}
