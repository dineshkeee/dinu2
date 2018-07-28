package set2;
import java.util.*;
public class oddIntNum {
	public static void main(String args[]){
		int a,b,c,i;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(i=a+1;i<b;i++){
			if(i%2!=0){
				System.out.println(i+" ");
			}
		}
	}
}
