// package Collection Assignment;
import java.util.*;
class UniqueCollection{
    public TreeSet<String> getCollection(String[] ss){
        TreeSet<String> ts=new TreeSet<>();
        for(int i=0;i<ss.length;i++){
            ts.add(ss[i]);
        }
        return ts;
    }
}
public class Q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String [] temp=new String[size];
        for(int i=0;i<size;i++){
            temp[i]=sc.next();
        }
        UniqueCollection uc=new UniqueCollection();
       TreeSet<String> ts= uc.getCollection(temp);
       for(String ss:ts){
        System.out.print(ss+" ");
       }
    }
}
