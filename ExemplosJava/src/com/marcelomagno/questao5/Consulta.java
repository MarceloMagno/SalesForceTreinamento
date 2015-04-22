package com.marcelomagno.questao5;

import java.sql.Time;
import java.util.Date;


/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Consulta {

	private Long codigo;
	private Date data;
	private Time hora;
	private String planoSaude;
	public Medico m_Medico;
	public RegistroClinico m_RegistroClinico;

	public Consulta(){

	}

	public Consulta(Long codigo, Date data, Time hora, String planoSaude,
			Medico m_Medico, RegistroClinico m_RegistroClinico) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.hora = hora;
		this.planoSaude = planoSaude;
		this.m_Medico = m_Medico;
		this.m_RegistroClinico = m_RegistroClinico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result
				+ ((m_Medico == null) ? 0 : m_Medico.hashCode());
		result = prime
				* result
				+ ((m_RegistroClinico == null) ? 0 : m_RegistroClinico
						.hashCode());
		result = prime * result
				+ ((planoSaude == null) ? 0 : planoSaude.hashCode());
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
		Consulta other = (Consulta) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (m_Medico == null) {
			if (other.m_Medico != null)
				return false;
		} else if (!m_Medico.equals(other.m_Medico))
			return false;
		if (m_RegistroClinico == null) {
			if (other.m_RegistroClinico != null)
				return false;
		} else if (!m_RegistroClinico.equals(other.m_RegistroClinico))
			return false;
		if (planoSaude == null) {
			if (other.planoSaude != null)
				return false;
		} else if (!planoSaude.equals(other.planoSaude))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consulta [codigo=" + codigo + ", data=" + data + ", hora="
				+ hora + ", planoSaude=" + planoSaude + ", m_Medico="
				+ m_Medico + ", m_RegistroClinico=" + m_RegistroClinico + "]";
	}

}