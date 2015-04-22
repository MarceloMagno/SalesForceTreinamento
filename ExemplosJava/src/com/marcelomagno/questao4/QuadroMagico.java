package com.marcelomagno.questao4;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class QuadroMagico {

	/**
	 * Se for quadrado magico retorna true se nao retorna false
	 * @param matrizBi Matriz bidirecional
	 * @param tamanho Tamanho da matriz. Ex.: tamanho = 3 (3x3)
	 * @return se true quadrado magico, se false nao he quadrado magico
	 */
	public static boolean validarQuadradoMagico(final int matrizBi[][], int tamanho){
		int vetResultado[] = new int[tamanho + 2];
		int posicaoVetResultado = 0;
		int resultadoSoma = 0;
		
		for(int linha=0; linha<tamanho; linha++){
			for(int coluna=0; coluna<tamanho; coluna++){
				resultadoSoma += matrizBi[linha][coluna];
			}
			vetResultado[posicaoVetResultado] = resultadoSoma;
			posicaoVetResultado ++;
			resultadoSoma = 0;
		}

		int resultadoSomaDiagonalPrincipal = 0;
		int resultadoSomaDiagonalSecundaria = 0;
		int tamanhoDiagonal = tamanho -1;
		
		for(int linha=0; linha<tamanho; linha++){
			//TODO Calcula o valor da diagonal principal
			resultadoSomaDiagonalPrincipal += matrizBi[linha][linha];
			//TODO Calcula o valor da diagonal secundaria
			resultadoSomaDiagonalSecundaria += matrizBi[linha][tamanhoDiagonal];
			tamanhoDiagonal --;
		}
		vetResultado[posicaoVetResultado] = resultadoSomaDiagonalPrincipal;
		posicaoVetResultado ++;
		vetResultado[posicaoVetResultado] = resultadoSomaDiagonalSecundaria;

		return validaSomaResultado(vetResultado);
	}
	
	private static boolean validaSomaResultado(final int[] vetResultado ){
		boolean heIgual = true;
		int cont = 0;
		int xave = vetResultado[cont];
		while(heIgual == true && cont < vetResultado.length){
			if(xave != vetResultado[cont] ){
				heIgual = false;
			}
			cont++;
		}
		return heIgual;
	}
	
}
