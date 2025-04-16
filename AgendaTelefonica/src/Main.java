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
                    "4 - Remover Contato" +
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
                    agendas.getFirst().add(contact.trim());
                    agendas.getFirst().add(1, number);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Voce Apresenta "+agendas.size()+ " contatos em sua Agentas\n");
                    for (ArrayList i : agendas) {
                        System.out.println("Contato: "+i.get(0)+" Numero :"+i.get(1));
                    }
                    break;
                case 4:
                    Boolean noTens = false;
                    System.out.println("Digite o Nome do contato que voce gostaria de excluir\n");
                    String remover = scanner.nextLine();
                    for (ArrayList i : agendas){
                        if (i.contains(remover.trim())){
                            agendas.remove(i);
                            break;
                        }
                        else {
                            noTens = true;
                        }

                    }
                    if (noTens){
                        System.out.println("O contato que voce digitou nao tem na Agenta");
                    }
                    break;
                default:
                    System.out.println("O Numero que voce digitou na Existe");
            }
        }
    }
}
