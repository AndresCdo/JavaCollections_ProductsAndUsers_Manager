import java.util.SortedSet;
import java.util.TreeSet;

public class Usuario{
    //Atributos:
    SortedSet<String> conjuntoTelefonos = new TreeSet<String>();

    void addTelefono(String numero){
        this.conjuntoTelefonos.add(numero); 
    }

    void mostrarTelefonos(){
        System.out.println(this.conjuntoTelefonos);        
    }
}