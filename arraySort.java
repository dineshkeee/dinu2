package set3;
import java.util.Arrays;
import java.util.Scanner;
public class arraySort {
	public static void main(String args[]){
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}
}

