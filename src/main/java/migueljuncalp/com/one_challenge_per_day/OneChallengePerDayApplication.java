package migueljuncalp.com.one_challenge_per_day;

import day_1.Day1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class OneChallengePerDayApplication{

    private void exitHelp(){
        System.out.println("Type exit to cancel");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        boolean exit = false;

        while (running) {

            System.out.println();
            System.out.println("=== RETO DIARIO ===");
            System.out.println("1. Día 1 - Frecuencia de palabras");
            System.out.println("2. Día 2 - Próximo reto");
            System.out.println("3. Día 3 - Próximo reto");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");

            exit = false;

            int option = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea
            switch (option) {

                case 1:
                    Day1.printHelp();
                    ;
                    while(!exit) {
                        String line = scanner.nextLine();
                        if (line.equals("exit")) {
                            exit = true;
                        }else {
                            System.out.println(Day1.wordFrecuency(line));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Día 2 todavía no implementado.");
                    break;

                case 3:
                    System.out.println("Día 3 todavía no implementado.");
                    break;

                case 0:
                    running = false;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
