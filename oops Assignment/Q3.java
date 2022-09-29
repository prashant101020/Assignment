import java.util.*;
class Account{
    int balancemt=0;
    int withdrawamt;
    int depositamt;

    void withdraw(int num){
        this.withdrawamt=num;
        this.balancemt-=num;
   
    }
    void deposit(int num){
        this.depositamt=num;
        this.balancemt+=num;
   
    }
}

public class Q3 {

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Account Ramesh=new Account();
System.out.println("Enter: \n 1 ==> Check Amount \n 2 ==> Deposit \n 3 ==> Withdraw \n 4 ==> Exit");
int num=sc.nextInt();
while(num<4){
    if(num==1){
        System.out.println(Ramesh.balancemt);

    }else if (num==2){
        System.out.println("Enter Amount to deposit");
        int dep=sc.nextInt();
        Ramesh.deposit(dep);
    }else if(num ==3 ){
        System.out.println("Enter Amount to withdraw");
        int wit=sc.nextInt();
        Ramesh.withdraw(wit);
    }else{
        break;
    }
    System.out.println("Enter: \n 1 ==> Check Amount \n 2 ==> Deposit \n 3 ==> Withdraw \n 4 ==> Exit");
    num=sc.nextInt();
}
System.out.println("you completed your Transaction....");
sc.close();
}
}
