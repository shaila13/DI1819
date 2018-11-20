/*Creación de un componente que permita introducir un texto. El componente 
tendrá una propiedad de tipo Color, que será el color de fondo del componente 
cuando el usuario haya introducido un número de caracteres superior al número 
indicado por una segunda propiedad de tipo entero.*/
package modelo;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Shaila
 */
public class ComponenteTexto extends JTextField implements Serializable {

    /**
     * PASOS PARA CREAR UN COMPONENTE. 1º Clase que extiende del componenete a
     * crear. 2º Implements Serializable. 3º Constructor sin parámetros. 4º
     * Getters y Setters por defecto. 5º Compilar el proyecto del componente
     * (botón derecho sobre el proyecto, y pulsar Clean and Build). 6º Agregar a
     * paleta. (Botón derecho-- Tools>Add to palette. Elegir la categoría en la
     * que queremos meter el componente y pulsamos Aceptar).
     */
    private int characters=5;
    private Color backgroundColor; //Será el color de fondo.
    private Color background;

    public ComponenteTexto() {
        super();
        //Salvamos el color que tenia el componente por defecto.
        background = getBackground();
        super.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                analizaContenido();
            }
            @Override
            public void removeUpdate(DocumentEvent de) {
                analizaContenido();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                analizaContenido();
            }
        });
    }

    /**
     * Método propio que analizará el contenido que introduce el usuario por
     * pantalla.
     */
    private void analizaContenido() {

        if (getText().length() >= characters) {
            setBackground(backgroundColor);
        } else {
            setBackground(background);
        }
    }
    
    //Getters y Setters
    public int getCharacters() {
        return characters;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}
