package com.company;

import java.util.ArrayList;
import java.util.HashMap;

class Gestor{
    private String Fabrica;
    private ArrayList<Cliente>cliente;




    public void validate(String fabrica,   Cliente cliente)throws ExArgumentoIncorreto {
        validate(fabrica, cliente);
        if(cliente==null) throw new ExArgumentoIncorreto("cliente no es null");
        this.cliente=new ArrayList<>();
        this.cliente.add(cliente);
    }


    private void validate(String fabrica) {
        Fabrica = fabrica;
        this.cliente = cliente;
    }

    public String getFabrica() {
        return Fabrica;
    }
    

    public void setFabrica(String fabrica) {
        Fabrica = fabrica;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

}




