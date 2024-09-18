public class Wrestler {

    String name;
    float wins, losses;

    public Wrestler(String name, float wins, float losses){
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }

    // Calculates the winning average of the wrestler
    public float winPercentage(){

        return (wins*100)/(wins+losses);

    }
}
