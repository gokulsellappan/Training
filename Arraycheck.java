package newpackage;

public class Arraycheck {
	public static void main(String arg[]) {
		int[] array =new int[13];
		String[] str =new String[10];
		int length = array.length;
		int len =length;
		for(int i=0;i<length;i++) {
			array[i] =len;
			len--;			
		}
		for (int val:array) {
			System.out.println("values are"+val);
		}
	}
	

}
