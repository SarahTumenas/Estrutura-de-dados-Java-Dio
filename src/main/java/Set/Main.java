package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set <Carro> hasSetCarros = new HashSet<>();

        hasSetCarros.add(new Carro("Ford"));
        hasSetCarros.add(new Carro("Jaguar"));
        hasSetCarros.add(new Carro("Mercedes"));
        hasSetCarros.add(new Carro("Tesla"));
        hasSetCarros.add(new Carro("Ferrari"));
        hasSetCarros.add(new Carro("Zip"));

        System.out.println(hasSetCarros);


        Set <Carro>  treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Jaguar"));
        treeSetCarros.add(new Carro("Mercedes"));
        treeSetCarros.add(new Carro("Tesla"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Zip"));

        System.out.println(treeSetCarros);






    }
}
