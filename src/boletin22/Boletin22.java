
package boletin22;

import boletin22.Mantemento.Mantemento;
import javax.swing.JOptionPane;


public class Boletin22 {

   
    public static void main(String[] args) {
      int select;
        Mantemento fix = new Mantemento();
       do{
       select = Integer.parseInt(JOptionPane.showInputDialog(null,
        " 1. Engadir Libro \n 2. Consultar Libreria  \n 3. Modificar Libros  \n 4. Engadir Libro \n 5.Borrar 0 \n 6.Buscar Autores  \n 7.Sair"));
       
       
       switch(select){
           
           case 1: fix.engadir("Libreria.txt");
           break;
           case 2: fix.consultar("Libreria.txt");
           break;
           case 3: fix.modificarLibro();
           break;
           case 4: fix.engadirLibros();
           break;
           case 5: fix.borrarCero();
           break;
           case 6: fix.buscarAutor();
           break;
           case 7: System.exit(0);
           break;
       }
           
           
           
       }while(select!=0); 
      
      
    
        
       
    }
    
}
