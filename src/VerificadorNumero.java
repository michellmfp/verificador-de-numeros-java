public class VerificadorNumero {

    public boolean ehPar(int numero){
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehPrimo(int numero){
        if (numero <= 1) {
            return false;
        }

        for(int i = 2; i < numero; i++){
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long fatorial(int numero){
        if ( numero < 1) {
            return -1;
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        return fatorial;
    }

}
