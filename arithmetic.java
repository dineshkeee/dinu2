package setthree;
import java.util.*;
public class arithmetic {
	public static void main(String args[]){
		int arr[]=new int[3],i,sum=0;
		Scanner in=new Scanner(System.in);
		for(i=0;i<3;i++){
			arr[i]=in.nextInt();
		}Arrays.sort(arr);
		for(i=1;i<arr[3];i++){
		   sum=sum+i;
		}
		if(arr[0]!=arr[1]){
			System.out.println(sum+1);
		}else{
			System.out.println(sum);
		}
	}
}
