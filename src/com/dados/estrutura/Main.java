package com.dados.estrutura;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> dados = new ArrayList<>();
		Collections.addAll(dados, 2, 3, 1, 4, 2); // adiciona vários elementos de uma vez
		System.out.println("Dados originais = " + dados);
		
		ArrayList<Integer> dadosBubble = ED.bubbleSort(dados);
		System.out.println("BubbleSort");
		for(int elemento : dadosBubble) {
			
			System.out.printf("%d ", elemento);
			
		}
		
		dados.removeAll(dados); // Esvaziar elementos
		Collections.addAll(dados, 2, 3, 1, 4, 2); // resetar os dados
		System.out.println(dados);
		
		System.out.println("MergeSort");
		ArrayList<Integer> dadosMerge = new ArrayList<>();
		dadosMerge = ED.mergeSort(dados);
		
		for(int elemento : dadosMerge) {
			
			System.out.printf("%d ", elemento);
			
		}

	}

}
