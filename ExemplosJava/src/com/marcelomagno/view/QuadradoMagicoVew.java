package com.marcelomagno.view;

import com.marcelomagno.questao4.QuadroMagico;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class QuadradoMagicoVew extends ComponentesViewUtil{

	public QuadradoMagicoVew() {
		int tamanho = comboBoxTamanhoDaMatriz(100, "Qual o tamanho da matriz?", "Questão 4");
		int matriz[][] = criaMatriz(tamanho);
		
		if (QuadroMagico.validarQuadradoMagico(matriz, tamanho) == true) {
			System.out.println("A matriz é um quadrado mágico!");
			mostraMatriz(matriz);
		}else{
			System.out.println("A matriz não é um quadrado mágico!");
			mostraMatriz(matriz);
		}
	}
	
	private int[][] criaMatriz(int tamanho){
		int matriz[][] = new int[tamanho][tamanho];
		for(int i=0; i<tamanho; i++){
			for(int j=0; j<tamanho; j++){
				matriz[i][j] = comboBoxValores(100, "Matriz["+i+","+j+"]: ", "Questão 4");
			}
		}
		
		return matriz;
	}
	
	public void mostraMatriz(int matriz[][]){
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
