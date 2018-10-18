package bo;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class Pokemon {

    String name;
    int lifeLevel;
    int powerLevel;
    String shout;
    String fightShout;
    String defeatShout;
    String victoryShout;
    int attackStrength;

    public Pokemon(String name, int lifeLevel, int powerLevel, String shout, String fightShout, String defeatShout, String victoryShout, int attackStrength) {
        this.name = name;
        this.lifeLevel = lifeLevel;
        this.powerLevel = powerLevel;
        this.shout = shout;
        this.fightShout = fightShout;
        this.defeatShout = defeatShout;
        this.victoryShout = victoryShout;
        this.attackStrength = attackStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getShout() {
        return shout;
    }

    public void setShout(String shout) {
        this.shout = shout;
    }
    public String getFightShout() {
        return fightShout;
    }

    public void setFightShout(String fightShout) {
        this.fightShout = fightShout;
    }

    public String getDefeatShout() {
        return defeatShout;
    }

    public void setDefeatShout(String defeatShout) {
        this.defeatShout = defeatShout;
    }

    public String getVictoryShout() {
        return victoryShout;
    }

    public void setVictoryShout(String victoryShout) {
        this.victoryShout = victoryShout;
    }
    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public void attack(Pokemon p){
        if(p.lifeLevel<=0){
            p.lifeLevel=0;
            System.out.println(p.name+ " est mort");
        } else {
            System.out.println("J'attaque! " + shout + "!!" + attackStrength);
            p.lifeLevel -= this.attackStrength;
        }
    }

}
