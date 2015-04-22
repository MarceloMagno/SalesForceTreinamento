package com.marcelomagno.questao1;

import java.util.List;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class OrdenaLista {

	/**
	 * Faz a ordenação da lista de inteiros passado como parametro.
	 * Algoritmo de ordenação usado Quick Sort
	 * @param vetor
	 */
	public void ordenar(List<Integer> lista){
		if(!lista.isEmpty()){
			ordenar(lista, 0, lista.size() - 1);
		}else{
			System.out.println("A lista está vazia. Tente novamente!");
		}
	}
	
	private void ordenar(List<Integer> lista, int inicio, int fim){
		if (inicio < fim) {
	         int posicaoPivo = separar(lista, inicio, fim);
	         ordenar(lista, inicio, posicaoPivo - 1);
	         ordenar(lista, posicaoPivo + 1, fim);
	    }
	}
	
	private static int separar(List<Integer> lista, int inicio, int fim) {
	      int pivo = lista.get(inicio);
	      int i = inicio + 1, f = fim;
	      
	      while(i <= f){
	         if(lista.get(i) <= pivo)
	            i++;
	         else if(pivo < lista.get(f))
	            f--;
	         else{
	            int troca = lista.get(i);
	            lista.set(i, lista.get(f));
	            lista.set(f, troca);
	            i++;
	            f--;
	         }
	      }
	      
	      lista.set(inicio, lista.get(f));
	      lista.set(f, pivo);
	      
	      return f;
	 }
}
