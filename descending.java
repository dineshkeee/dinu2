package pro;
import java.util.*;
public class descending {
		public static void main(String args[]){
			int a,i;
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			int arr[]=new int[a];
			for(i=0;i<a;i++){
				arr[i]=in.nextInt();
			}Arrays.sort(arr);
			for(i=a-1;i>=0;i--){
				System.out.println(arr[i]);
			}
		}
}
