import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {
        if(input == "S" || input == "SI" || input == "OK" || input == "certo" || input == "perchè no?"){
            return "OK";
        }else if(input == "N" || input == "No"){
            return "Fine";
        }else{
            return "Dato non corretto";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}