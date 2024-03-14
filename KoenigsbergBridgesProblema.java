import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KoenigsbergBridgesProblema {
    
    
    public static List<String> encontrarCaminho(Map<String, List<String>> grafo) {
        List<String> caminho = new ArrayList<>();
        Map<String, List<String>> grafoCopia = new HashMap<>(grafo);
        
       
        String ilhaAtual = grafoCopia.keySet().iterator().next();
        
      
        while (!grafoCopia.get(ilhaAtual).isEmpty()) {
           
            caminho.add(ilhaAtual);
            
            String proximaIlha = grafoCopia.get(ilhaAtual).remove(0);
            
            grafoCopia.get(proximaIlha).remove(ilhaAtual);
         
            ilhaAtual = proximaIlha;
        }
       
        caminho.add(ilhaAtual);
        
        return caminho;
    }

    public static void main(String[] args) {
     
        Map<String, List<String>> grafo = new HashMap<>();
        grafo.put("A", new ArrayList<>());
        grafo.put("B", new ArrayList<>());
        grafo.put("C", new ArrayList<>());
        grafo.put("D", new ArrayList<>());

      
        grafo.get("A").add("B");
        grafo.get("A").add("B");
        grafo.get("A").add("D");
        grafo.get("B").add("A");
        grafo.get("B").add("A");
        grafo.get("B").add("C");
        grafo.get("B").add("C");
        grafo.get("C").add("B");
        grafo.get("C").add("B");
        grafo.get("C").add("D");
        grafo.get("D").add("A");
        grafo.get("D").add("C");

        
        List<String> caminho = encontrarCaminho(grafo);

        
        System.out.println("Caminho que cruza todas as pontes uma vez:");
        for (String ilha : caminho) {
            System.out.print(ilha + " -> ");
        }
    }
}
