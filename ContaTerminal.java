public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de variáveis
        int numeroConta;
        int numeroAgencia;
        String nomeCliente;
        double saldo;

        // Criação do objeto Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados ao usuário
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência: ");
        numeroAgencia = scanner.nextInt(); 
        
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next(); 
        
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble(); 

        // Exibir a mensagem de conta criada
        System.out.println("Conta criada com sucesso!");
    }
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Número da agência: " + numeroAgencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo da conta: " + saldo);

        // Fechar o scanner
        scanner.close(); 
   
}
