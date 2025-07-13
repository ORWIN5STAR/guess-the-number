import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int Answer = 7;
            
            //random answer
            int Answer = Randomizer.nextInt(1, 10);
            int Mexguess = 3;
            boolean Maxguess = false;
            
            for(int i = 1; i <= Mexguess; i++)
            {
                // ask user to guess the number
                int Guess = readInt("Guess number 1-10: ");
                if(Guess == Answer)
                {
                    // if user guess right it will print you win and change
                    // Maxguess value to true
                    System.out.println("you win");
                    Maxguess = true;
                    break;
                }
                else if(Guess < Answer)
                {
                    //if user guess too low it will print too low
                    System.out.println("too low");
                    
                }
                else if(Guess > Answer)
                {
                    //if user guess too high it will print too high
                    System.out.println("too high");
                    
                }
                else if(Guess < 1 || Guess > 10)
                {
                    //else it will print invalid
                    System.out.println("invalid");
                }
            }
            if(Maxguess == false)
            {
                //if user guess wrong 3 times it will print you lose
                System.out.println("you lose");
                System.out.println("the answer is " + Answer);
            }
    }

    public static int readInt(String scanner) {
        Scanner x = new Scanner(System.in);

        System.out.print(scanner);
        int name = x.nextInt(); // Reads the entire line

        return name;
    }
}