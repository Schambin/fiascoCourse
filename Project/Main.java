package intermediaryModule.Project;

//Classe é basicamente o *molde* do nosso objeto
public class Main {
    public static void main(String[] args) {
/*
        Pirate Luffy = new Pirate();
            Luffy.name = "Luffy";
            Luffy.age = 13;
            Luffy.crew = "Straw Hat";
            Luffy.role = "Captain";
            Luffy.hasFruit = true;
            Luffy.hasHaki = true;
            Luffy.reward = 3.000000;

            Luffy.ActivateHaki();
            String idade = Luffy.AgeToNavigate(9);
            System.out.println(idade);

        Pirate Nami = new Pirate();
            Nami.hasHaki = false;
            Nami.ActivateHaki();
*/

// -----------------------------------------------------------------------------------------------------------
/*
        Marine Garp = new Marine();
        Garp.name = "Garp";
        Garp.age = 38;
        Garp.weapon = "Fist";
        Garp.hasFruit = false;
        Garp.hasHaki = true;
        Garp.isAlive = true;
        Garp.rank = "Almirant";
        Garp.base = "153° Filial";
        Garp.bountyHunter = false;

        Garp.marineHello();*/

        Pirate kauan = new Pirate();
        kauan.name = "Kauan";
        kauan.role = "programador";
        kauan.age = 21;
        kauan.crew = "Sacudos Crew";
        kauan.reward = 9;

        kauan.showProps();
        kauan.huntPirate();
    }
}
