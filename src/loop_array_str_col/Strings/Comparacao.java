package loop_array_str_col.Strings;

public class Comparacao {
    public static void main(String[] args) {
        String nome = new String("maça");
        String nome2 = new String("Maça");
        String nome3 = new String ("maça");

        System.out.println(nome.equals(nome2));

        System.out.println(nome.equalsIgnoreCase(nome2));

        System.out.println(nome.equals(nome3));

        boolean teste = (nome == nome3);
        System.out.println(teste);
        // false, pois não compara o conteúdo dentro da string e sim a posição de memória

        String nome4 = "maça";
        String nome5 = "maça";

        teste = (nome4 == nome5);
        System.out.println(teste);
        // true, pois não instancia as variáveis, mas ele utiliza um pool de memória e ambas serão
        // armazenadas no mesmo local e terão o mesmo valor
    }
}
