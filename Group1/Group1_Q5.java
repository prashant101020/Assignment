// package Group1;
import java.util.*;

class Film{
    String name;
    String lead_actor;
    String category;
    int duration;
    String language;
   
    ///Paraameterized constructor....
    Film(String num, String lang, String actor, String cat, int dur){
        name = num;
        duration = dur;
        language = lang;
        lead_actor = actor;
        category = cat;
       
    }

    Film(){
        name = null;
        language = null;
        lead_actor = null;
        category = null;
        duration = 0;
    }

  
}

//Group1_5 is same as the FilmMain....
public class Group1_Q5 {
    public static void main(String[] args) {

        Film films;
        ArrayList<Film> Films = new ArrayList<Film>();

        films = new Film();
        films.name = "ABCD!";
        films.language = "English";
        films.lead_actor = "Arnold";
        films.duration = 10;
        films.category = "Action";
        Films.add(films);

        films = new Film();
        films.name = "ABCD!2";
        films.language = "English";
        films.lead_actor = "Arnold";
        films.duration = 20;
        films.category = "Action";
        Films.add(films);

        films = new Film();
        films.name = "ABCD!3";
        films.language = "English";
        films.lead_actor = "Rajini";
        films.duration = 10;
        films.category = "Comedy";
        Films.add(films);

        films = new Film();
        films.name = "ABCD!4";
        films.language = "English";
        films.lead_actor = "Rajini";
        films.duration = 30;
        films.category = "Comedy";
        Films.add(films);

        int min =Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            films = Films.get(i);
            if(films.lead_actor.equals("Arnold"))
                if(films.duration < min){
                    min = films.duration;
                    imin = i;
                }
            if(films.category.equals("Comedy"))
                System.out.println(films.name + " is a Comedy movie");
        }

        films = Films.get(imin);
        System.out.println("Shortest Arnold film is " + films.name + " and duration: " + min);
    }
}
