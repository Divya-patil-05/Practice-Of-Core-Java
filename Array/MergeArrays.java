package Array;

public class MergeArrays {
public static void main(String[] args) {
	int[] a= {1,2};
	int[] b= {3,4};
	int[] c=new int[a.length+b.length];
	int k=0;
	for(int i=0;i<a.length;i++) c[k++]=a[i];
	for(int i=0;i<b.length;i++) c[k++]=b[i];
	for(int i=0;i<c.length;i++) System.out.println(c[i]);
}
}
