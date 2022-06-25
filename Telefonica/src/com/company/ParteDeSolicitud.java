package com.company;

import java.security.InvalidParameterException;

public class ParteDeSolicitud extends ParteDeTrabajo {
    private int recargo;


    public ParteDeSolicitud(String trabajador, int numeroDeHora, double costeHora, int recargo) throws  ExArgumentoIncorreto {
        super(trabajador, numeroDeHora, costeHora);
        if (recargo<=0)throw new ExArgumentoIncorreto("recargo es mayor a 0");
        this.recargo=recargo;

    }

    @Override
    public double calcularCosteTotal() {
        return super.calcularCosteTotal()*(1+ this.recargo/100);
    }
}
