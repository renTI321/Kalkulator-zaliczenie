import java.util.Objects;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while (!end){
            System.out.println("Podaj pierwszą liczbę: ");
            double value1 = scan.nextDouble();
            System.out.println("Podaj jedno z działani:+,-,*,/.");
            String operator = scan.next();
            System.out.println("Podaj druga liczbę: ");
            double value2 = scan.nextDouble();
            if(operator.equals("+")){
                System.out.println("Odpowiedz to: "+(value1+value2));
            }
            else if (operator.equals("-")){
                System.out.println("Odpowiedz to: "+(value1-value2));
            }
            else if(operator.equals("*")){
                System.out.println("Odpowiedz to: "+(value1*value2));
            }
            else if(operator.equals("/")){
                if (value2 == 0){
                    System.out.println("Nie mozna dzielic przez 0!!!");
                }
                else {
                    System.out.println("Odpowiedz to: " + (value1 / value2));
                }
            }
            else {
                System.out.println("zly operator");
            }

            System.out.println("Nacisnij enter by zakonczyc program lub wpisz dowolny znak by wykonac kolejne dzialanie");
            scan.nextLine();
            String decision = scan.nextLine();

            if (decision.isEmpty()){
                end = true;
            }



    }
}}
