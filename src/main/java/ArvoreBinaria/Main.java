package ArvoreBinaria;

import ArvoreBinaria.model.Obj;

public class Main {

    public static void main(String[] args) {

        Arvorebinaria <Obj> minhaArvore = new Arvorebinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        minhaArvore.inserir(new Obj(32));
        minhaArvore.exibirInOrdem();







    }
}
