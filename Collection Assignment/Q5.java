// package Collection Assignment;
// import java.uti.*;
import java.util.*;
class ListManager{
    public ArrayList<Integer> removeElements(ArrayList<Integer> l1,ArrayList<Integer> l2){
        
       l1.retainAll(l2);
       return l1;
    }
}
public class Q5 {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> al1=new ArrayList<>();
    ArrayList<Integer> al2=new ArrayList<>();

    System.out.println("Input the First List of Length 5");
    for(int i=0;i<5;i++){
        al1.add(sc.nextInt());
    }
    System.out.println("Input the Second List of Length 5");
    for(int j=0;j<5;j++){
        al2.add(sc.nextInt());
    }
    ListManager lm=new ListManager();
    al1=lm.removeElements(al1, al2);
    System.out.println("Common in both the list");
    for(int i=0;i<al1.size();i++){
        System.out.print(al1.get(i)+" ");
    }
 }   
}
