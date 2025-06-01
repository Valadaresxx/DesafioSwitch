import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Gabriel Valadares";
        String tipoConta = "Conta corrente";
        double saldo = 1500.0;

        String menuInicial = """
                ******************************************
                Dados do inicias do cliente:
                Nome: %s
                Tipo de Conta: %s
                Saldo: %.2f
                ******************************************
                
                """.formatted(nome, tipoConta, saldo);
        String menu = """
                
                Operações
                1- Consutar saldos
                2- Receber valor
                3- Tranferir valor
                4- Sair
                
                Digite a opção desejada:
                
                """;
        System.out.println(menuInicial + menu);
        int escolhaMenu = sc.nextInt();

        switch (escolhaMenu){
            case 1:
                System.out.println("Seu Saldo atual é de " + saldo +"\n"+ menu);
                escolhaMenu = sc.nextInt();
                escolhaMenu = 0;
            case 2:
                System.out.println("Digite o valor que ira receber:");
                int valorRecebido = sc.nextInt();
                saldo += valorRecebido;
                System.out.println(menu+"Seu novo saldo é de " + saldo + menu);
                escolhaMenu = sc.nextInt();
                escolhaMenu = 0;
            case 3:
                System.out.println("Digite o valor que ira transferir:");
                int valorTranferido = sc.nextInt();

                if(valorTranferido <= saldo){
                    saldo -= valorTranferido;
                    System.out.println(menu+"Seu novo saldo é de " + saldo + menu);
                    escolhaMenu = sc.nextInt();
                    escolhaMenu = 0;
                }else{
                    System.out.println("Valor insulficiente, seu saldo é menor, saldo de "+saldo);
                    System.out.println("Digite outro valor:");
                    valorTranferido = sc.nextInt();
                    if (valorTranferido < saldo) {
                        System.out.println("Voce quer tranferir valor maior que o saldo");
                        System.out.println("Programa encerrado!!!!");
                    }
                }

            case 4:
                break;
            default:
                break;
        }

    }
}
