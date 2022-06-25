package com.company;

import java.security.InvalidParameterException;

public class ParteDeIncidencia extends ParteDeTrabajo{
    private int descuento;

    public ParteDeIncidencia(String trabajador, int numeroDeHora, double costeHora, int descuento) throws  ExArgumentoIncorreto {
        super(trabajador, numeroDeHora, costeHora);
        if(descuento <50) throw new ExArgumentoIncorreto("el descuento tiene que estar entre 0 y 100");
        this.descuento=descuento;
    }

    @Override
    public double calcularCosteTotal() {
       return super. calcularCosteTotal()*(1-this.descuento/100);

    }
}
