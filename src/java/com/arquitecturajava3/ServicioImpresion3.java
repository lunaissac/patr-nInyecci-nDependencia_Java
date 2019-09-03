
package com.arquitecturajava3;


public class ServicioImpresion3 {

      ServicioEnvio servicioA;
  ServicioPDF servicioB;
  
  public ServicioImpresion3(ServicioEnvio servicioA,ServicioPDF servicioB) {
    
    this.servicioA= servicioA;
    this.servicioB= servicioB;
  }
  public void imprimir() {
    
    servicioA.enviar();
    servicioB.pdf();
  }
     

    
}
