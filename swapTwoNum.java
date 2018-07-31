package set3;
import java.util.*;
public class swapTwoNum {
	public static void main(String args[]){
		int a,b,temp=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
}
