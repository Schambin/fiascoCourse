package intermediaryModule.AbstractClass;

public class Abstract {
    /*

    Classes abstratas nao podem ser iniciadas, elas servem como um molde fixo para outras classes.
    Tambem pode ser entendida como um contrato que diz o que voce precisa fazer ou como algo precisa ser.

     */
    public static void main(String[] args) {
        // Exemplo de classes abstratas num contexto de Naruto
        // Classe abstrata Ninja
        abstract class Ninja {
            //  Método abstrato que deve ser implementado pelas subclasses
            abstract void realizarJutsu();

            // Método concreto que pode ser compartilhado pelas subclasses
            public void apresentar() {
                System.out.println("Sou um ninja da Vila da Folha.");
            }
        }

        // Subclasse Uzumaki que herda de Ninja
        class Uzumaki extends Ninja {
            @Override
            void realizarJutsu() {
                System.out.println("Uzumaki: Rasengan!");
            }
        }

        // Subclasse Uchiha que herda de Ninja
        class Uchiha extends Ninja {
            @Override
            void realizarJutsu() {
                System.out.println("Uchiha: Sharingan!");
            }
        }

        public class TesteClassesAbstratas {
            public static void main(String[] args) {
                // Criando objetos das subclasses
                Ninja naruto = new Uzumaki(); // Objeto da classe Uzumaki
                Ninja sasuke = new Uchiha();  // Objeto da classe Uchiha

                // Usando os métodos das subclasses
                naruto.apresentar();
                naruto.realizarJutsu();

                sasuke.apresentar();
                sasuke.realizarJutsu();

                // A linha abaixo causaria um erro de compilação, pois Ninja é uma classe abstrata
                // Ninja ninjaGenérico = new Ninja();


            }
        }
    }
}
