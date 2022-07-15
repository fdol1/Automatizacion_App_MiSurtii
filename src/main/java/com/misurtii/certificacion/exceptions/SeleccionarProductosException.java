package com.misurtii.certificacion.exceptions;

import com.misurtii.certificacion.utils.SerialVersionUid;

import static com.misurtii.certificacion.utils.SerialVersionUid.SERIAL6;

public class SeleccionarProductosException extends RuntimeException{

    private static final SerialVersionUid serialVersionUID = SERIAL6;

    private static final String ERROR = "Error al seleccionar los productos";

    public SeleccionarProductosException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}