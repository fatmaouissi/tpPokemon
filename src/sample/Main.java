package sample;
import bo.Tournament;
import bo.Pokemon;

public class Main {

    public static void main(String[] args){


        Tournament Mon_tournoi = new Tournament(4, 10);

        Pokemon bulbasaur = new Pokemon("Bulbasaur",12, 9,
                "bulba", "I'm about to kill you", "oh damn",
                "oh yeah", 3);
        Pokemon Ivysaur = new Pokemon("Ivysaur",12, 9,
                "bulba", "I'm about to kill you", "oh damn I lost",
                "oh yeah", 3);
        Pokemon Pikachu = new Pokemon("Pikachu", 20, 10,
                "pika pika", "I'm about to kill you","oh damn I lost",
                "oh yeah I won!", 7 );
        Pokemon Rondoudou = new Pokemon("Rondoudou", 15, 10,
                "doudou", "I'm about to kill you", "oh damn I lost",
                "oh yeah I won", 4);



        System.out.println("Attribution");

        System.out.println(("Teste toto"));
    }


}
