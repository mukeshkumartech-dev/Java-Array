package arrayprograms;

public class productOfArray {
	public static int productofarray(int ar[]) {
		int prod=1;
		for(int i=0;i<ar.length;i++) {
			prod*=ar[i];
			
		}
		return prod;
	}
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8};
		int res= productofarray(ar);
		System.out.println(res);
	}

}
