package com.marcelomagno.questao5;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class RegistroClinico {

	private Long codigo;
	private String diagnostico;
	private String historico;
	private String queixa;

	public RegistroClinico(){

	}

	public RegistroClinico(Long codigo, String diagnostico, String historico,
			String queixa) {
		super();
		this.codigo = codigo;
		this.diagnostico = diagnostico;
		this.historico = historico;
		this.queixa = queixa;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((diagnostico == null) ? 0 : diagnostico.hashCode());
		result = prime * result
				+ ((historico == null) ? 0 : historico.hashCode());
		result = prime * result + ((queixa == null) ? 0 : queixa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroClinico other = (RegistroClinico) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (diagnostico == null) {
			if (other.diagnostico != null)
				return false;
		} else if (!diagnostico.equals(other.diagnostico))
			return false;
		if (historico == null) {
			if (other.historico != null)
				return false;
		} else if (!historico.equals(other.historico))
			return false;
		if (queixa == null) {
			if (other.queixa != null)
				return false;
		} else if (!queixa.equals(other.queixa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroClinico [codigo=" + codigo + ", diagnostico="
				+ diagnostico + ", historico=" + historico + ", queixa="
				+ queixa + "]";
	}

}