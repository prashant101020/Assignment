import java.util.*;
class Animal{
  String AnimalType;
  String AnimalName;
  String AnimalColor;
  int AnimalAge;

  void Type(){
  this.AnimalType="mammal";
  System.out.println(AnimalType);
  }

  void Name(){
    this.AnimalName="Rabbit";
    System.out.println(AnimalName);
  }
  void Color(){
    this.AnimalColor="White";
    System.out.println(AnimalColor);
  }
  void Age(){
    this.AnimalAge=3;
    System.out.println(AnimalAge);
  }
}


public class Q1 {
    public static void main(String [] args){
        Animal rabbit=new Animal();
        rabbit.Type();
        rabbit.Name();
        rabbit.Color();
        rabbit.Age();
    }
}
