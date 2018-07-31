package set3;
import java.util.*;
public class specialCharCount {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String a=in.next();
		System.out.println(a.replaceAll("[A-z,0-9]","").length());
	}
}
