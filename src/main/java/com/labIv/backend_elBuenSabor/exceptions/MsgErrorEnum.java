package com.labIv.backend_elBuenSabor.exceptions;

public enum MsgErrorEnum {

    // common exceptions
    BAD_REQUEST("La solicitud JSON está mal formada"),
    HANDLE_SERVER_EXCEPTION("Error del servicio"),
    ACCESS_DENIED("Acceso denegado"),
    UNAUTHORIZED("No autorizado"),
    INVALID_ARGUMENTS("Argumentos inválidos"),
    BAD_CREDENTIALS_ERROR("Credenciales incorrectas"),
    RESOURCE_NOT_FOUND("Recurso no encontrado"),
    BUSINESS_ERROR("Error en reglas de negocio"),
    REQUESTED_ATTRIBUTE("Atributo solicitado"),
    INTERNAL_SERVER_ERROR("Error interno del servidor");


    private String message;

    private MsgErrorEnum(String message) {
        this.message = message;
    }

    public String getMsg(){
        return this.message;
    }
}
