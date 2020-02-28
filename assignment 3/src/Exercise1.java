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

        hourdiff = hour2 - hour1;
        mindiff = minute2 - minute1;

        if(mindiff < 0){
            mindiff += 60;
            hourdiff -=1;
        }
        if(hourdiff < 0){
            hourdiff += 24;
        }
        
        System.out.println(hourdiff + " hours " + mindiff + " minutes\n");
    }
}
