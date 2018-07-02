public class gcd{
	public static void main(String []args){
		int n1=25,n2=125;
		int gcd=0;
	for(int i=1;i<n1&&i<n2;++i)	
		
		if(n1%i==0&&n2%i==0)
		{
		gcd=i;
		}
		System.out.println("GCD of number is"+gcd);
	}
	
}