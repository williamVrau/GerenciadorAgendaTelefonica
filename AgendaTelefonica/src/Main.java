import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList> agendas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        while (isOn) {
            System.out.println("Segue abaixo todas as funcoes do codigo \n" +
                    "0 - Sair do Programa\n" +
                    "1 - Adicionar Novo Mudero de contato\n" +
                    "2 - buscar Telefone por Nome\n" +
                    "3 - Listar Todos os Contatos\n" +
                    "Digite o Numero da funcao");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    isOn = false;
                    break;
                case 1:
                    System.out.println("Digite o Nome do Contatato que voce gostaria de adicionar\n");
                    String contact = scanner.nextLine();
                    System.out.println("Digite o numero do Contatato que voce gostaria de adicionar\n");
                    String number = scanner.nextLine();
                    agendas.addFirst(new ArrayList<>());
                    agendas.getFirst().add(contact);
                    agendas.getFirst().add(1, number);
                    break;
                case 2:
                    break;
                case 3:
                    for (ArrayList i : agendas) {
                        System.out.println(i);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("O Numero que voce digitou na Existe");
            }
        }
    }
}
