package setthree;
import java.util.*;
public class arraySorttt {
	public static void main(String args[]){
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=in.nextInt();
		}Arrays.sort(arr);
		for(int i=0;i<a;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
