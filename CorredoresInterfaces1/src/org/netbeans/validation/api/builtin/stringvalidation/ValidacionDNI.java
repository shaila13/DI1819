
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author Shaila
 */
public class ValidacionDNI extends StringValidator{

    @Override
    public void validate(Problems problems, String componentName, String nif) {
        //Si el largo del NIF es diferente a 9, acaba el método.
        if (!nif.equals("") && nif.length() == 9) {

            String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
            nif = nif.toUpperCase();

            //Posición inicial: 0 (primero en la cadena de texto).
            //Longitud: cadena de texto menos última posición. Así obtenemos solo el número.
            String numeroNIF = "";

            numeroNIF = nif.substring(0, nif.length() - 1);

            //Si es un NIE reemplazamos letra inicial por su valor numérico.
            numeroNIF = numeroNIF.replace("X", "0").replace("Y", "1").replace("Z", "2");

            //Obtenemos la letra con un char que nos servirá también para el índice de las secuenciaLetrasNIF
            char letraNIF = nif.charAt(8);
            int i = Integer.parseInt(numeroNIF) % 23;
            if (letraNIF != secuenciaLetrasNIF.charAt(i)) {
                String msg = NbBundle.getMessage(this.getClass(), "MSG_DNI", componentName);
                problems.add(msg);
            }
        } else {
            String msg = NbBundle.getMessage(this.getClass(), "MSG_DNI", componentName);
            problems.add(msg);
        }
    }

}
