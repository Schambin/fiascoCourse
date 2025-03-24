package intermediaryModule.Methods;

// uma classe é basicamente o molde de um obj;
// molde de uma pessoa;
public class Person {
    String name;
    String role;
    int age;
    String weapon;
    boolean hasFruit = false;
    boolean hasHaki;
    boolean isAlive;

    public void showProps() {
        System.out.println(this.name);
        System.out.println(this.role);
        System.out.println(this.age);
    }

    /*
     *  após public ou private é o tipo do retorno
     *  nesse caso que é void, nao retorna nada / nenhum dado com tipo;
     */
    public void ActivateHaki() {
        if(hasHaki != true) {
            System.out.println("This person doesnt have haki");
        } else {
            System.out.println(this.name + " Activated Haki");
        }
    }

    /*
     * Função com parametro;
     */
    public String AgeToNavigate(int minimumAgeToNavigate) {
        if(minimumAgeToNavigate < 18) {
            String cantNavigateDueToAge = "This person is too young to navigate";
            return cantNavigateDueToAge;
        } else {
            String goingToTheSea = "This person can navigate";
            return goingToTheSea;
        }
    }
}
