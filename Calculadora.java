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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que quieres hacer? 1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir | 5: Salir (Introducir algo que no sean numeros cerrara el programa)");
        int respuesta = sc.nextInt();
        while (respuesta !=5){
        if(respuesta == 1){
            double resp;
            double sumas = 0;
            System.out.println("Intruduce la cantidad de numeros a sumar: ");
            double numnumeros = sc.nextInt();
            for (double i = 0; i<numnumeros; i++){
                System.out.println("Intruduce un numero: ");
                resp = sc.nextInt();
                sumas+=resp;
            }
            System.out.println("Tu suma total es: "+sumas);
            System.out.println("Que quieres hace? 1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir | 5: Salir (Introducir algo que no sean numeros cerrara el programa)");
            respuesta = sc.nextInt();
        }
        else if(respuesta == 2){
            double num1, num2;
            System.out.println("Num1: ");
            num1 = sc.nextInt();
            System.out.println("Num2: ");
            num2 = sc.nextInt();
            double resultado = restar(num1, num2);
            System.out.println("Resultado de tu operacion: "+resultado);
            System.out.println("Que quieres hace? 1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir | 5: Salir (Introducir algo que no sean numeros cerrara el programa)");
            respuesta = sc.nextInt();
        }
        else if(respuesta == 3){
            double num1, num2;
            System.out.println("Num1: ");
            num1 = sc.nextInt();
            System.out.println("Num2: ");
            num2 = sc.nextInt();
            double resultado = multiplicar(num1, num2);
            System.out.println("Resultado de tu operacion: "+resultado);
            System.out.println("Que quieres hace? 1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir | 5: Salir (Introducir algo que no sean numeros cerrara el programa)");
            respuesta = sc.nextInt();
        } 
        
        else if(respuesta == 4){
            double num1, num2;
            System.out.println("Num1: ");
            num1 = sc.nextInt();
            System.out.println("Num2: ");
            num2 = sc.nextInt();
            while (num2==0){
                System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
                System.out.println("Num1: ");
                num1 = sc.nextInt();
                System.out.println("Num2: ");
                num2 = sc.nextInt();
            }
            double resultado = dividir(num1, num2);
            System.out.println("Resultado de tu operacion: "+resultado);
            System.out.println("Que quieres hace? 1: Sumar | 2: Restar | 3: Multiplicar | 4: Dividir | 5: Salir (Introducir algo que no sean numeros cerrara el programa)");
            respuesta = sc.nextInt();
        } 
        else{System.exit(0);} // terminar el programa por si acaso pone algo q no sea un numero
        }
        sc.close();
    }
}
