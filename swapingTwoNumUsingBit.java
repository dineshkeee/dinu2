package set3;
import java.util.*;
public class swapingTwoNumUsingBit {
		public static void main(String args[]){
			int a,b;
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			b=in.nextInt();
			a=a^b;System.out.println(a);
			b=a^b;System.out.println(b);
			a=a^b;System.out.println(a);
			System.out.println(a+" "+b);
		}
}
