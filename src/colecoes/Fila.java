package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
		// Offer e Add -> Adicionam elementos na fila
		// A diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana"); // Retorna false  
		fila.offer("Beatriz"); // Lan�a um exe��o 
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		
		// Peek e Element -> obter o pr�ximo  elemento da fila(sem remover)
		// A diferen�a � o comportamento ocorre 
		//quando a fila est� vazia!
		System.out.println(fila.peek()); // Retorna Null 
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a um exe��o 
		System.out.println(fila.element());
		
		
		
		// Poll e Remove -> obter o pr�ximo  elemento 
		//da fila e remove!
		
		
		// A diferen�a � o comportamento ocorre 
		//quando a fila est� vazia!
		System.out.println(fila.poll()); // Retorna Null 
		System.out.println(fila.remove()); // Lan�a um exe��o 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); 
		
		//fila.size(); 
	    //fila.clear();
		//fila.isEmpty(); 
		//fila.contains(...); 
	}

}
