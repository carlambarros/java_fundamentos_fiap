package arquivo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

    public static void main(String[] args) {

        // ESCRITA E CRIAÇÃO DE ARQUIVO
        String nomedoArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomedoArquivo;

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
        conteudo.add("Pera; 200; pct; R$ 5,40");
        conteudo.add("Morango; 400; cx; R$ 6,50");
        conteudo.add("Abacaxi; 280; un; R$ 5,00");

        //gravarEstoque(nomedoArquivo, caminho, conteudo);
        lerEstoque(caminho);

    }

    private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

        FileWriter stream;
        PrintWriter print;

        try {
            // stream é uma conexão de escrita para o arquivo
            stream = new FileWriter(caminho);
            // a classe PrintWriter escreverá no arquivo
            print = new PrintWriter(stream);

            for (String linha: conteudo) {
                // o metodo println escreve uma linha no arquivo
                print.println(linha);
            }
            // close fecha o arquivo
            print.close();
            stream.close();

            System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // LER O CONTEÚDO DE UM ARQUIVO
    private static void lerEstoque(String caminho) {
        try {
            // Abre o arquivo
            FileReader stream = new FileReader(caminho);

            // BufferedReader possui o método readLine()
            // lê uma linha do arquivo e retorna uma String com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            // Lê uma linha do arquivo
            String linha = reader.readLine();

            // Enquanto linha for diferente de null
            while (linha != null) {

                System.out.println(linha);
                // lê a próxima linha do arquivo
                linha = reader.readLine();
            }
            reader.close();
            //Fecha o arquivo
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
