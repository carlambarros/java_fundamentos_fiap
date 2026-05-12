package loop_array_str_col.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {

        ArrayList carrinho = new ArrayList();
        Double valor = 100.55;
        int valor2 = 1;
        int valor3;

        carrinho.add(valor);
        carrinho.add("Uva");
        carrinho.add(valor2);

        System.out.println(carrinho.get(1));

        // Interface List e uso de Generics
        // Generics não permite tipos primitivos
        List<String> carrinho2 = new ArrayList<String>();

        carrinho2.add("Maça");
        carrinho2.add("Morango");
        carrinho2.add("Maça");
        carrinho2.set(1, "Pera");

        System.out.println(carrinho2.isEmpty());
        System.out.println(carrinho2.size());
    }
}


