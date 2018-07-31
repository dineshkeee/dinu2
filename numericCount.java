package set3;
import java.util.*;
public class numericCount {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String a=in.next();
		System.out.println(a.replaceAll("[^0-9]","").length());
	}
}
