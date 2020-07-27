package newpackage;

public class NewSample {
	
	protected int add(int x,int y) {
		int z=x+y;
		return z;
		
	}
	public int sub(int x,int y) {
		int z=x-y;
		return z;
		
	}
	public int multi(int x,int y) {
		int z=x*y;
		return z;
		
	}
	public float div(int x,int y) {
		float z=(float) (y/3.3);
		return z;
		
	}
	
	public static void main(String arg[]) {
		
		int i =10;
		int j= 20;
	NewSample maths = new NewSample();
	int k= maths.add(i, j);
	System.out.println(k);
	System.out.println(maths.sub(i, j));
	System.out.println(maths.multi(i, j));
	System.out.println(maths.div(i, j));

	}

}
