// package OOPS Assignment2;

abstract class Employee{
    String name;
    int paymentPerHour;
    abstract void CalculateSalary();
}
class Contractor extends Employee{
   int workingHours;
   void CalculateSalary(){
    System.out.println(this.workingHours*10);
   }
}

class FulltimeEmployee extends Employee{
    int workingHours;
    void CalculateSalary(){
        System.out.println(this.workingHours*12);
    }
}
public class Q1 {
    public static void main(String args[]){
        FulltimeEmployee ft=new FulltimeEmployee();
        ft.workingHours=15;
        ft.CalculateSalary();
        Contractor cc=new Contractor();
        cc.workingHours=15;
        cc.CalculateSalary();
    }
}
