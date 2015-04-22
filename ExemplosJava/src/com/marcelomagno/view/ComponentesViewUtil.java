package com.marcelomagno.view;

import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 * @author Marcelo Magno
 * @Data: 14/03/2015
 * @Versao 1.0
 */
public class ComponentesViewUtil {
	
	private final static Logger LOGGER = Logger.getLogger(ComponentesViewUtil.class.getName()); 
	
	/**
	 * ComboBox para determinar o tamanho da matriz. Minimo valor 3 (3x3).
	 * @param qtdElemento
	 * @param mensagem Ex.: Selecione o tamanho da Matriz
	 * @param titulo Ex.: Painel Matriz
	 * @return
	 */
	public int comboBoxTamanhoDaMatriz(int qtdElemento, String mensagem, String titulo){
		String[] valoresCombo = new String[qtdElemento];
		int valor = 3;
		for(int i=0; i < qtdElemento; i++){
			valoresCombo[i] = String.valueOf(valor);
			valor++;
		}
		
		String valorSelecionado = (String) JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE, null, valoresCombo, valoresCombo[0]);
		if(valorSelecionado == null){
			System.out.println("Operacao cancelada!");
			System.exit(0);
		}
		
		return Integer.parseInt(valorSelecionado);
	}
	
	/**
	 * Popula ComboBox com valores inteiro
	 * @param qtdElemento Valores disponíveis na box para selecao
	 * @param mensagem Ex.: Selecione o tamanho
	 * @param titulo Ex.: Painel Opcoes
	 * @return
	 */
	public int comboBoxValores(int qtdElemento, String mensagem, String titulo){
		String[] valoresCombo = new String[qtdElemento];
		int valor = 1;
		for(int i=0; i < qtdElemento; i++){
			valoresCombo[i] = String.valueOf(valor);
			valor++;
		}
		
		String valorSelecionado = (String) JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE, null, valoresCombo, valoresCombo[0]);
		if(valorSelecionado == null){
			System.out.println("Operacao cancelada!");
			System.exit(0);
		}

		return Integer.parseInt(valorSelecionado);
	}
	
	/**
	 * Cria comboBox para selecao de opcoes genericas
	 * @param elemento Ex.: Opcao 1 - Acao 1, Opcao 2 - Acao 2, Opcao 3 - Acao 3 ....  
	 * @param posicaoInicioDoCaracterDeRetorno Posicao do caracter de inicio
	 * @param posicaoFimcioDoCaracterDeRetorno Posicao do caracter fim + 1
	 * @param mensagem Ex.: Selecione a opcao 
	 * @param titulo Ex.: Painel de Opcoes
	 * @return O valor retornado he sempre o ultimo que corresponde ao numero
	 */
	public int comboBoxOpcoes(final String[] elementos, int posicaoInicioDoCaracterDeRetorno, int posicaoFimcioDoCaracterDeRetorno, String mensagem, String titulo){
		String valorSelecionado = (String) JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.QUESTION_MESSAGE, null, elementos, elementos[0]);
		if(valorSelecionado == null){
			System.out.println("Operacao cancelada!");
			System.exit(0);
		}
		
		//TODO retorna a substring que estiver apartir da posicao inicio ate a posicao fim 
		String op = valorSelecionado.substring(posicaoInicioDoCaracterDeRetorno, posicaoFimcioDoCaracterDeRetorno);
		int opcao = 0;

		try {
			opcao = Integer.parseInt(op);
			return opcao;
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		return opcao;
	}
	
}
