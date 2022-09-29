// package Group1;
import java.util.*;
 class Group1_Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Input to guess the number");
    int num=sc.nextInt();
    int check= (int)(Math.random() * (100 - 0 + 1) + 0);
    if(num==check){
        System.out.println("Congratulations! you got it..");
    }  else if(num<check){
        System.out.println("Too Lower..");
    }else{
        System.out.println("Too Higher...");
    }
    }
}
