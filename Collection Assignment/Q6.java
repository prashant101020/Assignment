// package Collection Assignment;
import java.util.*;
class ListManager{
    public List<String> getArrayList(String [] ss){
        return Arrays.asList(ss);
    }
}

public class Q6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the Size");
        int num=sc.nextInt();
        String [] sa=new String[num];
        System.out.println("Input the Array");
        for(int i=0;i<num;i++){
            sa[i]=sc.next();
        }
        ListManager lm=new ListManager();
        List<String> list=lm.getArrayList(sa);
        System.out.println("Elemets as list ==> ");
        System.out.print("{ ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.print("}");
    }
}
