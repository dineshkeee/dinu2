package set3;
import java.util.*;
public class FibonacciSeries {
	public static void main(String args[]){
		int a=1,b=1,temp=1,i,n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++){
			System.out.println(a);
			temp=a+b;
			a=b;
			b=temp;
			
		}
	}
}