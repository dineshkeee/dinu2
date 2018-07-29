package hunter;
import java.util.*;
public class righttri {
   public static void main(String args[]){
	   int a,i,j;
	   Scanner in=new Scanner(System.in);
	   a=in.nextInt();
	   for(i=a-1;i>=0;i--){
		   for(j=i;j>=0;j-- ){
			   System.out.print("1"+" ");
		   }System.out.println("");
	   }
   }
}
