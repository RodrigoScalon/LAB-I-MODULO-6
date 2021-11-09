import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Universidade> universidade = new ArrayList<>();

        boolean cadastro = true; 

        while (cadastro) {

            System.out.println();
            System.out.println("***PÁGINA DE CADASTRO***");
            System.out.println("[1] - Cadastrar Universidade Pública."); 
            System.out.println("[2] - Cadastrar universidade Privada."); 
            System.out.println("[3] - Mostar todos os dados cadastrados."); 
            System.out.println("[0] - Sair do sistema."); 
            System.out.print("Entre com a opção desejada: ");
            String opcao = input.nextLine(); 

            switch (opcao) {

            case "1": {

                System.out.println();
                System.out.println("*** CADASTRO DE UNIVERSIDADE PÚBLICA ***");
                System.out.printf("Nome da Universidade: ");
                String uni = input.nextLine();
                System.out.println("Nome do Estado: ");
                String estadoPub = input.nextLine();
                System.out.printf("Nome da Cidade: ");
                String cidade = input.nextLine();
                System.out.println("Quantidade de Alunos: ");
                int qA = input.nextInt();;
                System.out.println("Quantidade de Professores: ");
                int qP = input.nextInt();
                break;

                }

            case "2" :{

                System.out.println();
                System.out.println("*** CADASTRO DE UNIVERSIDADE PRIVADA ***");
                System.out.printf("Nome da Universidade: ");
                String estado = input.nextLine();
                System.out.println("Nome do Estado: ");
                String estadoPriv = input.nextLine();
                System.out.printf("Nome da Cidade: ");
                String cidade = input.nextLine();
                System.out.println("Valor da Mensalidade: ");
                System.out.println("Quantidade de Alunos: ");
                int qA = input.nextInt();;
                System.out.println("Quantidade de Professores: ");
                int qP = input.nextInt();

                break;



            }        

            case "0": {

                cadastro = false; 
                System.out.println("\tPrograma encerrado pelo usuário!");
            }

            }
      /*  System.out.println("Você deseja criar uma Universidade [1] Pública ou [2] Privada?");
        System.out.printf("Entre com o código: ");
        Integer codigo = input.nextInt();

        System.out.println("Quantas universidades serão criadas?");
        int qtdeUniversidades = input.nextInt();

        System.out.println("Quantos professores? ");
        System.out.println("Quantos alunos? ");

        System.out.println("Qual o Estado ?");
        System.out.println("Qual a Cidade? ");

        System.out.println("Qual o valor da mensalidade?");

        for (int i = 0; i < universidade.size(); i++) {

            Universidade e = universidade.get(i);
            System.out.println("Informação das Universidades" + e.getQuantAlunos()); */

        }

        input.close();

    }

}
