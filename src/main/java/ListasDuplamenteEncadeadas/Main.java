package ListasDuplamenteEncadeadas;

public class Main {
    public static void main(String[] args) {


        ListaDuplamenteEncadeada <String> myListaDuplaEncadeada = new ListaDuplamenteEncadeada<>();


        myListaDuplaEncadeada.add("c1");
        myListaDuplaEncadeada.add("c2");
        myListaDuplaEncadeada.add("c3");
        myListaDuplaEncadeada.add("c4");
        myListaDuplaEncadeada.add("c5");
        myListaDuplaEncadeada.add("c6");
        myListaDuplaEncadeada.add("c7");

        System.out.println(myListaDuplaEncadeada);


        myListaDuplaEncadeada.remove(3);
        System.out.println(myListaDuplaEncadeada);

        myListaDuplaEncadeada.add(3,"99");
        System.out.println(myListaDuplaEncadeada);
        System.out.println(myListaDuplaEncadeada.get(3));

        System.out.println(myListaDuplaEncadeada.size());

        myListaDuplaEncadeada.add(5,"Hi");
        System.out.println(myListaDuplaEncadeada);
        System.out.println(myListaDuplaEncadeada.get(5));
        System.out.println(myListaDuplaEncadeada.size());


    }
}
