package setthree;
import java.util.*;
public class index {
	public static void main(String args[]){
		int a,i;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int arr[]=new int[a];
		for(i=0;i<a;i++){
			arr[i]=in.nextInt();
			}
		for(i=0;i<a;i++){
			System.out.println(arr[i]+" "+i);
		}
	}
}
