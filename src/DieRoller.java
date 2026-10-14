import java.util.Random;

public class DieRoller
{
    static void main () {
        Random rnd = new Random();

        int die1, die2, die3, rollCount;

        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("____________________________________________________");

        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        die3 = rnd.nextInt(6) + 1;
        rollCount = 0;

        while (die1 != die2 || die2 != die3) // not all the same conditions
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            rollCount++;
            int sum = die1 + die2 + die3;


            /* System.out.printf("%5d\t%3d\t%3d\t%3d\n", tries, die1, die2, die3); */
            System.out.printf("%-10d%-10d%-10d%-10d%-10d\n", rollCount, die1, die2, die3, sum);


        }
    }
}
