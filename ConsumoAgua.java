import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double consumototal;
        int moradores;
        double media;

        System.out.println("Digite o consumo total de água (em litros): ");
        consumototal = input.nextDouble();

        System.out.println("Digite o número de moradores: ");
        moradores = input.nextInt();

        media = consumototal / moradores;

        if (media > 110) {
            System.out.println("Consumo elevado: Reduza o consumo de água.");
        } else {
            System.out.println("Parabéns! Seu consumo de água está dentro do recomendado.");
        }

        input.close();
    }
}