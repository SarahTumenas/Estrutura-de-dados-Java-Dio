package FilaBasic;

public class Main {


    public static void main(String [] args){

        Fila<String> minhaFila = new Fila<>();



        /*minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));*/

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);


        //minhaFila.enqueue(new No("último"));
        minhaFila.enqueue("último");

        System.out.println(minhaFila);

        //minhaFila.enqueue(1);
        //System.out.println(minhaFila);



        System.out.println(minhaFila.first());

        System.out.println(minhaFila);



    }
}

