package clases;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploHashMap {
	private ArrayList<String> cadenas;
	private HashMap<String, String> mensajes;
	public EjemploHashMap(){
		cadenas = new ArrayList<String>();
		mensajes = new HashMap<String,String>();
		
		cadenas.add("Cadena 1");
		cadenas.add("Cadena 2");
		
		mensajes.put("mensaje 1", "Hola que tal");
		mensajes.put("mensaje 2", "Todo bien, todo cool");
		mensajes.put("mensaje 3", "Este es el ultimo mensaje");
		
		//mensajes.remove("mensaje 3");
		
		System.out.println(cadenas.get(0));
		System.out.println(mensajes.get("mensaje 1"));

		for (String key : mensajes.keySet()) {
		    System.out.println("Llave: " + key);
		    System.out.println("Valor: " + mensajes.get(key));
		}
	}
	public static void main(String[] args) {
		new EjemploHashMap();
	}

}
