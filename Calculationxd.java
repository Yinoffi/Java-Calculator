import java.util.Scanner;

public class Calculationxd {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions.mensajeD();
        int respuesta = sc.nextInt();
        while (respuesta !=5){ // Bucle por si pone 5
            while(respuesta>5 || respuesta<1){ // Seguridad por si pone numeros que no sean del 1 al 5
            Functions.limpiar();
            Functions.mensajeD();
            System.out.println("Solo tienes 5 opciones... ");
            respuesta = sc.nextInt();
        }

        if(respuesta == 1){ // Aqui es para sumar, ya que la suma se hace un pelin distinta al resto de operaciones :D
            Functions.limpiar();
            double resp;
            double sumas = 0;
            System.out.println("Intruduce la cantidad de numeros a sumar: ");
            double numnumeros = sc.nextInt();
            for (double i = 0; i<numnumeros; i++){
                System.out.println("Intruduce un numero: ");
                resp = sc.nextInt();
                sumas+=resp;
            }
            Functions.limpiar();
            System.out.println("Tu suma total es: "+sumas+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();
        }

        else if(respuesta == 2){ // Resta
            Functions.limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            double resultado = restar(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();
        }

        else if(respuesta == 3){ // multiplicar
            Functions.limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            double resultado = multiplicar(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();
        }
        
        else if(respuesta == 4){ //dividir
            Functions.limpiar();
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
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();
        } 
        else{System.exit(0);} // terminar el programa por si acaso pone algo q no sea un numero
        }

        sc.close();
    }
}
