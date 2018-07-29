package set2;
import java.util.*;
public class factorial {
public static void main(String args[]){
	int a,i,sum=1;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	for(i=1;i<=a;i++){
		sum*=i;
	}
	System.out.println(sum);
}
}
