package com.marcelomagno.view;

import com.marcelomagno.questao3.Imc;

/**
 * @author Marcelo Magno
 * @Data: 14/03/2015
 * @Versao 1.0
 */
public class ImcView extends ComponentesViewUtil{
	
	public ImcView() {
		
		Imc.calcularIMC(comboBoxPesso(), comboBoxAltura());
		
	}
	
	//TODO Cria combo com valores de peso
	private double comboBoxPesso(){
		String[] valoresCombo = new String[500];
		int valor = 1;
		for(int i=0; i < valoresCombo.length; i++){
			if(valor < 10){
				valoresCombo[i] = "00"+valor+"Kg";
			}else{
				if(valor>9 && valor<100){
					valoresCombo[i] = "0"+valor+"Kg";
				}else{
					valoresCombo[i] = valor+"Kg";
				}
			}
			valor++;
		}
		
		double peso = comboBoxOpcoes(valoresCombo, 0, 3,  "Qual o seu Pesso?", "Questão 3");
		
		return peso;
	}
	
	//TODO Cria combo com valores de altura. Considerar 2,5 metros
	private double comboBoxAltura(){
		String[] valoresCombo = new String[250];
		double valor = 1;
		
		for(int i=0; i < valoresCombo.length; i++){
			valor++;
			
			if(valor < 10){
				valoresCombo[i] = "00"+valor+"cm";
			}else{
				if(valor>9 && valor<100){
					valoresCombo[i] = "0"+valor+"cm";
				}else{
					valoresCombo[i] = valor+"cm";
				}
			}
		}

		double altura = comboBoxOpcoes(valoresCombo, 0, 3,  "Qual sua Altura?", "Questão 3");
		 
		return altura;
	}
	
}
