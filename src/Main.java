
public class Main {

    public static void main(String[] args) {
        Novice novice = new Novice();
        Freshman freshman = new Freshman();
        Sophomore sophomore = new Sophomore();
        Senior senior = new Senior();
        System.out.println("Welcome to The Contest of Fishing.There are 4 contesters.Let's see who will win the contest!");

        novice.Fish();
        freshman.Fish();
        sophomore.Fish();
        senior.Fish();

    }

}
