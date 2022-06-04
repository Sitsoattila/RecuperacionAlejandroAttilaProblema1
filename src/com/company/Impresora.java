package com.company;

import java.util.ArrayList;

public class Impresora {

    boolean estado;
    ArrayList<DocumentoOfimatico> listaDocumentos = new ArrayList<DocumentoOfimatico>();

    ArrayList<Impresora> impresora1 = new ArrayList<>();




    public Impresora(boolean estado, ArrayList<DocumentoOfimatico> listaDocumentos) {
        this.estado = estado;
        this.listaDocumentos = listaDocumentos;
    }

    public void encenderImpresora(){

        estado = true;
    }

    public void apagarImpresora(){
        estado = false;
        System.out.println("Apagando impresora...");
    }

    public void anyadirTrabajo(){


    }

    public void verListaTrabajo(){
        /*for (int i = 0; i < listaDocumentos.size(); i++) {

            System.out.println(listaDocumentos.get(i));

        }

         */

         listaDocumentos.toString();

    }

    public void imprimir(){

        listaDocumentos.toString();

    }



    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<DocumentoOfimatico> getListaDocumentos() {
        return listaDocumentos;
    }

    public void setListaDocumentos(ArrayList<DocumentoOfimatico> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }


}
