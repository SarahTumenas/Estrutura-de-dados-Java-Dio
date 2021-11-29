package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros =  new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Ferrari"));
        listCarros.add(new Carro("BMW"));

        System.out.println(listCarros);

        System.out.println(listCarros.contains(new Carro("Ferrari")));

        System.out.println(listCarros.get(3));

        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        System.out.println(listCarros.remove(1));
        System.out.println(listCarros);



    }
}
