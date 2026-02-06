import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hitpoints;

    DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        int min = scores.get(0);

        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }

        return scores.stream().reduce(0, Integer::sum) - min;
    }

    List<Integer> rollDice() {
        Random gerador = new Random();

        List<Integer> diceResults = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            diceResults.add(gerador.nextInt(6) + 1);
        }

        return diceResults;
    }

    int modifier(int input) {
        double result = (input - 10) / 2.0;
        return (int) Math.floor(result);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
