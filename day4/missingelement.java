package week1.day4;

public class missingelement {
public static void main(String[] args) {
	int[] array = {8,7,5,4,3};
	int  n=array.length+1;
	int sum=(n*(n+1)/2);
	for(int i=0;i<array.length;i++) {
		sum=sum-array[i];
	}
	System.out.println("Missing number is"+sum);
	
}

}
