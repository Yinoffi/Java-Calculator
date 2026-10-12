import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicio el scanner para devolver respuestas
        Functions.mensajeD(); // Funcion para imprimir los mensajes predeterminados en src/Functions.java 
        int respuesta = sc.nextInt();
// Aqui empiezo a escribir condiciones por si el usuario no hace lo que debe hacer.
        while (respuesta !=5){ // Bucle hasta que elija la op5 para salir
            while(respuesta>5 || respuesta<1){ // Seguridad por si pone numeros que no sean del 1 al 5
            Functions.limpiar();
            Functions.mensajeD();
            System.out.println("Elije una de las 5 opciones... ");
            respuesta = sc.nextInt();}
// Si elije la 1 (osea la suma)
        if(respuesta == 1){ // Aqui es para sumar, ya que la suma se hace un pelin distinta al resto de operaciones :D
            Functions.limpiar();
            double resp;
            double sumas = 0;
            System.out.println("Intruduce la cantidad de numeros a sumar: ");
            double cantidadNumeros = sc.nextInt();
            for (double i = 0; i<cantidadNumeros; i++){
                System.out.println("Intruduce un numero: ");
                resp = sc.nextInt();
                sumas+=resp;}
            Functions.limpiar();
            System.out.println("Tu suma total es: "+sumas+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();}
// Si elije la 2 para restar
        else if(respuesta == 2){ // Restar
            Functions.limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            double resultado = Operaciones.restar(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();}
// Si elije la 3 para multiplicar
        else if(respuesta == 3){ // multiplicar
            Functions.limpiar();
            double num1, num2;
            System.out.println("Introduce un numero: ");
            num1 = sc.nextInt();
            System.out.println("Introduce un numero: ");
            num2 = sc.nextInt();
            double resultado = Operaciones.multiplicar(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();}
// si elije la 4 para dividir incluyendo que no puede dividir por 0
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
                num2 = sc.nextInt();}
            double resultado = Operaciones.dividir(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();}
// Terminar el programa
        else{System.exit(0);} // termina el programa por si acaso pone algo q no sea un numero (Aun no controlo los try except :D)
        }
        sc.close(); // Cierre del escaner
    }
}