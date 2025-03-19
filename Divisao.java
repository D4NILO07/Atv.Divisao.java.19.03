import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite x: ");
            int x = sc.nextInt();
            System.out.print("Digite y: ");
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("Resultado: " + z);

        } catch (InputMismatchException e) {
            System.out.println("Fromato inválido!");
            System.out.println("Detalhes do erro: "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Operação inválida!");
            System.out.println("Detalhes do erro: "+ e.getMessage());
        } finally {
            System.out.println("Conexão estabelecida");
        }
        
        sc.close();
    } 
    
}
