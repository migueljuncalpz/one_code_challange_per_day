package dailychallenge;

import java.util.*;

public class Day2 implements DailyChallenge {

    //Día 2 · Eliminar Duplicados

    @Override
    public String getHelp(){
        return("Write a list like this : [item1, item2, item3...]\n all items will be treaten like strings");
    }
    @Override
    public String getName(){
        return("2. Día 2 · Eliminar duplicados");
    }
    @Override
    public String getGoals(){
        return("Eliminar duplicados conservando el orden.\n" +
                "Explicar estructura de datos elegida, complejidad y casos límite.");
    }
    public void run(Scanner scanner) {
        System.out.println(getHelp());
        String text = scanner.nextLine();

        String cleanText = text
                .replace("[", "")
                .replace("]", "");

        List<String> stringList = Arrays.stream(cleanText.split(","))
                .map(String::trim)
                .toList();

        Set<String> uniqueStrings = new LinkedHashSet<>(stringList);
        System.out.println(uniqueStrings);
    }
}
