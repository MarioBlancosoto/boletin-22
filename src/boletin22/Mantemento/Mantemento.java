
package boletin22.Mantemento;

import boletin22.Libro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import milibreria.Milibreria;


public class Mantemento {
   ArrayList <Libro> biblioteca= new ArrayList<Libro>();
   Scanner sc;
   PrintWriter p =null;
   File fich;
    
    public void consultar(String nomeFicheiro){
        String aux[];
        fich = new File(nomeFicheiro);
      
       try {
           sc = new Scanner(fich);
           while(sc.hasNextLine()){
              aux = sc.nextLine().split("<->");
           Libro exemplar = new Libro(aux[0],aux[1],Integer.parseInt(aux[2]),Integer.parseInt(aux[3]));
           biblioteca.add(exemplar);
           }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Mantemento.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           sc.close();
       }
       
       
}
    public void engadirLibros(){
        for(int i=0;i<biblioteca.size();i++){
            biblioteca.add(new Libro(Milibreria.pedirTitulo(),Milibreria.pedirAutor(),
      Milibreria.pedirUnidades(),Milibreria.pedirUnidades()));
        }
    }  
        public void engadir(String nomeFich){

         fich = new File(nomeFich) ;  
       try { 
           
           p = new PrintWriter(new FileWriter(nomeFich,true));
           for(int i=0;i<biblioteca.size();i++){
           p.print(new  Libro(biblioteca.get(i).getAutor(),biblioteca.get(i).getNome(),biblioteca.get(i).getPrecio()
           ,biblioteca.get(i).getNumUnidades()));
         
           }
        
       } catch (IOException ex) {
          ex.getMessage();
       }finally{
           p.close();
       }
            
        }
        public void modificarLibro(){
            
           String modificar = JOptionPane.showInputDialog("Elija el título a modificar");
           for(int i=0;i<biblioteca.size();i++){
               if(biblioteca.get(i).getNome().equals(modificar)){
                  biblioteca.get(i).setAutor(Milibreria.pedirAutor());
                  biblioteca.get(i).setNome(Milibreria.pedirTitulo());
                  biblioteca.get(i).setPrecio(Milibreria.pedirUnidades());
                  biblioteca.get(i).setNumUnidades(Milibreria.pedirUnidades());
               }
               
               
           }
        }
        public void borrarCero(){
            
            for(int i=0;i<biblioteca.size();i++){
                if(biblioteca.get(i).getNumUnidades()==0){
                    biblioteca.remove(i);
                }
                
            }
            
        }
     public void buscarAutor(){
         
       String busAutor = JOptionPane.showInputDialog(" Inserte o nome do autor ");  
         for(int i=0;i<biblioteca.size();i++){
             if(busAutor.equals(biblioteca.get(i).getAutor())){
                 biblioteca.get(i).toString();
             }else{
                 JOptionPane.showMessageDialog(null,"Non hay exemplares deste autor");
             }
         }
     }
        }
      
    
 



