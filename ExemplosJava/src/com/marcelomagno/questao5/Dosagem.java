package com.marcelomagno.questao5;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Dosagem {

	private Long codigo;
	private String frequencia;
	private int quantidade;
	public Medicamento m_Medicamento;
	public RegistroClinico m_RegistroClinico;

	public Dosagem(){

	}

	public Dosagem(Long codigo, String frequencia, int quantidade,
			Medicamento m_Medicamento, RegistroClinico m_RegistroClinico) {
		super();
		this.codigo = codigo;
		this.frequencia = frequencia;
		this.quantidade = quantidade;
		this.m_Medicamento = m_Medicamento;
		this.m_RegistroClinico = m_RegistroClinico;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Medicamento getM_Medicamento() {
		return m_Medicamento;
	}

	public void setM_Medicamento(Medicamento m_Medicamento) {
		this.m_Medicamento = m_Medicamento;
	}

	public RegistroClinico getM_RegistroClinico() {
		return m_RegistroClinico;
	}

	public void setM_RegistroClinico(RegistroClinico m_RegistroClinico) {
		this.m_RegistroClinico = m_RegistroClinico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((frequencia == null) ? 0 : frequencia.hashCode());
		result = prime * result
				+ ((m_Medicamento == null) ? 0 : m_Medicamento.hashCode());
		result = prime
				* result
				+ ((m_RegistroClinico == null) ? 0 : m_RegistroClinico
						.hashCode());
		result = prime * result + quantidade;
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
		Dosagem other = (Dosagem) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (frequencia == null) {
			if (other.frequencia != null)
				return false;
		} else if (!frequencia.equals(other.frequencia))
			return false;
		if (m_Medicamento == null) {
			if (other.m_Medicamento != null)
				return false;
		} else if (!m_Medicamento.equals(other.m_Medicamento))
			return false;
		if (m_RegistroClinico == null) {
			if (other.m_RegistroClinico != null)
				return false;
		} else if (!m_RegistroClinico.equals(other.m_RegistroClinico))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dosagem [codigo=" + codigo + ", frequencia=" + frequencia
				+ ", quantidade=" + quantidade + ", m_Medicamento="
				+ m_Medicamento + ", m_RegistroClinico=" + m_RegistroClinico
				+ "]";
	}

	
}