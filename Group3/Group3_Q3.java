// package Group3;
import java.util.*;

 class Group3_Q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int i=0;
        while(i<s.length()){
            char a=s.charAt(i);
            if(a>='a' && a<='z'){
                count+=a-'a'+1;
            }else if(a>='A' && a<='Z'){
                count+=a-'A'+1;
            }
            i++;
        }
        System.out.println(count);
    }
}