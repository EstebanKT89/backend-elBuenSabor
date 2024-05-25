package com.labIv.backend_elBuenSabor.enums;

public enum FormaPago {

    EFECTIVO("Efectivo"),
    MERCADO_PAGO("Mercado Pago");

    private String value;

    FormaPago (String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
