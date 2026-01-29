package Array;

public class Sort_Ascending {
public static void main(String[] args) {
	int [] arr= {4,5,2,1,6,3};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int t=arr[i];arr[i]=arr[j]; arr[j]=t;
			}
		}
	}
	for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
}
}
