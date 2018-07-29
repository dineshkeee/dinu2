package set2;
import java.util.*;
public class armstrong {
	public static void main(String args[]){
		int a,l,sum=0,b,c=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		l=Integer.toString(a).length();
		c=a;
		while(a!=0){
			b=a%10;
			sum+=(Math.pow(b,l));
			a/=10;
		}
		if(c==sum){
			System.out.println("yes");
		}else System.out.println("No");
	}
}
