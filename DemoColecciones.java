import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoColecciones {
    public static void main(String[] args) {
        Set ejemploObjetoConjuntoHashSet = new HashSet();
        ejemploObjetoConjuntoHashSet.add("elemento1");
        ejemploObjetoConjuntoHashSet.add("elemento3");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        System.out.println("Conjunto tipo hash");
        mostrar_elementos(ejemploObjetoConjuntoHashSet);
        SortedSet ejemploObjetoConjuntoTreeSet = new TreeSet();
        ejemploObjetoConjuntoTreeSet.add("elemento1");
        ejemploObjetoConjuntoTreeSet.add("elemento3");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        System.out.println("Conjunto tipo tree");
        mostrar_elementos(ejemploObjetoConjuntoTreeSet);
    }
    public static void mostrar_elementos(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem + " ");
        }
        System.out.println();
    }       
}
        
