package Challenge04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Minato = new NinjaBasico("Minato", 32, "Rasengan", true, SkillType.NINJUTSU);
        Minato.mostrarInformacoes();
        Minato.executarHabilidade();
    }
}
