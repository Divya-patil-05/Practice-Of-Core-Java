package Array;

public class CountPositive$Negative {
public static void main(String[] args) {
	int[] arr= {-1,-3,4,5,-9};
	int pos=0,neg=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=0)pos++;else neg++;
		
	}
	System.out.println(pos+""+neg);
}
}
