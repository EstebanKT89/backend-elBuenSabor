package com.labIv.backend_elBuenSabor.enums;

public enum Rol {

    ADMIN("Administrador"),
    COCINERO("Cocinero"),
    CAJERO("Cajero");

    private String value;

    Rol(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
