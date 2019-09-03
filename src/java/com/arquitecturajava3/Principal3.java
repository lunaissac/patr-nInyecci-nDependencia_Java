
package com.arquitecturajava3;


public class Principal3 {
      public static void main(String[] args) {
  
         ServicioImpresion3 miServicio3=new ServicioImpresion3(new ServicioEnvioAspecto(),new ServicioPDF());
    
  miServicio3.imprimir();
  }
}
