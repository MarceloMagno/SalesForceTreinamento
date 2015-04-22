package com.marcelomagno.questao5;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Medicamento {

	private Long codigo;
	private String laboratorio;
	private String nome;
	private String principioAtivo;

	public Medicamento(){

	}

	public Medicamento(Long codigo, String laboratorio, String nome,
			String principioAtivo) {
		super();
		this.codigo = codigo;
		this.laboratorio = laboratorio;
		this.nome = nome;
		this.principioAtivo = principioAtivo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((laboratorio == null) ? 0 : laboratorio.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((principioAtivo == null) ? 0 : principioAtivo.hashCode());
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
		Medicamento other = (Medicamento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (laboratorio == null) {
			if (other.laboratorio != null)
				return false;
		} else if (!laboratorio.equals(other.laboratorio))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (principioAtivo == null) {
			if (other.principioAtivo != null)
				return false;
		} else if (!principioAtivo.equals(other.principioAtivo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medicamento [codigo=" + codigo + ", laboratorio=" + laboratorio
				+ ", nome=" + nome + ", principioAtivo=" + principioAtivo + "]";
	}

}