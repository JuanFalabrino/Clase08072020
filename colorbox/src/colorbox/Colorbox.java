
package colorbox;
import javax.swing.JOptionPane;

public class Colorbox {

    
    public static void main(String[] args) {
        
        //crear vector y llenarlo
       String [] colores = {"Rojo","Negro","Azul","Naranja"};
       
       //mostrar vector
       
       Object kim = JOptionPane.showInputDialog(null,"Seleccionar un color","Colores",JOptionPane.QUESTION_MESSAGE,null,colores,colores[0]);
       
            
       System.out.println(kim);



    }
    
}
