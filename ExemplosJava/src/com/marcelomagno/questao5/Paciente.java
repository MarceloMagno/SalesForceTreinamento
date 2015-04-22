package com.marcelomagno.questao5;

import java.util.Date;

/**
 * @author Marcelo Magno
 * @Data: 13/03/2015
 * @Versao 1.0
 */
public class Paciente {

	private Long codigo;
	private Cpf cpf;
	private Date dtNascimento;
	private Endereco endereco;
	private String nome;
	private Sexo sexo;
	private Telefone telefone;
	public Consulta m_Consulta;

	public Paciente(){

	}

	public Paciente(Long codigo, Cpf cpf, Date dtNascimento, Endereco endereco,
			String nome, Sexo sexo, Telefone telefone, Consulta m_Consulta) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.m_Consulta = m_Consulta;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Consulta getM_Consulta() {
		return m_Consulta;
	}

	public void setM_Consulta(Consulta m_Consulta) {
		this.m_Consulta = m_Consulta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((dtNascimento == null) ? 0 : dtNascimento.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((m_Consulta == null) ? 0 : m_Consulta.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
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
		Paciente other = (Paciente) obj;
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
		if (dtNascimento == null) {
			if (other.dtNascimento != null)
				return false;
		} else if (!dtNascimento.equals(other.dtNascimento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (m_Consulta == null) {
			if (other.m_Consulta != null)
				return false;
		} else if (!m_Consulta.equals(other.m_Consulta))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", cpf=" + cpf
				+ ", dtNascimento=" + dtNascimento + ", endereco=" + endereco
				+ ", nome=" + nome + ", sexo=" + sexo + ", telefone="
				+ telefone + ", m_Consulta=" + m_Consulta + "]";
	}

}