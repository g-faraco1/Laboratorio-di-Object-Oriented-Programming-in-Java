import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Inserisci bet : ");
            bet = in.nextDouble();

            System.out.println("Inserisci n:");
            int n = in.nextInt();

            if (bet < playerAccount.getBalance() && bet < (casinoAccount.getBalance() / 5)) {
                Random random = new Random();
                int randomNumber = random.nextInt(7);
                System.out.println("Numero del dado uscito : " + randomNumber);
                if (n == randomNumber) {
                    double win = bet * 5;
                    casinoAccount.withdraw(win);
                    playerAccount.deposit(win);
                    System.out.println("Hai vinto " + win + ".");
                } else {
                    playerAccount.withdraw(bet);
                    casinoAccount.deposit(bet);
                    System.out.println("Hai perso " + bet + ".");
                }
            }else{
                System.out.println("Scommessa non valida");
            }
            if (playerAccount.getBalance() > 0) {
                System.out.println("Vuoi continuare?");
                choice = in.next();
            }else{
                System.out.println("Saldo insufficiente");
            }
        }while(choice.equals("si"));

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());
    }
}