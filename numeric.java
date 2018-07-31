package setthree;
import java.util.*;
public class numeric {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.next();
		String b=a.replaceAll("[^0-9,.]","");
		System.out.println(b);
		if(b.length()==a.length()){
			System.out.println("yes");
		}else System.out.println("No");
		
	}
}
