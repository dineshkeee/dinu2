package set2;
import java.util.*;
public class palindrome {
		public static void main(String args[]){
			String a,b;
			Scanner in=new Scanner(System.in);
			a=in.next();
			b=new StringBuffer(a).reverse().toString();
			if(a.equals(b)){System.out.println("yes");
		}else System.out.println("NO");}
}
