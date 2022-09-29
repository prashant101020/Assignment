// package Group1;
import java.util.*;
public class Group1_Q1 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String fname=sc.next();
    String sname=sc.next();
    double weight=sc.nextDouble();
    double height=sc.nextDouble();
    double bmi=(weight / (height * height));
    System.out.print(fname+" "+sname+" == >");
    if(bmi<18.5){
        System.out.print("Unerweight");
    }else if(bmi<25){
        System.out.print("Normal (Healthy weight");
    }else{
        System.out.print("Obese class");
    }
}
}
