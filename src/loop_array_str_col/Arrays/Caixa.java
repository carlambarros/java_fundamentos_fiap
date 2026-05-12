package loop_array_str_col.Arrays;

public class Caixa {
     public static void main(String[] args) {
         int qtdProdutos = 5;
         int registro = 0;

//       while (registro < qtdProdutos) {
//            registro++;
//            System.out.println("O produto número " + registro + " foi registrado");
//       }

//       do {
//            registro++;
//            System.out.println("O caixa registrou o produto " + registro);
//       } while (registro < qtdProdutos);

         for (int i = 1; i <= qtdProdutos; i++){
                System.out.println("O caixa registrou o produto " + i);
         }

         // ou float valores[] = new float[5];
         // ou float[]  valores = {10, 20, 30, 40, 50};
         // ou float[] valores2 = new float[] {10, 20, 30, 40, 50};
         float[] valores = new float[5];
         float[] valores2 = new float[] {10, 20, 30, 40, 50};

         valores[0] = 10;
         valores[1] = 20;
         valores[2] = 30;
         valores[3] = 30;

         System.out.println(valores[1]);


         Produto[] produtos = new Produto[2];

         Produto prod1 = new Produto();
         prod1.setNome("Limão");
         prod1.setDescricao("Galego");
         prod1.setValor(4);

         Produto prod2 = new Produto();
         prod2.setNome("Maca");
         prod2.setDescricao("Gala");
         prod2.setValor(5);

         produtos[0] = prod1;
         produtos[1] = prod2;

         for (Produto prod: produtos) {
             System.out.println(prod.toString());
         }

         // é o mesmo que
//         for (int i=0; i < produtos.length; i++) {
//             System.out.println(produtos[i].toString());
//         }


         // Array multidimensional - MATRIZ
         Produto[][] localizacaoProduto = new Produto[10][3];

         localizacaoProduto[0][1] = prod1;
         localizacaoProduto[1][1] = prod1;

         System.out.println(localizacaoProduto[0][1].getNome());


         String nome;
         nome = new String();
         nome = "Maca";
         System.out.println(nome);

         String nome2 = new String("Maçã");
         System.out.println(nome2);

         // O java utiliza um pool e não uma área específica
         // utiliza caching (guardar dados temporariamente na memória para acessar mais rápido depois)
         String nome3 = "Maça";
         System.out.println(nome3);

         // caracteres especiais - escape
         String descricao = "Tipo GAla \nA maca mais doce do mercado";
         System.out.println(descricao);

         descricao = "Tipo Gala \tA maca mais doce do mercado";
         System.out.println(descricao);

         descricao = "Tipo Gala: \"A maca mais doce do mercado\"";
         System.out.println(descricao);

        // concatenacao
         String nomeConc = new String("Maca");
         String descricaoConc = new String();
         descricaoConc = "tipo Gala, a maca mais doce do mercado";

         String propaganda = nome + " " + descricao;
         System.out.println(propaganda);

         propaganda = nome.concat(" ").concat(descricao);
         System.out.println(propaganda);

         propaganda += "!";
         System.out.println(propaganda);


     }
}


