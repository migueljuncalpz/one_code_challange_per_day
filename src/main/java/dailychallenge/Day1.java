package dailychallenge;

import java.util.HashMap;
import java.util.Scanner;

public class  Day1 implements DailyChallenge {

    //Día 1 · Frecuencias con HashMap

    @Override
    public String getHelp(){
        return("you have to write a string with some words to count the words frequencies in the string");
    }
    @Override
    public String getName(){
        return("1. Día 1 - Frecuencia de palabras");
    }
    @Override
    public String getGoals(){
        return("1. Día 1 - Contar frecuencias de palabras usando HashMap.\n" +
                "Rutina: 5 min requisitos · 25 min solución · 10 min pruebas · 10 min explicación · 5 min notas.saddd" );
    }

    public void run(Scanner scanner){

        HashMap<String,Integer> frec = new HashMap<String,Integer>();
        System.out.println(getHelp());
        String text = scanner.nextLine();
        if(text== null || text.trim().isEmpty())
            return;

        String textoLimpio = text.toLowerCase()
                .replaceAll("[^a-záéíóúüñ\\s]", "");

        //Dividir palabras
        String[] palabras = textoLimpio.split("\\s+");


        for (String palabra : palabras){
            if(!palabra.isEmpty())
                frec.merge(palabra,1,Integer::sum);
        }
        System.out.println(frec);
    }

}
