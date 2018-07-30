package hunter;
import java.util.*;
public class spaceRemove {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String b=a.replaceAll("  "," ");
		System.out.println(b);
	}
}
