package Group3;
import java.util.*;
import java.text.*;

public class Group3_Q2 {
    public static void main(String args[]){
        

        Period diff = Period.between(
            LocalDate.parse("2016-08-31").withDayOfMonth(1),
            LocalDate.parse("2016-11-30").withDayOfMonth(1));
System.out.println(diff);
    }

}
