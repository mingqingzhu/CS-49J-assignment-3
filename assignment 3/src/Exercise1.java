import java.util.Scanner;

public class Exercise1 {
    private int firstTime;
    private int secondTime;
    private int hour1;
    private int minute1;
    private  int hour2;
    private  int minute2;

    public void timeDiff() {
        int hourdiff = 0;
        int mindiff = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        firstTime = scanner.nextInt();
        hour1 = firstTime / 100;
        minute1 = firstTime % 100;
        System.out.print("Please enter the second time: ");
        secondTime = scanner.nextInt();
        hour2 = secondTime / 100;
        minute2 = secondTime % 100;

        if(hour1 > hour2) {
            hourdiff = hour2 + 24 - hour1;
            if(minute1 > minute2) {
                mindiff = 60 - (minute1 - minute2);
                hourdiff -= 1;
            } else {
                mindiff = minute2 - minute1;
            }
        } else {
            hourdiff = hour2 - hour1;
            if(minute1 > minute2) {
                mindiff = 60 - (minute1 - minute2);
                hourdiff -= 1;
            } else {
                mindiff = minute2 - minute1;
            }
        }
        System.out.println(hourdiff + " hours " + mindiff + " minutes\n");
    }
}
