package setthree;
import java.util.*;
public class sentenceCount {
	public static void main(String args[]){
		int i,c=1;
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		char ch[]=a.toCharArray();
		for(i=0;i<ch.length;i++){
			if(ch[i]==46){
				c++;
			}
		}
		System.out.println(c);
	}
}
