package intermediaryModule.Project;

public class Pirate extends Person implements BountyHunters {
    String crew;
    String crewMates;
    double reward;

    public void showProps() {
        System.out.println(this.crew);
        System.out.println(this.crewMates);
        System.out.println(this.reward);
    }

    public void huntPirate() {
        System.out.println("I hunt pirates");
    };
}



