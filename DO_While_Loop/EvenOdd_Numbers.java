package DO_While_Loop;

public class EvenOdd_Numbers {
	public static void main(String[] args) {
		int a=1;
		do {
			if(a%2==0) {
				System.out.println(a);
			}
			
			
			a++;
		}
			while(a<=50);
	System.out.println("*******ODD NUMBERS******");
	
	int b=1;
	do {
		if(b%2==1) {
		System.out.println(b);
		}
		b++;
	}
	while(b<=50);
	
}
}
