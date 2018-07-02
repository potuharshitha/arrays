import java.util.*;
public class merg{
public static void main(String[]args){
	merg m=new merg();
	m.merg1(new int[]{1,2,3},new int[]{4,5,6});
}
public void merg1(int a[],int b[])
{
	int[] c=new int[a.length+b.length];
	int count=0;
	for(int i=0;i<a.length;i++){
		c[i]=a[i];
		count++;
	}
	for(int j=0;j<a.length;j++){
		c[count++]=b[j];
	}
	for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
	}
}
}