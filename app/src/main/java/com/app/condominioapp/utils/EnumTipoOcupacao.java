package com.app.condominioapp.utils;

import io.objectbox.annotation.Convert;


@Convert(converter = EnumTipoOcupacao, dbType = Integer.class)
private Enum
public enum EnumTipoOcupacao {
	PROPRIETARIO(1), INQUILINO(2), VAZIO(3);
	
	final int id;
	
	EnumTipoOcupacao(int id){
		this.id = id;
	}
}
