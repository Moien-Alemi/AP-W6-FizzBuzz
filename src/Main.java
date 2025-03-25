import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the start number:");
        int start = scanner.nextInt();
        System.out.println("Please enter the end number:");
        int end = scanner.nextInt();

        System.out.println("Please enter the number of divisors:");
        int numberOfDivisors = scanner.nextInt();

        int divisorNumber;
        String divisorName;
        int counter = 1;

        for(int i = 1; i <= numberOfDivisors; i++){
            System.out.println("Please enter divisor" + counter + " :");
            divisorNumber = scanner.nextInt();
            System.out.println("Please enter divisor's name:");
            divisorName = scanner.next();
            new Divisor(divisorNumber, divisorName);
            counter++;
        }

        String result;
        System.out.println("FizzBuzz game:");
        for(int i = start; i <= end; i++) {
            result = "";
            for (Divisor divisor : Divisor.divisorsList) {
                result = result.concat(FizzBuzzMethod(i, divisor));
            }
            if (result.equals(""))
                System.out.println(i);
            else
                System.out.println(result);
        }
    }

    private static String FizzBuzzMethod(int i, Divisor d) {
        if(i % d.getDivisor() == 0){
            return d.getName();
        }
        return "";
    }
}