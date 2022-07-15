package com.misurtii.certificacion.exceptions;

import com.misurtii.certificacion.utils.SerialVersionUid;

import static com.misurtii.certificacion.utils.SerialVersionUid.SERIAL6;

public class IniciarSesionException extends RuntimeException{

    private static final SerialVersionUid serialVersionUID = SERIAL6;

    private static final String ERROR = "Error al ingresar iniciar sesion con las credenciales";

    public IniciarSesionException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}