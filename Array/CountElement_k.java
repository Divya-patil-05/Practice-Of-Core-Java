package Array;

public class CountElement_k {
public static void main(String[] args) {
	int[] arr={2,5,7,1}; int k=3, c=0;
	for(int i=0;i<arr.length;i++) if(arr[i]>k) c++;
	System.out.println(c);
	}
}

