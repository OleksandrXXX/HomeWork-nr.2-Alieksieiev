public class MySuperApp {
	
	static int x;
	static int y;
	static int d;
	static int e;
	
	
	public static void main (String[] args) {
		
		x = 1;
		y = 3;
		d = x + y;
		e = d + x;
		
		System.out.println("D = " + d);	
		System.out.println("E = " + e);
	}
}
		