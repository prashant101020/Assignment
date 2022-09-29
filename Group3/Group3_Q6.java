// package Group3;
import java.util.*;
public class Group3_Q6 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();

        String[] A = ss.split(";");
//		Getting two different Strings
		String a = A[0];	//Shuffled String
		String b = A[1];
        String[] aA = a.split(" ");
		String[] bA = b.split(" ");
        int[] ind = new int[aA.length];
        for (int i = 0; i < bA.length; i++) {
			ind[i] = Integer.parseInt(bA[i]) - 1;
		}
        String[] check = new String[aA.length];
		
		for(int i=0;i<aA.length;i++) {
			check[ind[i]] = aA[i];
		}
        for(int i=0;i<check.length;i++) {
			System.out.print(check[i] + " ");
		}
    }
}
