import java.util.Random;

public class ThreeOfAKind
{
    static void main ()
    {
        Random rnd = new Random();
    /*
        int die1, die2, die3, tries;

        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        die3 = rnd.nextInt(6) + 1;
        tries = 0;

        while(die1 != die2 || die2 != die3) // not all the same conditions
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            tries++;

            System.out.printf("%5d\t%3d\t%3d\t%3d\n", tries, die1, tries, die2, die3 );


        }


     */
        for(int c = 1; c <= 10; c++)
        {
            double a = rnd.nextDouble();
            double b = rnd.nextDouble();

            System.out.printf("%8.2f %8.2f",a, b);
            IO.print("\t" + a + "\t" + b + "\n");
        }
    }
}
