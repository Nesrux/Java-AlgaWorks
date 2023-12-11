package map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Principal {
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

        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, jose);
        proprietarios.put(ford, claudio);
        proprietarios.put(porshe, juliana);
        proprietarios.put(bill, thamires);

        proprietarios.put(bmw, jose);

        //  proprietarios.forEach((a, b)-> System.out.println(a + "--" + b));
        //  System.out.println(proprietarios.get(ford));
//        for (Carro carro : proprietarios.keySet()) {
//            System.out.println(carro);
//        }
//        for (Proprietario proprietario : proprietarios.values()) {
//            System.out.println(proprietario);
//        }
//        for(Carro carro: proprietarios.keySet()){
//            Proprietario proprietario = proprietarios.get(carro);
//        }

        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
            System.out.println(entry.getKey().getPlaca() + " : " + entry.getValue().getNome());
        }
    }
}
