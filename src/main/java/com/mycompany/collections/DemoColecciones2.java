import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;

public class DemoColecciones2 {
    public static void main(String[] args) {
        Map ejemploObjetoMapaHash = new HashMap();
        ejemploObjetoMapaHash.put("clave1", "valor1");
        ejemploObjetoMapaHash.put("clave2", "valor2");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        System.out.println("Mapa tipo hash");
        mostrar_elementos(ejemploObjetoMapaHash.keySet());
        mostrar_elementos(ejemploObjetoMapaHash.values());
        
        SortedMap ejemploObjetoMapaTree = new TreeMap();
        ejemploObjetoMapaTree.put("clave1", "valor1");
        ejemploObjetoMapaTree.put("clave2", "valor2");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        System.out.println("Mapa tipo tree");
        mostrar_elementos(ejemploObjetoMapaTree.keySet());
        mostrar_elementos(ejemploObjetoMapaTree.values());
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
