package Array;

public class Replace_NegativeWith0 {
	public static void main(String[] args){
		  int[] arr={-1,3,-4,5};
		  for(int i=0;i<arr.length;i++){
		   if(arr[i]<0) arr[i]=0;
		  }
		  for(int i=0;i<arr.length;i++) System.out.println(arr[i]);
		 }
}
