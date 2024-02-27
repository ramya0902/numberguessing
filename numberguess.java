import java.util.Random;
import java.util.Scanner;
public class numberguess{
    public static void main(String[] args)
    {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int totscore=0;
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("Total no.of rounds :3");
        System.out.println("Attempts to guess a number in each round:10");
        for(int i=1;i<=3;i++)
        {
            int num=random.nextInt(100)+1;
            int attempt=0;
            System.out.println("Round: "+i+" Guess the number between the range 1 to 100 in 10 attempts.");
            while(attempt<10)
            {
                System.out.println("Enter your guess:");
                int guess_num=sc.nextInt();
                attempt++;
                if(guess_num==num)
                {
                    int score=10-attempt;
                    totscore+=score;
                    System.out.println("Hurray! Number guessed successfully");
                    break;
                }
                else if(guess_num<num)
                {
                    System.out.println("The number is greater than "+guess_num+" Attempts left "+(10-attempt));
                }
                else if(guess_num>num)
                {
                    System.out.println("The number is less than "+ guess_num+" Attempts left "+(10-attempt));
                }
            }
            if(attempt==10)
            {
            System.out.println("Round "+i);
            System.out.println("Attempts=0");
            System.out.println("The Random Number is "+num);
            }

        }
        System.out.println("totalscorce:"+totscore);
        sc.close();
    }
}