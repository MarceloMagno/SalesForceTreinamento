package com.marcelomagno.questao6;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class EcontraPalavra {

	private static final int HASH = 7;
	private static final int FACTOR = 37;
	private static final String LETTERS = "acdegilmnoprstuw";

	
	@SuppressWarnings("unused")
	private static long getHash(String s) {
		long h = HASH;
		int lLen = s.length();
		for (int i = 0; i < lLen; i++){
			h = h * FACTOR + LETTERS.indexOf(s.charAt(i));
		}
		return h;
	}
	
	/**
	 * Recebe um hash como parametro e retorna uma string opós executar chamada recursiva 
	 * @param hash 
	 * @return Retorna uma string (fraze)
	 */
	public static String validaHash(long hash){ 
		String s = "";
		if(hash <= HASH){
			return s;
		}

		int findChr = (int) (hash % 37);
		long remainHash = hash / 37;

		return validaHash(remainHash) + LETTERS.charAt(findChr);
	}
	
}
