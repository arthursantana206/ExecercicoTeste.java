import java.util.Scanner;

public class BilheteriaAutomatizada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Idade;
        double ValorBase = 40.00;
        double ValorFinal;

        System.out.println("Digite a idade do cliente: ");
        Idade = input.nextInt();
        if (Idade < 12) {
            ValorFinal = ValorBase * 0.25;
        } else if (Idade >= 60) {
            ValorFinal = ValorBase * 0.50;
        } else {
            ValorFinal = ValorBase;
        }
        System.out.println("Valor do ingresso: R$ " + ValorFinal);
            input.close();
    }

}
