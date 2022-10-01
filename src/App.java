import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        float centimetros = 0.0f;
        float metros = 0.0f;

        System.out.println("Por favor digite a medida em  metros: ");
        metros = console.nextFloat();

        centimetros = metros * 100;

        System.out.println("A medida em centimetros é: " + String.format("%.2f", centimetros));
    }
}
