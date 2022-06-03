package com.company;

public class DocumentoOfimatico <T>{

    String nombreArchivo;
    String tamanyo;

    public DocumentoOfimatico(String nombreArchivo, String tamanyo) {
        this.nombreArchivo = nombreArchivo;
        this.tamanyo = tamanyo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }
}
