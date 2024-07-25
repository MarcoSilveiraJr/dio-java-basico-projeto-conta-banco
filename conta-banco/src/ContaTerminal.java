
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor, digite o número da sua agência: ");
        String Agencia = scanner.nextLine();
        System.out.println();

        System.out.print("Agora digite o número de sua conta: ");
        String numeroContaStr = scanner.nextLine();
        int Numero = Integer.parseInt(numeroContaStr);
        System.out.println();

        System.out.print("Informe seu nome completo: ");
        String NomeCliente = scanner.nextLine();
        System.out.println();

        System.out.print("Informe o valor do depósito inicial: ");
        String saldoStr = scanner.nextLine();
        double Saldo = Double.parseDouble(saldoStr);

        scanner.close();

        DadosCliente cliente = new DadosCliente(Numero, Agencia, NomeCliente, Saldo);

        System.out.println(cliente.toString());
        

    
    }
}
