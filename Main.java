package Main;

// Importaciones

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * @Descripción Clase principal del programa
 **/

@SuppressWarnings("unused")

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, num1, num2;

        System.out.print("Introduce el número del ejercicio a realizar: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                // Bloque de código si la variable es igual a valor1
                double numero = 3, operador = 6;

                // Operaciones aquí

                double suma = numero + operador;
                double resta = numero - operador;
                double multiplicacion = numero * operador;
                double division = numero / operador;

                if (numero > operador) {
                    System.out.println("El número " + numero + " es mayor que operador " + operador);
                }
                ;
                System.out.println("La suma de " + numero + " + " + operador + " es: " + suma);
                System.out.println("La resta de " + numero + " - " + operador + " es: " + resta);
                System.out.println("La multiplicación de " + numero + " * " + operador + " es: " + multiplicacion);
                System.out.printf("La división de " + numero + " / " + operador + " es: " + division);
                break;

            case 2:
                // 1.1 Escribir un programa que solicite un valor entero al usuario y determine
                // si es par o impar.

                System.out.print("Ingresa un número: ");
                num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
                break;
            case 3:
                // 1.2 Escribir un programa que solicite un valor entero al usuario y determine
                // si es positivo o negativo.
                System.out.print("Ingresa un número: ");
                num = sc.nextInt();

                if (num > 0) {
                    System.out.println("El número es positivo.");
                } else {
                    System.out.println("El número es negativo.");
                }

                break;
            case 4:
                // 1.3 Pedir al usuario un valor. Si el valor es positivo, pedir un segundo
                // valor y calcular la suma, resta y producto de ambos. Mostrar los resultados
                // por pantalla.
                System.out.println("Ingresa número 1: ");
                num1 = sc.nextInt();
                System.out.println("Ingresa número 2: ");
                num2 = sc.nextInt();

                suma = num1 + num2;
                resta = num1 - num2;
                multiplicacion = num1 * num2;

                System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
                System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resta);
                System.out.println("La multiplicación de " + num1 + " * " + num2 + " es: " + multiplicacion);
                break;
            case 5:
                // 1.4 Calcular el mayor de dos números enteros introducidos por teclado.
                System.out.println("Ingresa número 1: ");
                num1 = sc.nextInt();
                System.out.println("Ingresa número 2: ");
                num2 = sc.nextInt();

                if (num1 > num2) {
                    System.out.println("El número mayor es: " + num1);
                } else {
                    System.out.println("El número mayor es: " + num2);
                }
                break;
            case 6:
                // 1.5 Calcular el mayor de tres números enteros introducidos por teclado.
                System.out.println("Ingresa número 1: ");
                num1 = sc.nextInt();
                System.out.println("Ingresa número 2: ");
                num2 = sc.nextInt();
                System.out.println("Ingresa número 3: ");
                int num3 = sc.nextInt();

                // Determinar el mayor
                int mayor;
                if (num1 >= num2 && num1 >= num3) {
                    mayor = num1;
                } else if (num2 >= num1 && num2 >= num3) {
                    mayor = num2;
                } else {
                    mayor = num3;
                }

                System.out.println("El número mayor es: " + mayor);
                break;
            case 7:
                // 1.6 Calcular el mayor de tres números enteros introducidos por teclado.
                System.out.println("Ingresa número 1: ");
                num1 = sc.nextInt();
                System.out.println("Ingresa número 2: ");
                num2 = sc.nextInt();
                System.out.println("Ingresa número 3: ");
                num3 = sc.nextInt();
                System.out.println("Ingresa número 4: ");
                int num4 = sc.nextInt();

                // Determinar el mayor
                if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
                    mayor = num1;
                } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
                    mayor = num2;
                } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
                    mayor = num3;
                } else {
                    mayor = num4;
                }

                System.out.println("El número mayor es: " + mayor);
                break;
            case 8:
                /*
                 * 1.7 Determinar en que estado está el agua en función de su temperatura.
                 * Si es negativa el estado será sólido,
                 * si es menor que 100 será líquido y
                 * si es mayor que 100 será gas.
                 * Pedir al usuario el valor de la temperatura.
                 */

                System.out.println("Ingresa el valor de la temperatura: ");
                int temperatura = sc.nextInt();

                if ((temperatura * -1) < 0) {
                    System.out.println("El estado es sólido.");
                }

                if (temperatura < 100) {
                    System.out.println("El estado es líquido.");
                } else {
                    System.out.println("El estado es gaseoso.");
                }

                break;
            case 9:
                // 1.8 Un año es bisiesto si es divisible por 4 y no es por 100, o si es
                // divisible por 400. Escribe un programa que lea un año y devuelva si es
                // bisiesto o no.
                System.out.println("Ingresa el valor del año: ");
                int año = sc.nextInt();

                if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
                    System.out.println("El año " + año + " es bisiesto.");
                } else {
                    System.out.println("El año " + año + " no es bisiesto.");
                }

                break;
            case 10:
                // 1.9 Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el
                // año no es bisiesto.

                break;
            case 11:
                // 1.10 Pedir un mes (número) y mostrar el nombre del mes.
                System.out.println("Ingresa el número del mes: ");
                int mes = sc.nextInt();

                switch (mes) {
                    case 1:
                        System.out.println("Enero");
                        break;
                    case 2:
                        System.out.println("Febrero");
                        break;
                    case 3:
                        System.out.println("Marzo");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Mayo");
                        break;
                    case 6:
                        System.out.println("Junio");
                        break;
                    case 7:
                        System.out.println("Julio");
                        break;
                    case 8:
                        System.out.println("Agosto");
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        break;
                    case 10:
                        System.out.println("Octubre");
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        break;

                    default:
                        System.out.println("Solo hay 12 meses.");
                        break;
                }

                break;
            case 12:
                /*
                 * 1.11 Solicitar al usuario la inicial del día de la semana y mostrar el nombre
                 * del día completo.
                 * La letra inicial puede ser mayúscula o minúscula.Usar la x para el miércoles.
                 */
                System.out.println("Ingresa la inicial del día de la semana. Usa x para el día miércoles: ");
                String dia = sc.next().toLowerCase();

                switch (dia) {
                    case "l" :
                        System.out.println("Lunes");
                        break;
                    case "m":
                        System.out.println("Martes");
                        break;
                    case "x":
                        System.out.println("Miércoles");
                        break;
                    case "j":
                        System.out.println("Jueves");
                        break;
                    case "v":
                        System.out.println("Viernes");
                        break;
                    case "s":
                        System.out.println("Sábado");
                        break;
                    case "d":
                        System.out.println("Domingo");
                        break;
                    default:
                    System.out.println("La inicial ingresada no pertenece a ningún día de le semana.");
                    break;
                }
            case 13:
                /*1.12  Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es necesario:
                • El año debe ser mayor que cero. 
                • El mes debe estar entre 1 y 12. 
                • Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. 
                Los meses que tienen 31 días son 1, 3, 5, 7, 8, 10 y 12.
                Los meses de 30 días son 4, 6, 9 y 11.
                El mes de 28 días es 2, excepto en un año bisiesto que es 29 días. */

                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;

            default:
                // Bloque de código si no se cumple ninguno de los casos anteriores
                System.out.println("El número no es válido.");
            break;

        }

    }

}