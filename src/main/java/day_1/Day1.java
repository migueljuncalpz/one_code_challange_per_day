package day_1;

import java.util.HashMap;

public class  Day1{

    //Día 1 · Frecuencias con HashMap

    public static void printHelp(){
        System.out.println("This is help");
    }

    public static HashMap<String,Integer> wordFrecuency(String text){

        HashMap<String,Integer> frec = new HashMap<String,Integer>();

        if(text == null || text.trim().isEmpty())
            return frec;

        String textoLimpio = text.toLowerCase()
                .replaceAll("[^a-záéíóúüñ\\s]", "");

        //Dividir palabras
        String[] palabras = textoLimpio.split("\\s+");


        for (String palabra : palabras){
            if(!palabra.isEmpty())
                frec.merge(palabra,1,Integer::sum);
        }
        return frec;
    }

}
