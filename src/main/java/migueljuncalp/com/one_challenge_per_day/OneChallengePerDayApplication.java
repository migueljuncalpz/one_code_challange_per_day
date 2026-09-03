package migueljuncalp.com.one_challenge_per_day;

import dailychallenge.DailyChallenge;
import dailychallenge.Day1;
import dailychallenge.Day2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class OneChallengePerDayApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, DailyChallenge> challenges = new HashMap<>();

        challenges.put(1, new Day1());
        challenges.put(2, new Day2());
        // challenges.put(3, new Day3());

        boolean running = true;

        while (running) {

            printMenu(challenges);

            System.out.print("Elige una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) {
                running = false;
                System.out.println("Saliendo...");
                continue;
            }

            DailyChallenge challenge = challenges.get(option);

            if (challenge == null) {
                System.out.println("Opción no válida.");
                continue;
            }

            challenge.run(scanner);
        }

        scanner.close();
    }

    private static void printMenu(Map<Integer, DailyChallenge> challenges) {

        System.out.println();
        System.out.println("=== RETO DIARIO ===");

        challenges.forEach((day, challenge) ->
                System.out.println(day + ". " + challenge.getName())
        );

        System.out.println("0. Salir");
    }
}
