package level1.exercise6and7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S1_T8_N1EX6and7_Luis_Chicott {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList(); 
		
		list.add(20);
        list.add(35);
        list.add(50);
        list.add(75);
        list.add(90);
        list.add("María");
        list.add("Ana");
        list.add("Luisa");
        list.add("Sofía");
        list.add("Laura");
        list.add("Juan");
        list.add("Pedro");
        list.add("Luis");
        list.add("Carlos");
        list.add("Javier");
        list.add("España");
        list.add("Francia");
        list.add("Alemania");
        list.add("Italia");
        list.add("Reino Unido");
        list.add("Estados Unidos");
        list.add("Brasil");
        list.add("Canadá");
        list.add("México");
        list.add("Argentina");
        
        
        List <String> words = new ArrayList (); 
        
        for (Object obj : list) {
            if (obj instanceof String) {
                words.add((String) obj);
            }
        }
        
        // Ejercicio 6
        
        
        Collections.sort(words, Comparator.comparing(String::length));

        System.out.println("Lista ordenada de cadenas desde la más corta a la más larga: ");
        System.out.println(words);
        
       // Ejercicio 7 
        
        System.out.println("");
        
        Collections.sort(words, Comparator.comparing(String::length).reversed());
        
        System.out.println("Lista ordenada de cadenas desde la más larga a la más corta: ");
        System.out.println(words);
      

	}

}
