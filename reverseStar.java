import java.util.*;
public class reverseStar{
	public static void main(String[] args){
		int n=5;
		for(int i=0;i<n;i++){
			for(int j=2*(n-i);j>=0;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			
		}
	}
}