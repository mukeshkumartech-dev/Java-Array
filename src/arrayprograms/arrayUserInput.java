package arrayprograms;
import java.util.Scanner;
public class arrayUserInput {

	public static void main(String[] args) {
         int ar[]=new int[8];
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<ar.length;i++) {
        	 System.out.println("Enter the index:"+i);
        	   ar[i]=sc.nextInt();
         }
         System.out.println(" --------------------------");
         for(int i=0;i<ar.length;i++) {
        	 System.out.println(ar[i]);
         }
         sc.close();
	}
	

}
