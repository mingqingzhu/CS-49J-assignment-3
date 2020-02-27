import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Choose the exercise:\n" +
                    "1. Exercise 1\n" +
                    "2. Exercise 2\n" +
                    "3. Extra exercise\n" +
                    "4. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Exercise1 exercise1 = new Exercise1();
                exercise1.timeDiff();
            } else if (choice == 2) {
                System.out.println("Please enter the notation: ");
                String notation = scanner.next();
                Card card = new Card(notation);
                String output = card.getDescription();
                System.out.println(output);
            } else if (choice == 3) {
                System.out.println("Please enter html to check: ");
                String str = scanner.next();
                Exercise3 exercise3 = new Exercise3(str);
                exercise3.check();
            } else if (choice == 4){
                flag = false;
            } else {
                System.out.println("Your selection is invalid!");
            }
        } while(flag);
    }
}
