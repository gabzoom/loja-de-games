package com.generation.lojadegames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 120)
	@NotBlank(message = "O atributo Nome é obrigatório!")
	@Size(min = 3, max = 120, message = "O atributo Nome deve conter no mínimo 3 e no máximo 120 caracteres.")
	private String nome;

	@Column(length = 500)
	@NotBlank(message = "O atributo Descrição é obrigatório!")
	@Size(min = 10, max = 500, message = "O atributo Descrição deve conter no mínimo 10 e no máximo 500 caracteres.")
	private String descricao;

	@Column(length = 50)
	@Size(min = 2, max = 50, message = "O atributo Console deve conter no mínimo 2 e no máximo 50 caracteres.")
	private String console;

	@DateTimeFormat
	private LocalDate dataLancamento;

	@NotNull(message = "O atributo Preço é obrigatório!")
	@Column(precision = 6, scale = 2)
	@Digits(integer = 4, fraction = 2, message = "O atributo Preço deve ter no máximo 4 dígitos inteiros e 2 dígitos decimais.")
	@DecimalMin(value = "0.0", inclusive = false)
	private BigDecimal preco;

	@Column(length = 500)
	@Size(min = 10, max = 500, message = "O atributo Foto deve conter no mínimo 10 e no máximo 500 caracteres.")
	private String foto;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
