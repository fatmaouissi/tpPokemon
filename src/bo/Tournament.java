package bo;

//import bo.Pokemon;
import java.util.ArrayList;
import java.util.Iterator;

public class Tournament {

    int ChallengerMax;
    protected ArrayList<Pokemon> tabPoke;

    public Tournament(int challengerMax, int tabPoke) {
        ChallengerMax = challengerMax;
        this.tabPoke = new ArrayList<>();
    }

    public int getChallengerMax() {
        return ChallengerMax;
    }

    public void setChallengerMax(int challengerMax) {
        ChallengerMax = challengerMax;
    }

    public ArrayList<Pokemon> getTabPoke() {
        return tabPoke;
    }

    public void setTabPoke(ArrayList<Pokemon> tabPoke) {
        this.tabPoke = tabPoke;
    }

    public Pokemon[] fighters (Pokemon player1, Pokemon player2){

        Iterator<Pokemon> pokemonIterator = this.tabPoke.listIterator();
        while (pokemonIterator.hasNext()){
            player1 = pokemonIterator.next();
            player2 = null;
            if(pokemonIterator.hasNext()){
                player2 = pokemonIterator.next();
            }
        }
        Pokemon players[] = { player1, player2};
        return players;
    }
    public Pokemon battle(Pokemon player1, Pokemon player2)
    {
        Pokemon[] players = fighters(player1 , player2);
        player1 = players[0];
        player2 = players[1];
        Pokemon winner = null;
        if (player1.attackStrength < player2.attackStrength){
             winner = player2;
            System.out.println("Player" + player2.name + " a gagné!");
        } else {
            System.out.println("Player" + player1.name + " a gagné!");
            winner = player1;
        }
        return winner;
    }
}
