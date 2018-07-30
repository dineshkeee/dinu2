package hunter;
import java.util.*;
public class subString {
		public static void main(String args[]){
			int a,i;
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			String b=in.next();
			if(a%2==0){
		     for(i=0;i<b.length()-1;i++,a++){
		    	 System.out.print(b.substring(i,a)+" "); 
		     }}
			else{
				if(a==1){
					for(i=0;i<b.length();i++,a++){
			    	 System.out.print(b.substring(i,a)+" ");	
				}}
				else{
					for(i=0;i<b.length()-2;i++,a++){
				 	 System.out.print(b.substring(i,a)+" ");
				 	 }
				
			}
		     
		}
}
}