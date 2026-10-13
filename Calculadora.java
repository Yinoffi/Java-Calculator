import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        boolean valido = false;
        int respuesta = 0;
        Scanner sc = new Scanner(System.in); // Inicio el scanner para devolver respuestas
        while(valido != true){
        try {
        Functions.mensajeD(); // Funcion para imprimir los mensajes predeterminados en src/Functions.java
        respuesta = sc.nextInt();
        valido = true;
        } catch(InputMismatchException e){
            Functions.limpiar();
            sc.next();
            System.out.println("Tienes que escribir un numero del 1 al 5 nada mas!!!!!");
        }
}
        while (respuesta >5 || respuesta < 0){
            Functions.limpiar();
            try {
            System.out.println("Solo un numero del 1 al 5...\n");
            Functions.mensajeD();
            respuesta = sc.nextInt();
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Tienes que escribir un numero del 1 al 5 nada mas!!!!!");
            }
        }
        while (respuesta !=5){ // Bucle hasta que elija la op5 para salir
// Si elije la 1 (osea la suma)
        if(respuesta == 1){ // Aqui es para sumar, ya que la suma se hace un pelin distinta al resto de operaciones :D
            Functions.limpiar();
            valido = false;
            long resp = 0;
            long sumas = 0;
            long cantidadNumeros = 0;
            while(valido != true){
            try{
            System.out.println("Intruduce la cantidad de numeros a sumar: ");
            cantidadNumeros = sc.nextLong();
            valido = true;
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Error, introduce un numero de menos de 11 digitos");
            }}
        // Primer bloque TRY para que no rompa el programa
            
            for (double i = 0; i<cantidadNumeros; i++){
            valido = false;
            while (!valido){
            try{
            System.out.println("Intruduce un numero: ");
            resp = sc.nextLong();
            sumas+=resp;
            valido = true;
            System.out.println("Suma total: "+sumas+"\n");
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros de menos de 11 digitos!!");
                System.out.println("Suma total: "+sumas+"\n");
            }}
                
            } // Cierre FOR
            Functions.limpiar();
            System.out.println("Tu suma total es: "+sumas+"\n");
            valido = false;
            while(!valido){
            try {
            Functions.mensajeD();
            respuesta = sc.nextInt();
            valido = true;
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Tienes que escribir un numero del 1 al 5 nada mas!!!!!");
            }}
        } // CIERRE IF
// Si elije la 2 para restar
        else if(respuesta == 2){ // Restar
            Functions.limpiar();
            long num1= 0, num2 = 0, resultado = 0;
            
            valido = false;
            while (!valido){
            try{
            System.out.println("Introduce un numero: ");
            num1 = sc.nextLong();
            valido = true;
            } catch (InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
        }
            valido = false;
            while(!valido){
            try{
            System.out.println("Introduce un numero: ");
            num2 = sc.nextLong();
            valido = true;
            } catch (InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
        }
            resultado = Operaciones.restar(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            valido = false;
            while(!valido){
            try{
            Functions.mensajeD();
            respuesta = sc.nextInt();
            valido = true;
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }}
        }
// Si elije la 3 para multiplicar
        else if(respuesta == 3){ // Restar
            Functions.limpiar();
            long num1= 0, num2 = 0, resultado = 0;
            
            valido = false;
            while (!valido){
            try{
            System.out.println("Introduce un numero: ");
            num1 = sc.nextLong();
            valido = true;
            } catch (InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
        }
            valido = false;
            while(!valido){
            try{
            System.out.println("Introduce un numero: ");
            num2 = sc.nextLong();
            valido = true;
            } catch (InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
        }
            resultado = Operaciones.multiplicar(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            valido = false;
            while(!valido){
            try{
            Functions.mensajeD();
            respuesta = sc.nextInt();
            valido = true;
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }}
        }
// si elije la 4 para dividir incluyendo que no puede dividir por 0
        else if(respuesta == 4){ // Restar
            Functions.limpiar();
            long num1= 0, num2 = 0, resultado = 0;
            
            valido = false;
            while (!valido){
            try{
            System.out.println("Introduce un numero: ");
            num1 = sc.nextLong();
            valido = true;
            } catch (InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
        }
            valido = false;
            while(!valido){
            try{
            System.out.println("Introduce un numero: ");
            num2 = sc.nextLong();
            while(num2==0){
                Functions.limpiar();
                System.out.println("No puedes dividir por 0...");
                System.out.println("Introduce un numero: ");
                num2 = sc.nextLong();
            }
            } catch (InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
            valido = true;
        }
            resultado = Operaciones.dividir(num1, num2);
            Functions.limpiar();
            System.out.println("Resultado de tu operacion: "+resultado+"\n");
            valido = false;
            while(!valido){
            try{
            Functions.mensajeD();
            respuesta = sc.nextInt();
            valido = true;
            } catch(InputMismatchException e){
                Functions.limpiar();
                sc.next();
                System.out.println("Solo numeros menores a 11 digitos");
            }
        }
        }
// Terminar el programa
        else{System.exit(0);} // termina el programa por si acaso pone algo q no sea un numero (Aun no controlo los try except :D)
        }
        sc.close(); // Cierre del escaner
    }
}