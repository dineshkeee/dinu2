package hunter;
import java.util.*;
public class arraySum {
	public static void main(String args[]){
		int i,sum=0,l;
		Scanner in=new Scanner(System.in);
		l=in.nextInt();
		int arr[]=new int[l];
  for(i=0;i<l;i++){
	  arr[i]=in.nextInt();
	  sum+=arr[i];
	  }
  System.out.println(sum);
  }
}
