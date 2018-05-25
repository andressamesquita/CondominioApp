package com.app.condominioapp.utils;

import io.objectbox.annotation.Convert;
import io.objectbox.converter.PropertyConverter;

@Convert(converter = EnumOcupacao.class, dbType = Integer.class)

public enum EnumOcupacao implements PropertyConverter<EnumOcupacao, Integer>{
    PROPRIETARIO(1), INQUILINO(2), VAZIO(3);

    final int id;

    EnumOcupacao(int id){
        this.id = id;
    }
}