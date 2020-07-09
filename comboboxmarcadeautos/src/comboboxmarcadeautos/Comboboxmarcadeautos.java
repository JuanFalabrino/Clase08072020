
package comboboxmarcadeautos;

import javax.swing.JOptionPane;


public class Comboboxmarcadeautos {

    public static void main(String[] args) {
      
      // Carga de vectores
      String [] marcas  = {"Ford","Fiat","Renault"};
      String [] ford    = {"Fiesta","Falcon","Ka","Focus"};
      String [] fiat    = {"Palio","Punto","600","Cubo","1500"};
      String [] renault = {"Clio","Sandero","12","Twingo","Kwind"};
      
      //Seleccionar una Marca
      Object opcion = JOptionPane.showInputDialog(null,"Seleccione la marca de su Vehiculo","Seleccionar Vehiculo",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas[0]);
      
      
      combomodelos(ford,fiat,renault,opcion);
      
    
    }
    
    //mostrar el combobox segun la marca
    private static void combomodelos(String [] ford,String [] fiat, String[] renault, Object opcion)
    {
          if (opcion=="Ford"){
             Object fordmodelo = JOptionPane.showInputDialog(null,"Su vehiculo es de la marca " + opcion + "  seleccione el modelo   ","Selección de modelo",JOptionPane.QUESTION_MESSAGE,null,ford, ford [0]);
             System.out.println("Su vehiculo es de la marca " + opcion + "  modelo   " + fordmodelo);
          }  
          if (opcion == "Fiat"){
            Object fiatmodelo = JOptionPane.showInputDialog(null,"Su vehiculo es de la marca " + opcion + "  seleccione el modelo   ","Selección de modelo",JOptionPane.QUESTION_MESSAGE,null,fiat, fiat [0]);
             System.out.println("Su vehiculo es de la marca " + opcion + "  modelo   " + fiatmodelo);
          
          }
          
          if (opcion == "Renault"){
             Object renaultmodelo = JOptionPane.showInputDialog(null,"Su vehiculo es de la marca " + opcion + "  seleccione el modelo   ","Selección de modelo",JOptionPane.QUESTION_MESSAGE,null,renault, renault [0]);
             System.out.println("Su vehiculo es de la marca " + opcion + "  modelo   " + renaultmodelo);
          
          
          }
          
                   
            
    }
    
    
    
    
    
}
