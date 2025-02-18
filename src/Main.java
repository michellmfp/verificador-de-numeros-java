public class Main {
    public static void main(String[] args) {

        VerificadorNumero verificador = new VerificadorNumero();

        System.out.println("10 é par? " + verificador.ehPar(10));
        System.out.println("7 é par? " + verificador.ehPar(7));

        System.out.println("7 é primo? " + verificador.ehPrimo(7));
        System.out.println("8 é primo?" + verificador.ehPrimo(8));

        System.out.println("Fatorial de 5: " + verificador.fatorial(5));
        System.out.println("Fatorial de -1: " + verificador.fatorial(-1));

    }
}