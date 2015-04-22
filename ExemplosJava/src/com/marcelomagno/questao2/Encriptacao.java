package com.marcelomagno.questao2;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Encriptacao {
	
	private static final char[] SEQUENCIA = new char[] {'a','c','d','f','g','i','j','l','o','p','r','t','u','v','x'};
	
	public static String token(String senha){
		String senhaEncriptadaChar = new String();
		
		if(senha == null || senha.length() == 0){
			System.out.println("Digite uma senha para encriptação!");
		}else{
			try {
				char[] senhaArray = senha.toCharArray();
				int contSenhaArray = 0;
				
				for(char s : senhaArray){
					boolean achou = false;
					
					if(contSenhaArray == 0){
						senhaEncriptadaChar = senhaEncriptadaChar.concat(String.valueOf(s));
					}else{
						int cont = 0;
						
						while((cont <= SEQUENCIA.length - 1) && (achou == false)){
							if(s == SEQUENCIA[cont]){
								senhaEncriptadaChar = senhaEncriptadaChar.concat(String.valueOf(cont));
								achou = true;
							}else{
								if(achou == false && cont == SEQUENCIA.length - 1){
									senhaEncriptadaChar = senhaEncriptadaChar.concat(String.valueOf(s));
									achou = true;
								}
							}
							cont++;
						}
					}
					contSenhaArray++;
				}
			} catch (Exception e) {
				System.out.println("Erro durante o processo de encriptação!");
				e.printStackTrace();
			}
		}
		return senhaEncriptadaChar;
	}
}
