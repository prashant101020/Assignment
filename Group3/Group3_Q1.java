// package Group3;
import java.util.*;
public class Group3_Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        String s1A[]=s1.split(" ");
        String s2A[]=s2.split(" ");
        String s3A[]=s3.split(" ");
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<s1A.length;i++){
            if(max<s1A[i].length()){
                ind=i;
                max=s1A[i].length();
            }
        }

        for(int i=0;i<max;i++){
          System.out.print(s1A[ind].charAt(i));
          if(i!=max-1){
          for(int j=0;j<i+1;j++){
            System.out.print("*");
          }
        }
        }
        System.out.println();

         max=Integer.MIN_VALUE;
         ind=-1;
        for(int i=0;i<s2A.length;i++){
            if(max<s2A[i].length()){
                ind=i;
                max=s2A[i].length();
            }
        }
        for(int i=0;i<max;i++){
          System.out.print(s2A[ind].charAt(i));
          if(i!=max-1){
          for(int j=0;j<i+1;j++){
            System.out.print("*");
          }
        }
        }
        System.out.println();


         max=Integer.MIN_VALUE;
         ind=-1;
        for(int i=0;i<s3A.length;i++){
            if(max<s3A[i].length()){
                ind=i;
                max=s3A[i].length();
            }
        }
        for(int i=0;i<max;i++){
          System.out.print(s3A[ind].charAt(i));
          if(i!=max-1){
          for(int j=0;j<i+1;j++){
            System.out.print("*");
          }
        }}

    }
}
