package intermediaryModule.Methods;

public class Marine extends Person{
    String rank;
    String base;
    boolean bountyHunter;

    public String marineHello() {
        String marine = "Marine";
        System.out.println(marine);
        return marine;
    }
}
