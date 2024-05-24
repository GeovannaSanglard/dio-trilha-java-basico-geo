import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Consumir a nova linha deixada pelo nextInt()
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu Saldo:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final com os dados fornecidos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}

