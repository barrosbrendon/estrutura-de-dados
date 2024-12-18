package com.dados.estrutura;

import java.util.ArrayList;
import java.util.List;

public class ED {

static ArrayList<Integer> bubbleSort(ArrayList<Integer> dados) { // ordem crescente
	int tamanhoDoConjunto = dados.size();
	boolean swapped;
	for(int i = 0; i < tamanhoDoConjunto-1; i++) { // Testa até o último index, não tamanho o total (começa em 0)
		swapped = false;
		for(int j=0; j < ((tamanhoDoConjunto-i)-1); j++) {
			
			if(dados.get(j) > dados.get(j+1)) {
				
				int temp = dados.get(j+1); // variável temporária que auxiliar na troca
				dados.set(j+1, dados.get(j));
				dados.set(j, temp);
				swapped = true;
			}	
		}
		
		if(!swapped) {
			break;
		}
	}
	
	return dados;
	}

static ArrayList<Integer> mergeSort(ArrayList<Integer> dados) {
	
	if(dados.size() <= 1) {
		return dados;
		
	}
	
	int meio = dados.size()/2;
	
	ArrayList<Integer> dadosEsquerda = new ArrayList<>(dados.subList(0, meio));
	ArrayList<Integer> dadosDireita = new ArrayList<>(dados.subList(meio, dados.size()));
	
	ED.mergeSort(dadosEsquerda);
	ED.mergeSort(dadosDireita);
	
	ED.merge(dados, dadosEsquerda, dadosDireita);
	
	return dados;
	
	}

static void merge(ArrayList<Integer> dados, List<Integer> dadosEsq, List<Integer> dadosDir ) {
	
	int i = 0, j = 0, k = 0;
	
	while(i < dadosEsq.size() && j < dadosDir.size()) {
		
		if(dadosEsq.get(i) <= dadosDir.get(j)) {
			
			dados.set(k++, dadosEsq.get(i++));
			
		} else {
			
			dados.set(k++, dadosDir.get(j++));
			}
		}
	
	while(i < dadosEsq.size()) {
		
		dados.set(k++, dadosEsq.get(i++));
		
	}
	
	while(j < dadosDir.size()) {
		
		dados.set(k++, dadosDir.get(j++));
		
	}
	
	}

static ArrayList<Integer> quickSort(ArrayList<Integer> dados, int inicio, int fim ) {

	if(inicio < fim) {
		
		int pontoDeDivisao = particionar(dados, inicio, fim);
		ED.quickSort(dados, inicio, pontoDeDivisao-1);
		ED.quickSort(dados, pontoDeDivisao+1, fim);
		
	}
	
	return dados;
	
}

static int particionar(ArrayList<Integer> dados, int inicio, int fim) {
	
	int pivo = dados.get(inicio), posicaoEsquerda = inicio+1, posicaoDireita = fim;
	boolean flag = true;
	
	while(flag == true) {
		
		while(posicaoEsquerda <= posicaoDireita && dados.get(posicaoEsquerda) <= pivo) {
			
			posicaoEsquerda += 1;
			
		}
		while(posicaoDireita >= posicaoEsquerda && dados.get(posicaoDireita) >= pivo) {
			posicaoDireita -= 1;
		}
		
		if(posicaoEsquerda > posicaoDireita) {
			flag = false;
		} else {
			
			int temp = dados.get(posicaoDireita);
			dados.set(posicaoDireita, dados.get(posicaoEsquerda));
			dados.set(posicaoEsquerda, temp);
			
		}
		
	}
	
	int temp = dados.get(inicio);
	dados.set(inicio, dados.get(posicaoDireita));
	dados.set(posicaoDireita, temp);
	return posicaoDireita;
	
}
	
}
