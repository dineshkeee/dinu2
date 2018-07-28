package set2;
import java.util.*;
public class primeBtwTwoInt {
	public static void main(String args[]){
		int a,b,i,j,c=1;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		for(i=a+1;i<b;i++,c=1){
			for(j=1;j<i;j++){
			if(i%j==0){
				c++;
			}
		}
	if(c==2){System.out.print(i+" ");}}
	}

}
