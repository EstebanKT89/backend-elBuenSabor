package com.labIv.backend_elBuenSabor.enums;

public enum TipoPromocion {

    HAPPY_HOUR("Happy Hour"),
    PROMOCION("Promoción");

    private String value;

    TipoPromocion(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
