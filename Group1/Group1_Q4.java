// package Group1;

import java.util.ArrayList;

class StudentGrade{
  void  determineGrade(String registerNumber, ArrayList<Float> marks){
        if(marks.size()==0){
            System.out.println("You have not rgistered for any course");
        }else{
            int count=0;
            for(int i=0;i<marks.size();i++){
                float num=marks.get(i);
            if(num>90.0){
                System.out.println("Grade: S");
                count++;
            }else if(num>80.0){
                System.out.println("Grade: A");
            }else if(num>70.0){
                System.out.println("Grade: B");
            }else if(num>60.0){
                System.out.println("Grade: C");
            }else if(num>55.0){
                System.out.println("Grade: D");
            }else if(num>50.0){
                System.out.println("Grade: E");

            }else{
                System.out.println("Grade: F");
            }
            }

            System.out.println("Total number of S is "+count);
        }
    }
}
public class Group1_Q4 {
 public static void main(String args[]){
    StudentGrade ss=new StudentGrade();
 ArrayList<Float> al=new ArrayList<>();
 al.add((float)48.3);
 al.add((float)91.2);
 al.add((float)76.5);
 al.add((float)21.2);
 ss.determineGrade("registerNumber", al);
 }   
}
