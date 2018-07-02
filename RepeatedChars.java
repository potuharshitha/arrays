//repeated charecters in string
import java.util.*;
public class RepeatedChars{
public static void main(String[]args){
RepeatedChars p=new RepeatedChars();

p.charCount("ididihhbdffd");	
}
public void charCount(String s){
	char[]arr=s.toCharArray();
	int[]a=new int[128];
	int c=0;
	for(int i=0;i<arr.length;i++){
		a[i]=0;
	}
	for(int i=0;i<s.length();i++){
		a[arr[i]-'a']++;		
			}
		for(int i=0;i<a.length;i++){
			if(a[i]>1){
				c++;		
			}		
		}
System.out.println("Total no. of repeted charecters"+c);		
		}
	}//System.out.println(c);
	

