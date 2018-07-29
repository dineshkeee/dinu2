package set2;
import java.util.Scanner;
public class armstrongBtwTwoNum {
	public static void main(String args[]){
		int a,b,c,d,i,l,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(i=a+1;i<b;i++,sum=0){
		     l=Integer.toString(i).length();
		    c=i;
		while(c!=0){
			d=c%10;
			sum+=(Math.pow(d,l));
			c/=10;
		}
		if(i==sum){
			System.out.println(i);
		}
	 }
   }
}
