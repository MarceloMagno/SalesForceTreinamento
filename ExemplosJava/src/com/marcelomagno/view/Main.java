package com.marcelomagno.view;


/**
 * @author Marcelo Magno
 * @Data: 14/03/2015
 * @Versao 1.0
 */
public class Main {

	public static void main(String[] args) {
		String[] valoresCombo = new String[6];
		int valor = 1;
		for(int i=0; i < valoresCombo.length; i++){
			valoresCombo[i] = "Exercício - "+valor;
			valor++;
		}
		
		ComponentesViewUtil componentesViewUtil = new ComponentesViewUtil();
		int opcao = componentesViewUtil.comboBoxOpcoes(valoresCombo, 12, 13, "Seleciona uma opção", "Prava Java");
		
		switch (opcao) {
			case 0:
				System.out.println("O valor do caracter na posicao passada não corresponde a um valor numerico!");
				System.exit(0);
				break;
			case 1:
				new OrdenaListaView();
				break;
			case 2:
				EncriptacaoView.encriptarView();
				break;
			case 3:
				new ImcView();
				break;
			case 4:
				new QuadradoMagicoVew();
				break;
			case 5:
				Questao5View.getQuestao5();
				break;
			case 6:
				new EncontraPalavraView();
				break;
	
			default:
				break;
		}
		
	}
	
	
}
