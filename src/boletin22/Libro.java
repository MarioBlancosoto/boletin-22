
package boletin22;


public class Libro implements Comparable<Libro>{
  
    String nome,autor;
    int precio,numUnidades;
    public Libro(){
        
        
    }

    public Libro(String nome, String autor, int precio, int numUnidades) {
        this.nome = nome;
        this.autor = autor;
        this.precio = precio;
        this.numUnidades = numUnidades;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "nome=" + nome + ", autor=" + autor + ", precio=" + precio + ", numUnidades=" + numUnidades + '}';
    }
    @Override
    public int compareTo(Libro comparar){
       
        int compareToIgnoreCase = this.nome.compareToIgnoreCase(comparar.getNome());
        return 0;
        
    }
    
}
