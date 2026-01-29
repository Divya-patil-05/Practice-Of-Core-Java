package Array;

public class Linear_Search {
public static void main(String[] args) {
	int[] arr= {2,4,6,8};
	int key=6;boolean found=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) found=true;
		
	}
	System.out.println(found);
}
}
