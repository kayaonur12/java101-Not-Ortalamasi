package Box_Match;

public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    int dodge;
    int dodgeCount = 0;

    Fighter(String name, int health, int damage, int weight, int dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge = dodge;
      //  this.dodgeCount =0;
    }

    void giveDamage(Fighter receiver) {
        if (receiver.health >= this.damage) {
            if (isDodging(receiver)) {
                receiver.dodgeCount++;
                System.out.println(this.name + " threw punch but " + receiver.name + " dodged " + receiver.dodgeCount + " time.");
            } else {
                System.out.println(this.name + " gave " + this.damage + " damage to " + receiver.name + ".");
                receiver.health -= this.damage;
            }
        } else
            receiver.health = 0;
    }

    boolean isWinner(Fighter rival) {
        if (rival.health == 0) {
            System.out.println(rival.name + "(" + rival.health + ") is knocked out :( The winner is " + this.name + "(" + this.health + ")!");
            return true;
        }
        return false;
    }

    boolean isDodging(Fighter receiver) {
        double dodgeRandom = Math.random() * 100;
        return receiver.dodge > dodgeRandom;
    }
}


