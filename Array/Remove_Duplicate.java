package Array;

public class Remove_Duplicate {
public static void main(String[] args) {
int[] arr= {1,2,3,4,4,5};
for(int i=0;i<arr.length;i++) {
	boolean dup=false;
	for(int j=0;j<i;j++) if(arr[i]==arr[j]) dup=true;
	if(!dup) System.out.println(arr[i]);
}
}
}
