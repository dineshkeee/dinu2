package set2;
import java.util.*;
public class prime {
	public static void main(String args[]){
		int a,i,j,c=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(i=1;i<=a;i++){
				if(a%i==0){
				c++;}
			}
		if(c==2){
			System.out.println("yes");
		}else{
			System.out.println("No");
		}
	}
}
