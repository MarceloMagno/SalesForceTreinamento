package com.marcelomagno.questao3;

/**
 * @author Marcelo Magno
 * @Data: 14/03/2015
 * @Versao 1.0
 */
public class Imc {
	
	private static final double CENTIMETRO_FAOR = 0.010000;
	
	public static void calcularIMC(double aPeso, double aAltura) {
		double alturaEmMetro = aAltura * CENTIMETRO_FAOR;
		
		calculoIMC(aPeso, alturaEmMetro);
	}
	
	/**
	 * Faz o calculo do imc usando como parametro o atributo pesso e altura
	 * @param aPeso
	 * @param aAltura
	 */
	private static void calculoIMC(double aPeso, double aAltura) {
		try {
			String situacao = "";
			if(aPeso <= 0){
				System.out.println("Favor informa o peso corretamente!");
			}else{
				if(aAltura <= 0){
					System.out.println("Favor informa o altura corretamente!");
				}else{
					Double lIMC = aPeso / (aAltura * aAltura);
					if(lIMC <20){
						situacao = "Abaixo do peso";
					}else{
						if(lIMC >= 20 && lIMC < 25){
							situacao = "Peso Normal";
						}else{
							if(lIMC >= 25 && lIMC < 30){
								situacao = "Acima do peso";
							}else{
								if(lIMC >= 30 && lIMC < 34){
									situacao = "Obeso";
								}else{
									if(lIMC > 34){
										situacao = "Muito Obeso";
									}
								}
							}
						}
					}
					
					System.out.printf("\n\n*********************************************");
					System.out.printf("\nIMC = peso / (altura * altura)\n");
					System.out.printf("*--------------------------------------------");
					System.out.printf("\n*Situacao");
					System.out.printf("\n*--------------------------------------------");
					System.out.printf("\n*IMC menor que 20            - Abaixo do peso");
					System.out.printf("\n*IMC maior que 20 e menor 25 - Peso Normal");
					System.out.printf("\n*IMC maior que 25 e menor 30 - Acima do peso");
					System.out.printf("\n*IMC maior que 30 e menor 34 - Obeso");
					System.out.printf("\n*Acima de 34     Muito Obeso");
					System.out.printf("\n*--------------------------------------------");
					System.out.printf("\n*IMC calculado = %.2f", lIMC);
					System.out.printf("\n*Situacão = "+situacao);
				}
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao tenta calcular IMC!");
			e.printStackTrace();
		}
	}
}
