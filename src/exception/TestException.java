package exception;

public class TestException {
    public static void main(String[] args) throws DivisaoPorZeroException {
        try {
            // trecho onde a exceção pode ocorrer
            int val = 10/0;
            System.out.println(val);

        } catch (Exception e) { //captura da exceção

            throw new DivisaoPorZeroException();
        }
    }
}
