package Challenge04;

public class NinjaBasico implements Ninja{
    public String name;
    public int age;
    public String skill;
    public boolean alive;

    private SkillType skillType;

    public NinjaBasico(String name, int age, String skill, boolean alive, SkillType skillType){
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.alive = alive;
        this.skillType = skillType;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(
            this.name +
            this.age +
            this.skill +
            this.alive +
            this.skillType
        );
    }

    @Override
    public void executarHabilidade() {
        System.out.println(this.name + " usou " + this.skill);
    }

}
