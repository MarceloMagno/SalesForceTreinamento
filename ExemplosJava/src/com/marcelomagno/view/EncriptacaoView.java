package com.marcelomagno.view;

import javax.swing.JOptionPane;

import com.marcelomagno.questao2.Encriptacao;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class EncriptacaoView {

	public static void encriptarView() {
		String tamanoListaAut = JOptionPane.showInputDialog("Digite a senha para encriptação ");
		System.out.println("Senha encriptada com sucesso .................: "+Encriptacao.token(tamanoListaAut));
		Main.main(null);
	}
}
