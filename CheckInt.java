package set3;
import java.util.*;
public class CheckInt {
   public static void main(String args[]){
	   Scanner in=new Scanner(System.in);
	   int a=in.nextInt();
	   if(a>=0&&a<=10){
		   System.out.println("YES");
	   }else{
		   System.out.println("No");
	   }
   }
}
