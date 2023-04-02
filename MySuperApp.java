public class MySuperApp {
	
	static int x;
	static int y;
	static int d;
	static int e;
	static int f;
	
	
	public static void main (String[] args) {
		
		x = 1;
		y = 3;
		d = x + y;
		e = d + x;
		f = d + e;
		
		System.out.println("D = " + d);	
		System.out.println("E = " + e);
		System.out.println("F = " + f);
	}
}
		