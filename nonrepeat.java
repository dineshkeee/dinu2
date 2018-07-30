package hunter;
import java.util.*;
public class nonrepeat {
  public static void main(String args[]){
	  String a;
	  int i,j,c=0;
	  Scanner in=new Scanner(System.in);
	  a=in.next();
	  char ch[]=a.toCharArray();
	  for(i=0;i<ch.length;i++,c=0){
		  for(j=i+1;j<ch.length;j++){
			  if(ch[i]==ch[j]){
	             ch[j]=0;
				  c++;
			  }
		  }
		  if(c==0){
			  System.out.print(ch[i]);
		  }
	  }
  }
}
