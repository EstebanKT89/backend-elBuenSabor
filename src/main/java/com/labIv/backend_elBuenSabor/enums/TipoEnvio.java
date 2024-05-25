package com.labIv.backend_elBuenSabor.enums;

public enum TipoEnvio {

    DELIVERY("Entrega a domicilio"),
    TAKE_AWAY("Retiro por sucursal");

    private String value;

    TipoEnvio(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
