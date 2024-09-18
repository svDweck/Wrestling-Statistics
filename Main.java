import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creating wrestlers to populate the HashMap
        Wrestler bruce = new Wrestler("Bruce", 24, 13);
        Wrestler candace = new Wrestler("Candace", 32, 7);
        Wrestler patrick = new Wrestler("Patrick", 13, 6);
        Wrestler nina = new Wrestler("Nina", 44, 21);
        Wrestler hannah = new Wrestler("Hannah", 27, 9);
        Wrestler tony = new Wrestler("Tony", 14, 16);

        // The HashMap that will store the wrestler's statistics
        HashMap<String, Float> stats = new HashMap<>();


        // Populating the HashMap
        stats.put("Bruce", bruce.winPercentage());
        stats.put("Candace", candace.winPercentage());
        stats.put("Patrick", patrick.winPercentage());
        stats.put("Nina", nina.winPercentage());
        stats.put("Hannah", hannah.winPercentage());
        stats.put("Tony", tony.winPercentage());


        // Printing the statistics of the wrestlers
        for(HashMap.Entry<String, Float> i : stats.entrySet()){
            System.out.print(i.getKey() + " has a ");
            System.out.printf("%.2f", i.getValue());
            System.out.print("% chance to win\n");

        }
    }
}