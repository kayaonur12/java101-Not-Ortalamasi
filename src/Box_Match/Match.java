package Box_Match;

public class Match {

    Fighter f1;
    Fighter f2;


    Match(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;

    }

    boolean isSameClass() {
        if (Math.abs(this.f1.weight - this.f2.weight) < 10) {
            return true;
        } else {
            System.out.println(this.f1.name + " and " + this.f2.name + " are not the same class!");
            return false;
        }
    }


    void matchTime() {
        if (isSameClass()) {
            int i = 1;
            double n = 1 + (int)(Math.random() * 2);

            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==========ROUND " + i + "==========");
                if (n % 2 == 0) {
                    n++;
                    this.f2.giveDamage(this.f1);
                    if (this.f2.isWinner(f1))
                        break;
                }
                if (n % 2 == 1) {
                    n++;
                    this.f1.giveDamage(this.f2);
                    if (this.f1.isWinner(f2))
                        break;
                }
                System.out.println(f1.name + "'s health is: " + f1.health + " and " + f2.name + "'s health is: " + f2.health);
                i++;
            }
        }
    }
}


