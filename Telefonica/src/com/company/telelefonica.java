package com.company;




import java.util.ArrayList;
import java.util.Collections;

 public class telelefonica{

}


class Main {

    public static void main(String[] args) throws ExArgumentoIncorreto {
        try {

            ArrayList<ParteDeTrabajo> parte = new ArrayList<>();
            parte.add(new ParteDeTrabajo("miguel", 4, 3.0));
            parte.add(new ParteDeTrabajo("joan", 10, 4.3));
            parte.add(new ParteDeTrabajo("sonia", 23, 1.0));
            parte.add(new ParteDeTrabajo("diego", 8, 3.5));

            for (ParteDeTrabajo parteDeTrabajo : parte) {
                System.out.println("" +parteDeTrabajo.getTrabajador()+""+parteDeTrabajo.getCosteHora());
            }
                Collections.sort(parte);
            for (ParteDeTrabajo parteDeTrabajo : parte) {
                System.out.println("-----------"  + "-------");
                System.out.println("" + parteDeTrabajo.getTrabajador() + "" + parteDeTrabajo.getCosteHora());
            }


            ParteDeTrabajo parteDeTrabajo = new ParteDeTrabajo("david", 160, 35);
            ParteDeIncidencia parteDeIncidencia = new ParteDeIncidencia("juan", 50, 35, 5);
        } catch (ExArgumentoIncorreto e) {
            System.out.println("porque no me deja ejecutar el programa");
        }
    }
}
