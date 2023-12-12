package map.hashMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {

        Proprietario maria = new Proprietario("maria", "08485120");
        Proprietario jose = new Proprietario("jose", "08485121");
        Proprietario claudio = new Proprietario("claudio", "08485122");
        Proprietario juliana = new Proprietario("juliana", "08485123");
        Proprietario thamires = new Proprietario("thamires", "08485124");

        Carro bmw = new Carro("alga001", "bmwX3");
        Carro honda = new Carro("alga002", "Honda Hr-V");
        Carro ford = new Carro("alga004", "Ford - K");
        Carro porshe = new Carro("alga05", "porshe 911");
        Carro bill = new Carro("alga06", "ferrari bora bill");

        /*LinkedHashMap, funciona exatamente como o HashMap, porém
         * ele continua persistindo a ordem de inserção de dados, dentro
         * da classe ele utliza internamente LinkedList para funcionanr!*/

        // Map<Carro, Proprietario> proprietarios = new LinkedHashMap<>();
        /*Funciona Exatamente como o TreeSet*/
        Map<Carro, Proprietario> proprietarios = new TreeMap<>
                (Comparator.comparing(Carro::getPlaca));


        proprietarios.put(bmw, maria);
        proprietarios.put(honda, jose);
        proprietarios.put(ford, claudio);
        proprietarios.put(porshe, juliana);
        proprietarios.put(bill, thamires);


        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
            System.out.println(entry.getKey().getPlaca() + " : " + entry.getValue().getNome());
        }
    }
}
