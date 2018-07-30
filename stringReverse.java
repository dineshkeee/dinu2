package hunter;
import java.util.*;
public class stringReverse {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String arr[]=a.split(" ");
		for(int i=0;i<arr.length;i++){
			System.out.print(new StringBuffer(arr[i]).reverse().toString()+" ");
		}
		
		
	}

}
