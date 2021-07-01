package com.thiagodev.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"), // vai estar como 0 no banco de dados
	PESSOAJURIDICA(2, "Pessoa Jurídica");// vai estar como 1 no banco de dados

	private int cod;
	private String descricao;

	private TipoCliente(int cod, String descricao) { // Tipo enumerado o construtor é PRIVATE!!!
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;

			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
//CASO NÃO TIVER ENUMERADO OS NOMES, SE FOR ADICIONAR UM NOVO TIPO, ADICIONAR POR ÚLTIMO PARA NÃO ALTERAR A ORDEM!!!