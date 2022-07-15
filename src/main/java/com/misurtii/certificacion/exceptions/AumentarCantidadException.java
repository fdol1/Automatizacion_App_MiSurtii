package com.misurtii.certificacion.exceptions;


import com.misurtii.certificacion.utils.SerialVersionUid;

import static com.misurtii.certificacion.utils.SerialVersionUid.SERIAL6;

public class AumentarCantidadException extends RuntimeException{

    private static final SerialVersionUid serialVersionUID = SERIAL6;

    private static final String ERROR = "Error aumentar la cantidad del producto";

    public AumentarCantidadException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}