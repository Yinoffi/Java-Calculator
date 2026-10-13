import java.math.BigInteger;

public class Operaciones{
        public static BigInteger restar(BigInteger a, BigInteger b){
            BigInteger resultado = a.add(b);
            return resultado;
        }
        public static BigInteger dividir(BigInteger a, BigInteger b){
            BigInteger resultado = a.divide(b);
            return resultado;
        }
        public static BigInteger multiplicar(BigInteger a, BigInteger b){
            BigInteger resultado = a.multiply(b);
            return resultado;
        }
    public static void main(String[] args) {}
}