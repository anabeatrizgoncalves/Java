package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
		// Offer e Add -> Adicionam elementos na fila
		// A diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // Retorna false  
		fila.offer("Beatriz"); // Lança um exeção 
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		
		// Peek e Element -> obter o próximo  elemento da fila(sem remover)
		// A diferença é o comportamento ocorre 
		//quando a fila está vazia!
		System.out.println(fila.peek()); // Retorna Null 
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança um exeção 
		System.out.println(fila.element());
		
		
		
		// Poll e Remove -> obter o próximo  elemento 
		//da fila e remove!
		
		
		// A diferença é o comportamento ocorre 
		//quando a fila está vazia!
		System.out.println(fila.poll()); // Retorna Null 
		System.out.println(fila.remove()); // Lança um exeção 
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
