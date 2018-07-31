package setthree;

import java.util.Arrays;
import java.util.Scanner;
public class medianElement {
	public static void main(String args[]){
		int a,i;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int arr[]=new int[a];
		for(i=0;i<a;i++){
			arr[i]=in.nextInt();
		}Arrays.sort(arr);
			System.out.println(arr[(a/2)]);
	}	
}


