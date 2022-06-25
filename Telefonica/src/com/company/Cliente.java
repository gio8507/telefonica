package com.company;

import java.util.ArrayList;


public class Cliente {
    private String Nif;
    private String Nombre;
    private String Direccion;
    private int FacturaPorCoste;
    private ArrayList<ParteDeTrabajo> parte;

    public Cliente(String nif, String nombre, String direccion, int facturaPorCoste,ArrayList<ParteDeTrabajo>  parte) throws ExArgumentoIncorreto {
        validate(nif, nombre, direccion);
        if(parte==null)throw new ExArgumentoIncorreto("parte no es null");
        this.parte=parte;

    }

    public Cliente(String nif, String nombre, String direccion, ParteDeTrabajo  ParteDeTrabajo) throws ExArgumentoIncorreto {
        validate(Nif, nombre, Direccion);
        if (parte == null) throw new ExArgumentoIncorreto("parte de trabajo es null");
       this.parte =new ArrayList<>();
         this.parte.add(ParteDeTrabajo);
    }


    private void validate(String nif, String nombre, String direccion ) {
        this.Nif = nif;
        this.Nombre = nombre;
        this.Direccion = direccion;

    }


    public String getNif() {
        return Nif;
    }

    public void setNif(String nif) {
        this.Nif = nif;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public ArrayList<ParteDeTrabajo> getParte() {
        return parte;
    }

    public void setParte(ArrayList<ParteDeTrabajo> parte) {
        this.parte = parte;
    }

    public int getFacturaPorCoste() {
        return FacturaPorCoste;
    }

    public void setFacturaPorCoste(int facturaPorCoste) {
        FacturaPorCoste = facturaPorCoste;
    }

    public void asignarparte(ParteDeTrabajo parteDeTrabajo) {
        this.parte.add(parteDeTrabajo);
    }


    public double CalcularCostetotal() {
        double TotalDeparte = 0.0;
        for (ParteDeTrabajo parteDeTrabajo : this.parte) {
            TotalDeparte += parteDeTrabajo.calcularCosteTotal();
        }
        return TotalDeparte;

    }


    public String Factura() {
        String Factura = "Cliente{" +
                "nif='" + Nif + '\'' +
                ", nombre='" + Nombre + '\'' +
                ", direccion='" + Direccion + '\'' +
                ", parte=" + parte +
                '}';


        return Factura;
    }

}







