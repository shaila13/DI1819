package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import logica.LogicaCorredores;
import modelo.Corredor;
import modelo.ExcepcionErrorDatos;
import paqueteLeerDatos.Leer;

/**
 *
 * @author Shaila
 */
public class ControladorCorredor {

    private LogicaCorredores trabajarMap = new LogicaCorredores();
    private Corredor corredor = new Corredor();
    private SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
    private String dniCorredor;

    public ControladorCorredor() {
    }
    public void menu() throws ParseException {
        int opcion;
        do {
            System.out.println("\n-----------------MENU------------------");
            System.out.println("1. Dar de alta corredor.");
            System.out.println("2. Dar de baja corredor.");
            System.out.println("3. Modificar corredor.");
            System.out.println("4. Buscar un corredor.");
            System.out.println("5. Guardar datos en CSV.");
            System.out.println("6. Ordenar corredores.");
            System.out.println("0. Salir.");
            System.out.println("\n Introduce una opción (1-6) 0 para salir.");

            opcion = Leer.datoInt();

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    darAltaCorredor();
                    break;
                case 2:
                    meterDni();
            switch (trabajarMap.darBajaCorredor(dniCorredor)) {
                case 0:
                    System.out.println("El corredor ha sido borrado "
                            + "satisfactoriamente.");
                    break;
                case -1:
                    System.out.println("No hay ningún corredor en la "
                            + "colección.");
                    break;
                case 1:
                    System.out.println("El corredor no ha sido encontrado.");
                    break;
                default:
                    break;
            }
                    break;
                case 3:
                    modificarCorredor();
                    break;
                case 4:
                    meterDni();
            switch (trabajarMap.buscarCorredor(dniCorredor)) {
                case 0:
                    System.out.println(trabajarMap.getCorredores().get(dniCorredor));
                    break;
                case -1:
                    System.out.println("No hay ningún corredor en la "
                            + "colección.");
                    break;
                case 1:
                    System.out.println("El corredor no ha sido "
                            + "encontrado.");
                    break;
                default:
                    break;
            }
                    break;
                case 5:
                    guardarDatosCorredor();
                    break;
                case 6:
                    if (trabajarMap.getCorredores().size() != 0) {
                        trabajarMap.ordenarCorredores();
                    } else {
                        System.out.println("No hay ningún corredor en la lista.");
                    }
                    break;
                default:
                    System.out.println("Introduce una opción CORRECTA (1-6) 0 "
                            + "para salir.");
            }
        } while (opcion != 0);
    }
    private String meterDni() {

        System.out.println("\nIntroduzca el número DNI: ");
        int dniNumero = Leer.datoInt();
        if (!controlarLongitudDni(dniNumero)) {
            try {
                throw new ExcepcionErrorDatos("Error, no has introducido 8 dígitos.");
            } catch (ExcepcionErrorDatos ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("\nIntroduzca la letra del DNI: ");
        String dniLetra = Leer.leerDato();
        if (dniLetra.length() != 1) {
            try {
                throw new ExcepcionErrorDatos("Error, has introducido más de una letra.");
            } catch (ExcepcionErrorDatos ex) {
                System.out.println(ex.getMessage());
            }
        }

        dniCorredor = Integer.toString(dniNumero) + dniLetra;

        return dniCorredor;
    }

    private void guardarDatosCorredor() throws ParseException {
        Corredor p;
        FileWriter fw = null;
        File file = new File("Corredores.csv");
        Iterator it = trabajarMap.getCorredores().keySet().iterator();
        if (file.exists()) {
            String linea;
            try {

                BufferedReader br = new BufferedReader(new FileReader("Corredores.csv"));
                linea = br.readLine(); //lee la primera linea

                while (linea != null) {
                    StringTokenizer srt = new StringTokenizer(linea, ",");
                    while (srt.hasMoreTokens()) {
                        String nombre = srt.nextToken().trim();
                        String dni = srt.nextToken().trim();
                        Date fechaNacimiento = fecha.parse(srt.nextToken().trim());
                        String direccion = srt.nextToken().trim();
                        int telefono = Integer.parseInt(srt.nextToken().trim());
                        p = new Corredor(nombre, dni, fechaNacimiento,
                                direccion, telefono);
                        trabajarMap.añadirCorredorColeccion(p);
                    }
                    linea = br.readLine();
                }
                br.close();

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            darAltaCorredor();
            trabajarMap.verColeccion();
        }

        while (it.hasNext()) {
            String key = (String) it.next();
            try {
                //si no pongo true cuando grabe solo graba el primero
                fw = new FileWriter("Corredores.csv", true);
                BufferedWriter fsalida = new BufferedWriter(fw);
                //leemos el primer registro
                p = new Corredor();
                String fnacimiento = fecha.format(
                        trabajarMap.getCorredores().get(key).getFechaNacimiento());
                fsalida.write(trabajarMap.getCorredores().get(key).getNombre()
                        + "," + trabajarMap.getCorredores().get(key).getDni()
                        + "," + fnacimiento + ","
                        + trabajarMap.getCorredores().get(key).getDireccion()
                        + ","
                        + trabajarMap.getCorredores().get(key).getTelefono());
                fsalida.write("\n");
                fsalida.close();
            } catch (IOException ex) {
                ex.printStackTrace();

            }

        }
        System.out.println("Se ha grabado con éxito el CSV.");
    }

//FORMATEAR UNA FECHA OJO!!
    private void darAltaCorredor() {
        try {
            System.out.println("Introduzca el nombre: ");
            String nombreCorredor = Leer.leerDato();

            if (!controlarNombre(nombreCorredor)) {
                throw new ExcepcionErrorDatos("Error, has introducido un caracter invalido");
            }
            System.out.println("\nIntroduzca el número DNI: ");
            int dniNumero = Leer.datoInt();
            if (!controlarLongitudDni(dniNumero)) {
                throw new ExcepcionErrorDatos("Error, no has introducido 8 dígitos.");
            }
            System.out.println("\nIntroduzca la letra del DNI: ");
            String dniLetra = Leer.leerDato();
            if (dniLetra.length() != 1) {
                throw new ExcepcionErrorDatos("Error, has introducido más de una letra.");
            }

            String dni = Integer.toString(dniNumero) + dniLetra;
            System.out.println("\nIntroduzca la fecha de nacimiento: "
                    + "(FORMATO: dd/mm/yy)");
            String fechaNacimiento = Leer.leerDato();

            Date fechaNacimientoDate = fecha.parse(fechaNacimiento);

            System.out.println("\nIntroduzca la dirección del corredor: ");
            String direccion = Leer.leerDato();

            System.out.println("\nIntroduzca el teléfono del corredor: ");
            int telefono = Leer.datoInt();
            if (!controlarLongitudTelefono(telefono)) {
                throw new ExcepcionErrorDatos("Error, no has introducido 9 dígitos.");
            }

            corredor = new Corredor(nombreCorredor, dni, fechaNacimientoDate,
                    direccion, telefono);
            System.out.println("El corredor ha sido  creado correctamente.");
            if (trabajarMap.añadirCorredorColeccion(corredor)) {
                System.out.println("\nEl corredor ha sido agregado "
                        + "correctamente a la colección.");
            } else {
                System.out.println("No se ha podido agregar el corredor a la "
                        + "colección.");
            }
        } catch (ParseException e) {
            System.out.println("No ha introducido un formato de fecha válido.");
        } catch (NumberFormatException e) {
            System.out.println("No ha introducido un número.");
        } catch (ExcepcionErrorDatos ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void modificarCorredor() {
        meterDni();
        Iterator it = trabajarMap.getCorredores().keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (key.equalsIgnoreCase(dniCorredor)) {
                System.out.println("¿Qué campo desea modificar?");
                System.out.println("Introduzca: nombre/dni/fecha/"
                        + "direccion/telefono");
                String var = Leer.leerDato();
                switch (var) {
                    case "nombre":
                        System.out.println("Introduzca el nombre: ");
                        String nombreCorredor = Leer.leerDato();
                        if (!controlarNombre(nombreCorredor)) {
                            try {
                                throw new ExcepcionErrorDatos("Error, has "
                                        + "introducido un caracter invalido");
                            } catch (ExcepcionErrorDatos ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                        trabajarMap.getCorredores().get(key).setNombre(nombreCorredor);
                        break;
                    case "dni":
                        try {
                            System.out.println("\nIntroduzca el número del DNI: ");
                            int dniNumero = Leer.datoInt();
                            if (!controlarLongitudDni(dniNumero)) {
                                throw new ExcepcionErrorDatos("Error, no has introducido 8 dígitos.");
                            }
                            System.out.println("\nIntroduzca la letra del DNI: ");
                            char dniLetra = Leer.datoCaracter();
                            if (dniLetra != 1) {
                                throw new ExcepcionErrorDatos("Error, has "
                                        + "introducido más de una letra.");
                            }
                            String dni = Integer.toString(dniNumero) + dniLetra;
                            trabajarMap.getCorredores().get(key).setDni(dni);
                        } catch (NumberFormatException e) {
                            System.out.println("No ha introducido un número.");
                        } catch (ExcepcionErrorDatos ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case "fecha":
                        try {
                            System.out.println("\nIntroduzca la fecha de "
                                    + "nacimiento: (FORMATO: dd/mm/yy)");
                            String fechaNacimiento = Leer.leerDato();
                            Date fechaNacimientoDate = fecha.parse(fechaNacimiento);
                            trabajarMap.getCorredores().get(key).setFechaNacimiento(fechaNacimientoDate);
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    case "direccion":
                        System.out.println("\nIntroduzca la dirección del "
                                + "corredor: ");
                        String direccion = Leer.leerDato();
                        trabajarMap.getCorredores().get(key).setDireccion(direccion);
                        break;
                    case "telefono":
                        try {
                            System.out.println("\nIntroduzca el teléfono del "
                                    + "corredor: ");
                            int telefono = Leer.datoInt();
                            if (!controlarLongitudTelefono(telefono)) {
                                throw new ExcepcionErrorDatos("Error, no has introducido 9 dígitos.");
                            }

                            trabajarMap.getCorredores().get(key).setTelefono(telefono);
                        } catch (NumberFormatException e) {
                            System.out.println("No ha introducido un número.");
                        } catch (ExcepcionErrorDatos ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    default:
                        System.out.println("No ha introducido un valor correcto,"
                                + "\nIntroduzca: nombre/dni/fecha/direccion/telefono");
                }
                System.out.println("El corredor ha sido modificado "
                        + "satisfactoriamente.");
            } else if (!key.equalsIgnoreCase(dniCorredor)
                    || trabajarMap.getCorredores().size() == 0) {
                System.out.println("El corredor no ha sido encontrado.");
            }
        }
    }

    private static boolean controlarLongitudDni(int dniNumero) {
        boolean resultado = false;
        String dni = Integer.toString(dniNumero);
        if (dni.length() == 8) {
            resultado = true;
        }
        return resultado;
    }
    private static boolean controlarLongitudTelefono(int telefono) {
        boolean resultado = false;
        String telf = Integer.toString(telefono);
        if (telf.length() == 9) {
            resultado = true;
        }
        return resultado;
    }
    public static boolean controlarNombre(String cadena) {
        boolean resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            int asciiValue = (int) cadena.charAt(i);
            if (asciiValue > 64 && asciiValue < 91 || asciiValue > 96
                    && asciiValue < 123) {
                resultado = true;

            }
        }
        return resultado;
    }
}
