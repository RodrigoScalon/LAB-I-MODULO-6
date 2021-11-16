import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Universidade> university = new ArrayList<>();
        boolean cadastro = true;

        while (cadastro) {

            System.out.println();
            System.out.println("***PÁGINA PRINCIPAL***");
            System.out.println("[1] - Cadastrar Universidade Pública.");
            System.out.println("[2] - Cadastrar universidade Privada.");
            System.out.println("[3] - MEC: Exibir todas as informações.");
            System.out.println("[4] - MEC: Exibir Universidade Privada Mais Cara.");
            System.out.println("[5] - MEC: Exibir Universidades Públicas da Região Sul.");
            System.out.println("[0] - Sair do sistema.");
            System.out.print("Entre com a opção desejada: ");
            String opcao = input.nextLine();

            switch (opcao) {

            case "1": {

                System.out.println();
                System.out.println("*** CADASTRO DE UNIVERSIDADE PÚBLICA ***");
                System.out.printf("Nome da Universidade: ");
                String n = input.nextLine();
                System.out.printf("Nome do Estado: ");
                String e = input.nextLine();
                System.out.printf("Nome da Cidade: ");
                String c = input.nextLine();
                System.out.printf("Quantidade de Alunos: ");
                int qA = input.nextInt();
                System.out.printf("Quantidade de Professores: ");
                int qP = input.nextInt();

                university.add(new Publica(n, qA, qP, e, c));

                break;
            }
            case "2": {

                System.out.println();
                System.out.println("*** CADASTRO DE UNIVERSIDADE PRIVADA ***");
                System.out.printf("Nome da Universidade: ");
                String n = input.nextLine();
                System.out.printf("Quantidade de Alunos: ");
                int qA = input.nextInt();
                System.out.printf("Quantidade de Professores: ");
                int qP = input.nextInt();
                System.out.printf("Valor da Mensalidade: ");
                int vM = input.nextInt();

                university.add(new Privada(n, qA, qP, vM));

                break;
            }

            case "3": {

                System.out.println();
                System.out.println("== MEC - INFORMAÇÕES CADASTRADAS ==");

                for (int i = 0; i < university.size(); i++) {
                    Universidade u = university.get(i);
                    System.out.println("UNIVERSIDADES " + i + "|");
                    u.imprimeInfo();
                    u.getClassName();
                 
                }

                break;
            }

            case "4": {
           
                System.out.println();
                System.out.println("== MEC - UNIVERSIDADE PRIVADA MAIS CARA ==");

                for (int i = 0; i < university.size(); i++) {
                    Universidade u = university.get(i);
                    System.out.println("UNIVERSIDADES PRIVADAS " + i + "|");
                    ((Privada) u).maisCara();
                 
                }






                
                break;

            }

            case "5" : {
                    
                    System.out.println();
                    System.out.println("UNIVERSIDADES PÚBLICAS DO SUL: ");

                    for (int i = 0; i < university.size(); i++) {
                        Universidade u = university.get(i);
                        System.out.println("UNIVERSIDADE " + i + "|");
                        //((Publica) u).maisCara();
                     
                    }
    






                break;
            }

            case "0": {
                cadastro = false;
                System.out.println("\tPrograma encerrado pelo usuário!");
            }

            }
        }
        input.close();
    }
}
