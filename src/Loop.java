import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do filme");
            double notaFilme = leitura.nextDouble();
            mediaAvaliacao+=notaFilme;
        }

        System.out.println("a nota do filme é: " + mediaAvaliacao/3);


    }
}
