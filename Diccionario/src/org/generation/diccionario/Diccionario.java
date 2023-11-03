package org.generation.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Diccionario {

	  public static void main(String[] args) {
		  //Se agregan las palabras en español e ingles de tipo String String
	        HashMap<String, String> diccionario = new HashMap<>();
	        diccionario.put("casa", "house");
	        diccionario.put("perro", "dog");
	        diccionario.put("gato", "cat");
	        diccionario.put("libro", "book");
	        diccionario.put("árbol", "tree");
	        diccionario.put("mesa", "table");
	        diccionario.put("pelota", "ball");
	        diccionario.put("coche", "car");
	        diccionario.put("ciudad", "city");
	        diccionario.put("sol", "sun");
	        diccionario.put("luna", "moon");
	        diccionario.put("comida", "food");
	        diccionario.put("agua", "water");
	        diccionario.put("manzana", "apple");
	        diccionario.put("amarillo", "yellow");
	        diccionario.put("rojo", "red");
	        diccionario.put("verde", "green");
	        diccionario.put("azul", "blue");
	        diccionario.put("blanco", "white");
	        diccionario.put("negro", "black");

	        Scanner scanner = new Scanner(System.in);
	        //Se lleva la cuenta
	        int respuestasCorrectas = 0;
	        int respuestasIncorrectas = 0;
	        //Palabras aleatorias
	        String[] palabrasEspanol = obtenerPalabrasAleatorias(diccionario, 5);

	        System.out.println("Traduce las siguientes palabras al inglés:");
	        //Se le pide al usuario la traduccion
	        for (String palabraEspanol : palabrasEspanol) {
	            System.out.println("Ingresa la traducción de \"" + palabraEspanol + "\":");
	            String respuestaUsuario = scanner.nextLine();
	            String respuestaCorrecta = diccionario.get(palabraEspanol);
	            //Verificar que la respuesta este correcta. Si lo esta se incrementa el contador de respuestas correctas
	            if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
	                respuestasCorrectas++;
	                //Si no es correcto se incrementa el contador de respuestas incorrectas
	            } else {
	                respuestasIncorrectas++;
	            }
	        }

	        System.out.println("Respuestas correctas: " + respuestasCorrectas);
	        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
	    }
	  
	  //Aqui se utiliza para obtener las 5 palabras aleatorias 

	    private static String[] obtenerPalabrasAleatorias(HashMap<String, String> diccionario, int cantidad) {
	      //Arreglo de objetos
	    	Object[] palabrasEspanol = diccionario.keySet().toArray();
	        String[] palabrasAleatorias = new String[cantidad];
	        ThreadLocalRandom random = ThreadLocalRandom.current();

	        for (int i = 0; i < cantidad; i++) {
	            int indiceAleatorio = random.nextInt(palabrasEspanol.length);
	            palabrasAleatorias[i] = (String) palabrasEspanol[indiceAleatorio];
	        }

	        return palabrasAleatorias;
	    }
}
