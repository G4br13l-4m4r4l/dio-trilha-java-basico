import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da Agência: ");
        int numero = input.nextInt();
        input.nextLine();
        
        System.out.print("Por favor, digite a Agência: ");
        String agencia = input.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = input.nextLine();
        
        double saldo = 0.0;
        System.out.print("Por favor, digite o seu saldo: ");
        String saldoStr = input.nextLine();
        saldo = Double.parseDouble(saldoStr);

        String exibirFraseUsuarioFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";
        System.out.println(exibirFraseUsuarioFinal);
        input.close();
    }
}
