package com.marcelomagno.questao5;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Cpf {
	
	private Long codigo;
	private String cpf;

	public Cpf() {
		// TODO Auto-generated constructor stub
	}
	
	public Cpf(Long codigo, String cpf) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Cpf other = (Cpf) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cpf [codigo=" + codigo + ", cpf=" + cpf + "]";
	}

}
