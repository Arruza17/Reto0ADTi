/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class Utilidades {

    /**
     *
     * @return
     */
    public static LocalDate introducirFecha() {
        Scanner sc = new Scanner(System.in);
        LocalDate fecha = null;
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String aux;
        boolean error;
        do {
            error = false;
            aux = sc.next();
            try {
                fecha = LocalDate.parse(aux, formateador);
            } catch (DateTimeParseException e) {
                error = true;
                System.out.println("Error, introduce fecha con formato dd-mm-aaaa");
            }
        } while (error);
        return null;
    }

    /**
     *
     * @return
     */
    public static String introducirCadena() {
        String cadena = "";
        boolean error = false;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        do {
            error = false;
            try {
                cadena = teclado.readLine();
            } catch (IOException e) {
                System.out.println("Error en la entrada de datos");
                error = true;
            }
        } while (error);
        return cadena;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static String introducirCadena(String mensaje) {
        String cadena = "";
        boolean error = false;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);

        System.out.println(mensaje);
        do {
            error = false;
            try {
                cadena = teclado.readLine();
            } catch (IOException e) {
                System.out.println("Error en la entrada de datos");
                error = true;
            }
        } while (error);
        return cadena;
    }

    /**
     *
     * @param x
     * @return
     */
    public static String leerString(int x) {
        String cadena = null;
        boolean ok;
        do {
            ok = true;
            cadena = introducirCadena();
            if (cadena.length() > x) {
                System.out.println("Error, longitud superior a la permitida. Introduzca de nuevo: ");
                ok = false;
            }
        } while (!ok);
        return cadena;
    }

    /**
     *
     * @return
     */
    public static char leerChar() {
        boolean error = false;
        String letra;

        do {
            error = false;
            letra = introducirCadena();
            if (letra.length() != 1) {
                System.out.println("Error, introduce un carácter: ");
                error = true;
            }

        } while (error);
        return letra.charAt(0);
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static char leerChar(String mensaje) {
        char letra;
        String frase;
        System.out.println(mensaje);
        do {

            frase = introducirCadena();
            if (frase.length() != 1) {
                System.out.println("Error, introduce un único carácter: ");
            }
        } while (frase.length() != 1);
        letra = frase.charAt(0);

        return letra;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static char leerChar(char x, char y) {

        char letra;
        String frase;
        do {
            do {
                frase = introducirCadena();
                if (frase.length() != 1) {
                    System.out.println("Error, introduce un único carácter: ");
                }
            } while (frase.length() != 1);
            letra = frase.charAt(0);
            if (!(letra == x || letra == y)) {
                System.out.println("Error carácter no Valido");
            }
        } while (!(letra == x || letra == y));
        return letra;
    }

    /**
     *
     * @param caracteres
     * @return
     */
    public static char leerCharArray(char caracteres[]) {
        int i;
        boolean error = false;
        String letra;
        char aux = 0;

        do {
            error = false;
            letra = introducirCadena();
            if (letra.length() != 1) {
                System.out.println("Error, introduce un carácter: ");
                error = true;
            } else {
                aux = letra.charAt(0);
                for (i = 0; i < caracteres.length; i++) {
                    if (Character.toUpperCase(caracteres[i]) == Character.toUpperCase(aux)) {
                        break;
                    }
                }
                if (i == caracteres.length) {
                    error = true;
                    System.out.println("Error, el carácter introducido no es valido. ");
                }
            }
        } while (error);
        return aux;
    }

    /**
     *
     * @return
     */
    public static int leerInt() {
        int num = 0;
        boolean error;
        do {
            error = false;
            try {
                num = Integer.parseInt(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error, el dato no es numérico. Introduce de nuevo: ");
                error = true;
            }
        } while (error);
        return num;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static int leerInt(String mensaje) {
        int num = 0;
        boolean error;
        System.out.println(mensaje);
        do {
            error = false;
            try {
                num = Integer.parseInt(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error, el dato no es numérico. Introduce de nuevo: ");
                error = true;
            }
        } while (error);
        return num;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int leerInt(int x, int y) {
        int num;
        boolean error;
        do {
            error = false;
            try {
                num = Integer.parseInt(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error, el dato no es numérico. Introduce de nuevo: ");
                error = true;
                num = x;
            }
            if (num < x || num > y) {
                System.out.println("Error, dato fuera de rango. Introduce de nuevo: ");
                error = true;

            }
        } while (error);
        return num;
    }

    /**
     *
     * @param mensaje
     * @param x
     * @param y
     * @return
     */
    public static int leerInt(String mensaje, int x, int y) {
        int num;
        boolean error;
        System.out.println(mensaje);
        do {
            error = false;
            try {
                num = Integer.parseInt(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error, el dato no es numérico. Introduce de nuevo: ");
                error = true;
                num = x;
            }
            if (num < x || num > y) {
                System.out.println("Error, dato fuera de rango. Introduce de nuevo: ");
                error = true;

            }
        } while (error);
        return num;
    }

    /**
     *
     * @return
     */
    public static float leerFloat() {
        float num = 0;
        boolean error;
        do {
            error = false;
            try {
                num = Float.parseFloat(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error, el dato no es numérico. Introduce de nuevo: ");
                error = true;
            }
        } while (error);
        return num;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static float leerFloat(String mensaje) {
        float num = 0;
        boolean ok = true;
        System.out.println(mensaje);
        do {
            ok = true;

            try {
                num = Float.parseFloat(introducirCadena());
            } catch (NumberFormatException e) {
                ok = false;
                System.out.println("Error al introducir un número");
            }
        } while (!ok);
        return num;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static float leerFloat(float x, float y) {
        float num;
        boolean error;
        do {
            error = false;
            try {
                num = Float.parseFloat(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error, el dato no es numérico. Introduce de nuevo: ");
                error = true;
                num = x;
            }
            if (num < x || num > y) {
                System.out.println("Error, dato fuera de rango. Introduce de nuevo: ");
                error = true;

            }
        } while (error);
        return num;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static double leerDouble(double x, double y) {
        double num = 0;
        boolean ok;
        do {
            try {
                ok = true;
                num = Double.parseDouble(introducirCadena());

            } catch (NumberFormatException e) {
                System.out.println("Hay que introducir números");
                ok = false;
                num = x;

            }
            if (num < x || num > y) {
                System.out.println("Dato fuera de rango, introduce entre" + x + " y " + y);
                ok = false;
            }
        } while (!ok);
        return num;
    }

    /**
     *
     * @return
     */
    public static double leerDouble() {
        double fNumero = 0;
        boolean ok;
        do {
            try {
                ok = true;
                fNumero = Double.parseDouble(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error al introducir el n?mero");
                ok = false;
            }
        } while (!ok);
        return fNumero;
    }

    /**
     *
     * @return
     */
    public static boolean esBoolean() {
        String respu;
        do {
            respu = introducirCadena().toLowerCase();
        } while (!respu.equals("0") && !respu.equals("1") && !respu.equals("si") && !respu.equals("no") && !respu.equals("s") && !respu.equals("n") && !respu.equals("true") && !respu.equals("false"));
        if (respu.equals("1") || respu.equals("si") || respu.equals("s") || respu.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public static LocalDate leerFecha() {
        String fechaAux;
        LocalDate fecha = LocalDate.now();
        boolean error;
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            error = false;
            fechaAux = Utilidades.introducirCadena();
            try {
                fecha = LocalDate.parse(fechaAux, formateador);
            } catch (DateTimeParseException e) {
                error = true;
                System.out.println("Error,Introduce fecha con formato dd/mm/aaaa: ");
            }
        } while (error);
        return fecha;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static LocalDate leerFecha(String mensaje) {
        String fechaAux;
        LocalDate fechaNac = LocalDate.now();
        boolean error;
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(mensaje);
        do {
            error = false;
            fechaAux = Utilidades.introducirCadena();
            try {
                fechaNac = LocalDate.parse(fechaAux, formateador);
            } catch (DateTimeParseException e) {
                error = true;
                System.out.println("Error,Introduce fecha con formato dd/mm/aaaa: ");
            }
        } while (error);
        return fechaNac;
    }

    /**
     *
     * @param fecha
     * @return
     */
    public static String fechaToString(LocalDate fecha) {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String wfecha;

        wfecha = fecha.format(formateador);

        return wfecha;
    }

    /**
     *
     * @return
     */
    public static long leerLong() {
        long fNumero = 0;
        boolean ok;
        do {
            try {
                ok = true;
                fNumero = Long.parseLong(introducirCadena());
            } catch (NumberFormatException e) {
                System.out.println("Error al introducir el n?mero");
                ok = false;
            }
        } while (!ok);
        return fNumero;
    }

   

}
