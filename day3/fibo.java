package week.day3;

public class fibo {
	public static void main(String[] args) {
		int n=7;
		int k=1,t=1,m;
		System.out.println(k);
		System.out.println(t);
		for(int i=3;i<=n;i++)
		{
			m=k+t;
			System.out.println(m);
			k=t;
			t=m;
			
					
		}
	}

}
