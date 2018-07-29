package set3;
import java.util.*;
public class maxNumInArry {
		public static void main(String args[]){
			int a;
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			int arr[]=new int[a];
			for(int i=0;i<arr.length;i++){
				arr[i]=in.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[arr.length-1]);
		}
}
