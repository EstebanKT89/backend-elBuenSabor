package com.labIv.backend_elBuenSabor.enums;

public enum Estado {

    PREPARACION("En Preparación"),
    PENDIENTE("Pendiente"),
    CANCELADO("Cancelado"),
    RECHAZADO("Rechazado"),
    ENTREGADO("Entregado");

    private String value;

    Estado(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
