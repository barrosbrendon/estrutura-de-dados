package com.dados.estrutura;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> dados = new ArrayList<>();
		
		Collections.addAll(dados, 2, 3, 1, 4, 2); // adiciona vários elementos de uma vez
		
		ArrayList<Integer> dadosOrdenados = ED.bubbleSort(dados);
		
		for(int elemento : dadosOrdenados) {
			
			System.out.printf("%d ", elemento);
			
		}

	}

}
