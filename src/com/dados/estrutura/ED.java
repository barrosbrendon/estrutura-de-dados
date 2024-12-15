package com.dados.estrutura;

import java.util.ArrayList;

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
	
}
