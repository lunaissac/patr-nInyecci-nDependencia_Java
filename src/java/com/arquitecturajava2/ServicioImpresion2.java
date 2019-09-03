package com.arquitecturajava2;

public class ServicioImpresion2 {

    ServicioEnvio servicioA;
    ServicioPDF servicioB;

    public ServicioImpresion2() {

        this.servicioA = new ServicioEnvio();
        this.servicioB = new ServicioPDF();
    }

    public void imprimir() {

        servicioA.enviar();
        servicioB.pdf();
    }

    
    public class ServicioEnvio {

        public void enviar() {

            System.out.println("enviando el documento a imprimir");
        }
    }

    public class ServicioPDF {

        public void pdf() {

            System.out.println("imprimiendo el documento en formato pdf");
        }
    }

}
