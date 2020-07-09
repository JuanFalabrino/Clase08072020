
package funcioncolor;

import javax.swing.JOptionPane;


public class Funcioncolor {

    
    public static void main(String[] args) {
       
        String [] colores = new String [5];
        llenarVector(colores);
        mostrarVector(colores);
        
        
        
    }
    public static void llenarVector(String[]colores)
    {
        for (int i=0; i <colores.length ; i ++)
        {
        //soliictar al usuario 5 colores
        String color = JOptionPane.showInputDialog("Ingrese 5 colores  " + (i +1) + "de 5");
        colores [i] = color; 
        }
    }
    
    public static void mostrarVector(String []colores){
        for (String colore : colores){
        System.out.print("  "+ colore);
        }
        Object opcion = JOptionPane.showInputDialog(null,"Su listado de colores es  ","Seleccionar colores",JOptionPane.QUESTION_MESSAGE,null,colores,colores [0]);
         System.out.println(opcion);
    
    }
    
    
    
    
    
}
