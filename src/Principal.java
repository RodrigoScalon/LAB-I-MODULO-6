import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Universidade> university = new ArrayList<>();
        List<Universidade> universityPriv = new ArrayList<>();

        boolean cadastro = true;

        while (cadastro) {
            System.out.println();
            System.out.println("\t*** MENU PRINCIPAL ***");
            System.out.println("-------------------------------------");
            System.out.println("[1] - Cadastrar Universidade Pública.");
            System.out.println("[2] - Cadastrar Universidade Privada.");
            System.out.println(".....................................");
            System.out.println("[3] - MEC: Exibir todas as informações.");
            System.out.println("[4] - MEC: Exibir Universidade Privada mais cara.");
            System.out.println("[5] - MEC: Exibir Universidades Públicas da região sul.");
            System.out.println("-------------------------------------");
            System.out.println("[0] - Encerrar o sistema.");
            System.out.println();
            System.out.print("Entre com a opções desejada # ");
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
                input.nextLine();
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
                universityPriv.add(new Privada(n, qA, qP, vM));
                input.nextLine();

                break;
            }
            case "3": {
                System.out.println();
                for (Universidade u : university) {
                    System.out.println("UNIVERSIDADES : ");
                    u.getClassName();
                    u.imprimeInfo();
                }
                for (Universidade u : universityPriv) {
                    System.out.println("UNIVERSIDADES : ");
                    u.getClassName();
                    u.imprimeInfo();
                }
                break;
            }
            case "4": {
                System.out.println();
                System.out.println("== MEC - UNIVERSIDADE PRIVADA MAIS CARA ==");
                Universidade universidade = Collections.max(universityPriv,
                        Comparator.comparing(s -> s.getValorMensalidade()));
                System.out.println("A universidade mais cara é: " + universidade.getNome() + " - " + "R$ "
                        + universidade.getValorMensalidade());
                break;
            }

            case "5": {
                System.out.println();
                System.out.println("== MEC - UNIVERSIDADES PÚBLICAS DO SUL ==");
                String e1 = new String("RS");
                String e2 = new String("SC");
                String e3 = new String("PR");

                for (Universidade u : university) {

                    if (e1.equals(u.getEstado())) {
                        System.out.println("Nome da Universidade: " + u.getNome() + ", " + " Estado: " + u.getEstado());
                    } else if (e2.equals(u.getEstado())) {
                        System.out.println("Nome da Universidade: " + u.getNome() + ", " + " Estado: " + u.getEstado());
                    } else if (e3.equals(u.getEstado())) {
                        System.out.println("Nome da Universidade: " + u.getNome() + ", " + " Estado: " + u.getEstado());
                    }
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
