package ListasCirculares;



public class Main {

    public static void main(String[] args) {

        ListaCircular <String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("S1");
        minhaListaCircular.add("S2");
        minhaListaCircular.add("S3");
        minhaListaCircular.add("S4");
        minhaListaCircular.add("S5");
        minhaListaCircular.add("S6");

        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.isEmpty());

        System.out.println(minhaListaCircular.size());


        minhaListaCircular.remove(2);
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(5));


        for (int i = 0; i < 15; i ++){
            System.out.println(minhaListaCircular.get(i));
        }




    }
}
