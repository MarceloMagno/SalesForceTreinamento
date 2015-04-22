package com.marcelomagno.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import com.marcelomagno.questao1.OrdenaLista;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class OrdenaListaView extends ComponentesViewUtil{
	private static List<Integer> listaInteiros;
	private static Random geraValoresRandom = new Random();

	public OrdenaListaView() {
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja gerar a lista de valores automáticamente?");
		
		switch (opcao) {
			case 0:
				int listSizeAut = comboBoxValores(1000, "Selecione o tamanho do Lista ", "Questão 1");
				criarVetorAutomaticamente(listSizeAut);
				saidaView();
				break;
				
			case 1:
				int listSizeManu = comboBoxValores(1000, "Selecione o tamanho do Lista ", "Questão 1");
				criarVetorManual(listSizeManu);
				saidaView();
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "Operação finalizada com sucesso!");
				break;
	
			default:
				break;
		}
	}
	
	private static void saidaView(){
		System.out.println("\n*--------------------------- Lista Criada ------------------------------------*");
		System.out.println("Tamanho ..........: "+listaInteiros.size()+"\n");
		int indexCriada = 0;
		for(int valor : listaInteiros){
			indexCriada++;
			System.out.println("Valor - "+indexCriada+" ........: "+valor);
		}
		
		OrdenaLista ordenaVetor = new OrdenaLista();
		ordenaVetor.ordenar(listaInteiros);
		
		System.out.println("\n\n*----------------- Lista ordenada em ordem Crescente ------------------------*");
		System.out.println("Tamanho ..........: "+listaInteiros.size()+"\n");
		int indexOrdenada = 0;
		for(int valor : listaInteiros){
			indexOrdenada++;
			System.out.println("Valor - "+indexOrdenada+" ........: "+valor);
		}
		
		System.out.println("\n\n*----------------- Lista impressa em ordem Decrescente ----------------------*");
		System.out.println("Tamanho ..............: "+listaInteiros.size()+"\n");
		for(int i = listaInteiros.size() - 1; i >= 0; i--){
			int index = i+1;
			System.out.println("Índice - "+ index +" ..... Valor: "+listaInteiros.get(i));
		}
	}
	
	/**
	 * Cria um vetor com o tamanho do parametro passado e o preenche
	 * com valores aleatórios entre 1 e 1000.
	 * @param tamanho
	 */
	private static void criarVetorAutomaticamente(int tamanho){
		listaInteiros = new ArrayList<Integer>();
		for(int i = 0; i < tamanho; i++){
			listaInteiros.add(0 + geraValoresRandom.nextInt(1000));
		}
	}
	
	/**
	 * Cria um vetor com o tamanho do parametro passado e o preenche
	 * com valores informado pelo usuário.
	 * @param tamanho
	 */
	private void criarVetorManual(int tamanho){
		listaInteiros = new ArrayList<Integer>();
		for(int i = 0; i < tamanho; i++){
			int index = i+1;
			int listSizeAut = comboBoxValores(1000, "Valor "+index, "Questão 1");
			listaInteiros.add(listSizeAut);
		}
	}

}
