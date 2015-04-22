package com.marcelomagno.questao5;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Sexo {
	
	private Long codigo;
	private String sexo;
	
	public Sexo() {
		// TODO Auto-generated constructor stub
	}

	public Sexo(Long codigo, String sexo) {
		super();
		this.codigo = codigo;
		this.sexo = sexo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Sexo other = (Sexo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sexo [codigo=" + codigo + ", sexo=" + sexo + "]";
	}
	
}
