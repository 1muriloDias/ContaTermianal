import java.util.Scanner;

public class ContaTerminal {

    public static double AddBalance(double saldo, double valor) { //para que o usuário possa adicionar o valor que quiser
        return saldo + valor;
    }

    public static double WithDraw(double saldo, double valor) {//para que o usuario possa sacar o seu saldo, caso tenha algum
        if (valor > saldo) {
            System.out.println("");
            System.out.println("Operação negada!"); //caso o valor do saldo seja <= 0 a operação sera negada
            return saldo;
        }
        return saldo - valor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {  // Loop infinito para reiniciar o programa
            //declaração das arrays
            String ClientName;
            int Number;
            int Agency;
            int Password;
            double Balance = 0;

            System.out.println("=========================");
            System.out.println("Para iniciarmos, digite seu nome abaixo");
            ClientName = scanner.nextLine();
            System.out.println("");
            System.out.println("Olá " + ClientName + ", seja bem-vindo");
            System.out.println("Gostaria de: criar uma conta em nosso banco?");
            System.out.println("1. Criar uma conta ");
            System.out.println("2. Acessar minha conta");
            System.out.println("3. Sair");
            System.out.println("          1/2/3   ");
            System.out.println("");

            int escolha = scanner.nextInt();
            scanner.nextLine();  

            if (escolha == 1) {
                System.out.println("=========================");
                System.out.println("Certo, vamos precisar de alguns dados seus!");
                System.out.println("Escolha uma senha e a digite logo abaixo!");
                System.out.println("ATENÇÃO!! A SENHA DEVE TER ATÉ 4 DÍGITOS!!");
                System.out.println("");
                Password = scanner.nextInt();
                scanner.nextLine();  
                System.out.print("DIGITE SUA SENHA: " + Password);
                System.out.println(".   .   .");
                System.out.println();
                System.out.println("Digite um número de usuário: ");
                Number = scanner.nextInt();
                scanner.nextLine();  
                System.out.println(".   .   .   .   .   .   .   .   .   .   .   .");
                System.out.println("");

                System.out.println(ClientName + " sua conta foi criada!");
                System.out.println("Seu ID de usuário é: " + Number);
                System.out.println("Sua senha é: " + Password);
                System.out.println("");
                System.out.println("Guarde estes dados para conseguir acessar sua conta!!");
                System.out.println("");
                System.out.println("SUA CONTA FOI CRIADA COM SUCESSO");
                System.out.println(""); 
                System.out.println(".   .   .   .   .   .   .   .   .   .   .   .");
                System.out.println("");
                System.out.println("=========================");            
            } else if (escolha == 2) {
                System.out.println("Digite sua senha: ");
                Password = scanner.nextInt();
                scanner.nextLine();  
                System.out.println("");
                System.out.println("================================================"); 
                System.out.println(ClientName + ",");
                System.out.println("Seja bem-vindo");
                System.out.println("");
                System.out.println("Meu saldo: R$ " + Balance);
                System.out.println("");
                System.out.println("Você gostaria de:  ");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Sair");
                System.out.println();
                int choice = scanner.nextInt();
                scanner.nextLine();  
                System.out.println("");

                if (choice == 1) {
                    System.out.println("Digite o valor que deseja depositar:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();  
                    Balance = AddBalance(Balance, valor);  // Chama o método de adicionar saldo
                    System.out.println("Você depositou R$ " + valor + ". Seu novo saldo é: R$ " + Balance);
                } else if (choice == 2) {
                    System.out.println("Digite o valor que deseja sacar:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();  
                    Balance = WithDraw(Balance, valor);  // Chama o método de sacar saldo
                    if (Balance <= 0){
                        System.out.println("SALDO INSUFICIENTE");
                    }else{
                        System.out.println("Você sacou R$ " + valor + ". Seu novo saldo é: R$ " + Balance);
                    }
                    
                } else if (choice == 3) { //caso o user queira deixar o programa
                    System.out.println("Saindo da conta...");
                    break;  // Sai do loop e do programa
                } else {
                    System.out.println("Opção inválida!");
                }
            } else if (escolha == 3) {
                System.out.println("Saindo do programa...");
                break;  // Sai do loop e do programa
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println("\nDeseja voltar ao início? (1 - Sim / 2 - Não)");
            int reiniciar = scanner.nextInt();
            scanner.nextLine();  

            if (reiniciar != 1) {
                System.out.println("Encerrando o programa...");
                break;  // Sai do loop e encerra o programa
            }
        }

        scanner.close();
    }
}
