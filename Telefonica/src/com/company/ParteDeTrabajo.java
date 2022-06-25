package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class ParteDeTrabajo implements Comparable<ParteDeTrabajo> {
    private String trabajador;
    private int NumeroDeHora;
    private double CosteHora;
    private long FechaDeCreacion;


    public ParteDeTrabajo(String trabajador, int numeroDeHora, double costeHora) throws ExArgumentoIncorreto {
        if (trabajador == null) throw new ExArgumentoIncorreto("el trabajador es null");
        this.trabajador = trabajador;
        if (numeroDeHora <= 0) throw new ExArgumentoIncorreto("el numero de hora es mayor a 0");
        NumeroDeHora = numeroDeHora;
        if (costeHora == 0.0) throw new ExArgumentoIncorreto("el coste de hora es 0.0");
        CosteHora = costeHora;
        Date creacion = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHssSS");
        this.setFechaDeCreacion(Long.parseLong(dateFormat.format(creacion)));


    }


    public double calcularCosteTotal() {
        return this.CosteHora * this.NumeroDeHora;

    }

    @Override
    public String toString() {
        return "ParteDeTrabajo{" +
                "trabajador='" + trabajador + '\'' +
                ", NumeroDeHora=" + NumeroDeHora +
                ", CosteHora=" + CosteHora +
                ", FechaDeCreacion=" + FechaDeCreacion +
                '}';
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public int getNumeroDeHora() {
        return NumeroDeHora;
    }

    public void setNumeroDeHora(int numeroDeHora) {
        NumeroDeHora = numeroDeHora;
    }

    public double getCosteHora() {
        return CosteHora;
    }

    public void setCosteHora(double costeHora) {
        CosteHora = costeHora;
    }

    public long getFechaDeCreacion() {
        return FechaDeCreacion;
    }

    public void setFechaDeCreacion(long fechaDeCreacion) {
        FechaDeCreacion = fechaDeCreacion;
    }


    @Override
    public int compareTo(ParteDeTrabajo o) {

        if (this.CosteHora < o.getCosteHora()) {
            return -1;
        } else {
            return 0;
        }
    }
}
