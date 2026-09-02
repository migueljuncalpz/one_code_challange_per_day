package dailychallenge.day_1;

import dailychallenge.DailyChallenge;

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
