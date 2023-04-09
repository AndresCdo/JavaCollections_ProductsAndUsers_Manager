import java.util.SortedSet;
import java.util.TreeSet;

public class Usuario{
    //Attributes:
    SortedSet<String> conjuntoTelefonos = new TreeSet<String>();

    //Method to add a phone number to the set:
    void addTelefono(String numero){
        this.conjuntoTelefonos.add(numero); 
    }

    //Method to show all the phone numbers in the set:
    void mostrarTelefonos(){
        System.out.println(this.conjuntoTelefonos);        
    }
}