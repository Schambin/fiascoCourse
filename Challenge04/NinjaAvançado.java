package Challenge04;

public class NinjaAvançado extends NinjaBasico implements Ninja {
    String specialty;

    private SkillType skillType;

    public NinjaAvançado(String name, int age, String skill, boolean alive, SkillType skillType) {
        super(name, age, skill, alive, skillType);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.specialty);
    }
}
