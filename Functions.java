public class Functions {
    public static void mensajeD(){
        System.out.println("¿Que quieres hacer?\n1: Sumar\n2: Restar\n3: Multiplicar\n4: Dividir\n5: Salir\n");
    }
    public static void errorRango(){
        System.out.println("Solo puedes escribir numeros del 1 al 5 y nada mas!!!\n");
    }
    public static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void errorTipoRespuesta(){
        System.out.println("Error, introduce un numero de menos de 11 digitos\n");
    }
    public static void Main(String[] ads){}
}
