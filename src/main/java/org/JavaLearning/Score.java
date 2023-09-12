/*Build Score Application
        1. The application should be a console application (No need to use JavaFX)
        2. It accepts scores for matches per match (max 5 matches) from the console.
        3. The application terminates if the score value is less than 0
        4. After terminations print:
        - Total Score,
        - Number of Matches,
        - Average score per match
        5. Submit your code in the Github repository and share the link in the discord channel. */
import java.util.Scanner;

public class Score
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Match Leaderboard");
        System.out.println("Have You Play the  Match - (Y/N)");
        Scanner scanner =new Scanner(System.in);
        String input=scanner.next();
        if(input.equalsIgnoreCase("y"))
        {
            int TotalMatches = 0;
            int TotalScore = 0;
            float AverageScore = 0.0f;
            while (TotalMatches <5)
            {
                System.out.println("Number of Score Obtain in " + (TotalMatches+1) + " Match is = ");
                int Score = scanner.nextInt();
                if (Score <=0)
                {
                    break;
                }
                TotalScore += Score;
                TotalMatches++;
            }
            System.out.println("Total Number of Score obtained in a Match is " +TotalScore);
            System.out.println("Total Number of Matches Played " +TotalMatches);
            AverageScore = (TotalScore/TotalMatches);
            System.out.println("Average Score of a Total Match is " +AverageScore);
        }
        else
        {
            System.out.println("You Dont Play Any Match!");
        }
    }
}
