package dailychallenge;

import java.util.Scanner;

public interface DailyChallenge {
     String getName();
     String getHelp();
     String getGoals();
     void run(Scanner scanner);

}
