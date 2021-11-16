//Autor: Rodrigo Mariano Scalon Fraga - Unisinos 2021/2 - Desafio módulo 6 - Laboratório I.
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
            System.out.println("***PÁGINA INICIAL***");
            System.out.println("[1] - Cadastrar Universidade Pública.");
            System.out.println("[2] - Cadastrar Universidade Privada.");
            System.out.println("[3] - Informações do MEC.");
            System.out.println("[0] - Sair do sistema.");
            System.out.print("Entre com a opção desejada: ");
            String opcao = input.nextLine();

            switch (opcao) {


            case "1": {

                System.out.println();
                System.out.println("*** CADASTRO DE UNIVERSIDADE PÚBLICA ***");
                System.out.printf("Nome da Universidade: ");
                String nome = input.nextLine();
                System.out.printf("Nome do Estado: "); //RS SC PR
                String estado = input.nextLine();
                System.out.printf("Nome da Cidade: ");
                String cidade = input.nextLine();
                System.out.printf("Quantidade de Alunos: ");
                int quantAlunos = input.nextInt();
                System.out.printf("Quantidade de Professores: ");
                int quantProfessores = input.nextInt();

                Universidade uni = new Universidade(nome, estado, cidade, quantAlunos, quantProfessores);
                university.add(uni);
                input.nextLine();

                 break;



            }
            case "2": {

                

            
            }

            case "3": {

                    for (int i = 0; i < university.size(); i++) {
                    Universidade c = university.get(i);
                    System.out.println("Universidades");
                     c.imprimeInfo();                    

                 }


                break;

                }


            case "0": {

                cadastro = false;
                System.out.println("\tPrograma encerrado pelo usuário!");
            }
        
        
        }
            }
    
        }
    }
    

