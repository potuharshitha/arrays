import java.util.*;
public class star
{
public static void main(String[] args)
{
	int n=5;
	for(int i=0;i<n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println("");
	}
	for(int i=0;i<n;i++){
		for(int j=n-3;j>=i;j--){
			System.out.print("*");
		}
		System.out.println("");
	}
	
}
}