package com.company;

import java.util.ArrayList;

public class Impresora {
    boolean estado = false;
    ArrayList<DocumentoOfimatico> listaDocumentos = new ArrayList<>();

    public void encederImpresora(){

        estado = true;

    }

    public void apagarImpresora(){
        estado = false;

    }


}
