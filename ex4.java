import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        System.out.println("Digite a nota 1: ");
        float nota1 = console.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = console.nextFloat();
        System.out.println("Digite a nota 3: ");
        float nota3 = console.nextFloat();
        System.out.println("Digite a nota 4: ");
        float nota4 = console.nextFloat();
    
        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4;
    
        System.out.printf("A média é: %.2f", media);
    
        console.close();
    
        }
}
