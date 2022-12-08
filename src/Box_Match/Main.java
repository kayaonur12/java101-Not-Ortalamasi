package Box_Match;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammet Ali", 100, 10, 80, 70);
        Fighter f2 = new Fighter("Mike Tyson", 100, 20, 72,30);

        Match finals = new Match(f1, f2);
        finals.matchTime();
    }


}
