package EqualsHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        List <Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Volvo"));
        listaCarros.add(new Carro("Fiat"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Volvo");


        System.out.println(carro1.equals(carro2));






    }
}
