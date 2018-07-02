//max repeated charecter in string
import java.util.*;
public class stringcom{
public static void main(String[]args){
stringcom p=new stringcom();

p.pp("ihhhhhhhhhhhhhhh");	
}
public void pp(String s){
	char[]arr=s.toCharArray();
	int[]a=new int[128];
	int max=0;
	char mostrep=arr[0];
	for(int i=0;i<arr.length;i++){
		a[i]=0;
	}
	for(int i=0;i<arr.length;i++){
		a[arr[i]]++;
		
			}
		for(int i=0;i<arr.length;i++){
			
				max=a[arr[i]];
				mostrep=arr[i];
				
System.out.print(mostrep+""+max);
			
		}
		
		
}		

		}
	

