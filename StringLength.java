package setthree;
import java.util.*;
public class StringLength {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		System.out.println(a.replaceAll(" ","").length());
	}
}
