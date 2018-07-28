package set2;
import java.util.Scanner;
public class evenIntNum {
	public static void main(String args[]){
		int a,b,c,i;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(i=a+1;i<b;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}
