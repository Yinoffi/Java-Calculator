import java.util.Scanner;

public class Calculadora {
        public static double restar(double a, double b){
            double resultado = a-b;
            return resultado;
        }
        public static double dividir(double a, double b){
            double resultado = a/b;
            return resultado;
        }
        public static double multiplicar(double a, double b){
            double resultado = a*b;
            return resultado;
        }
        public static void mensajes(){
            System.out.println("¿Que quieres hacer?\n1: Sumar\n2: Restar\n3: Multiplicar\n4: Dividir\n5: Salir");
            System.out.println("Poner algo que no sean numeros cerrara el programa automaticamente!!!");
        }
        public static void limpiar(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mensajes();
        int respuesta = sc.nextInt();
        while(respuesta>5 || respuesta<1){
            limpiar();
            mensajes();
            System.out.println("Solo tienes 5 opciones... ");
            respuesta = sc.nextInt();
        }
        while (respuesta !=5){
        if(respuesta == 1){ // Aqui es para sumar, ya que la suma se hace un pelin distinta al resto de operaciones :D
            limpiar();
            double resp;
            double sumas = 0;
            System.out.println("Intruduce la cantidad de numeros a sumar: ");
            double numnumeros = sc.nextInt();
            for (double i = 0; i<numnumeros; i++){
                System.out.println("Intruduce un numero: ");
                resp = sc.nextInt();
                sumas+=resp;
            }
            limpiar();
            System.out.println("Tu suma total es: "+sumas);
            mensajes();
            respuesta = sc.nextInt();
        }

        else if(respuesta == 2){ // Resta
            limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            double resultado = restar(num1, num2);
            limpiar();
            System.out.println("Resultado de tu operacion: "+resultado);
            mensajes();
            respuesta = sc.nextInt();
        }

        else if(respuesta == 3){ // multiplicar
            limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            double resultado = multiplicar(num1, num2);
            limpiar();
            System.out.println("Resultado de tu operacion: "+resultado);
            mensajes();
            respuesta = sc.nextInt();
        }
        
        else if(respuesta == 4){ //dividir
            limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            while (num2==0){
                System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
                System.out.println("Introduce un numero: ");
                num1 = sc.nextInt();
                System.out.println("Introduce un numero: ");
                num2 = sc.nextInt();
            }
            double resultado = dividir(num1, num2);
            limpiar();
            System.out.println("Resultado de tu operacion: "+resultado);
            mensajes();
            respuesta = sc.nextInt();
        } 

        else{System.exit(0);} // terminar el programa por si acaso pone algo q no sea un numero
        }
        sc.close();
    }
}
