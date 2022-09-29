// package OOPS Assignment2;


interface Payment{
      void pay(int p);
}

 class CashPayment implements  Payment{
     public void pay(int p){
        System.out.println("You are paying by CASH.... "+p+" Amount");
     }
}

 class CardPayment implements  Payment{
    public void pay(int p){
        System.out.println("You are paying by CARD...."+p+" Amount");
    }
}
public class Q3 {
    public static void main(String args[]){
        CashPayment cp=new CashPayment();
        cp.pay(50);
        CardPayment cpp=new CardPayment();
        cpp.pay(55);
    }
}
