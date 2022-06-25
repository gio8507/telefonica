package com.company;

import com.sun.jdi.IntegerValue;

import java.util.Comparator;
import java.util.List;

public class ParteDeTrabajoOrdenado implements Comparator<ParteDeTrabajo> {

    @Override
    public int compare(ParteDeTrabajo o1, ParteDeTrabajo o2) {
        return Integer.valueOf((int) o1.getFechaDeCreacion()).compareTo((int) o2.getFechaDeCreacion());
    }

}




