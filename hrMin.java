package setthree;
import java.util.*;
public class hrMin {
	public static void main(String args[]){
		int arr[]=new int[4];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<4;i++){
			arr[i]=in.nextInt();
		}System.out.println(Math.abs(arr[0]-arr[2])+" "+Math.abs(arr[1]-arr[3]));
	}
}
