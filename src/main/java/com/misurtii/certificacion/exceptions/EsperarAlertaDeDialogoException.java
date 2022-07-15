package com.misurtii.certificacion.exceptions;

import com.misurtii.certificacion.utils.SerialVersionUid;

import static com.misurtii.certificacion.utils.SerialVersionUid.SERIAL2;

public class EsperarAlertaDeDialogoException extends RuntimeException{

    private static final SerialVersionUid serialVersionUID = SERIAL2;

    private static final String ERROR = "Error al esperar la alerta de dialogo";

    public EsperarAlertaDeDialogoException(String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}