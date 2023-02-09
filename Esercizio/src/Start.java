import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Inserisci due numeri");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci dividendo: ");
        int numeroDividendo = scanner.nextInt();
        System.out.println("Inserisci divisore: ");
        int numeroDivisore = scanner.nextInt();
        try{
            int risultato = numeroDividendo/numeroDivisore;
            System.out.println("Il risultato è: " + risultato);
        }catch (ArithmeticException e){
            if (numeroDivisore == 0) {
                System.out.println("Errore, non è possibile dividere per zero");
            }
            e.printStackTrace();
        }

    }
}
