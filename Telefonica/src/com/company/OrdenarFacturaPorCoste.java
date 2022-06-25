package com.company;

import java.util.Comparator;

public class OrdenarFacturaPorCoste implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return  Integer.valueOf((int) o1.getFacturaPorCoste()).compareTo((int) o2.getFacturaPorCoste());
    }
}
