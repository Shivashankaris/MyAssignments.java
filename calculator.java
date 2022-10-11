package week1.day2;

public class calculator {
	public void add(int a,int b) {
	int c=a+b;
	System.out.println(c);
	}
	public void sub(int w,int f) {
		int e=w-f;
		System.out.println(e);
	}
	public void multiply(double i,double j) {
		double g = i*j;
		System.out.println(g);
	}
	public void division(float k,float n) {
		float x =k/n;
		System.out.println(x);
	}
	public static void main(String[] args) {
		calculator cals=new calculator();
		cals.add(10,20);
		cals.sub(30,6);
		cals.multiply(20,0);
		cals.division(2,40);
	
	}
	

}
