// package OOPS Assignment2;

class Cat{
    String mood;
    String hungry;
    String energy;
    public void play(){
        this.mood="Play";
    }
    public void feed(){
        this.hungry="Hungry Please Feed...";
    }

    public void Sleep(){
        this.energy="Energy is low..Sleep";
    }
    private void meow(){
        this.mood="Meow";
    }
    // meow();
}
public class Q2 {
    public static void main(String[] args){
        Cat pp=new Cat();
        pp.play();
        System.out.println(pp.mood);
    }
}
