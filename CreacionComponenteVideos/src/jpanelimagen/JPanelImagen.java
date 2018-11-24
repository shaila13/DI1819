package jpanelimagen;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Shaila
 */
public class JPanelImagen extends JPanel implements Serializable {

    //Atributos
    private ImagenFondo imagenFondo;
    private boolean ratonPresionado = false;
    private Point puntoPresion= new Point();
    private ArrastreListener arrastreListener;

    /**
     * Constructor sin parámetros.
     */
    public JPanelImagen() {
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent me) {

                if (ratonPresionado) {
                    Point posicionActual = me.getPoint();
                    if (Math.abs(puntoPresion.x - posicionActual.x) > 50) {
                        if (arrastreListener != null) {
                            //Hacemos una interface cuando no sabemos que programar aún
                            arrastreListener.arrastre();
                        }

                    }
                }
                ratonPresionado = false;

            }

            @Override
            public void mousePressed(MouseEvent me) {
                ratonPresionado = true;

            }

        });

    }

    /**
     * Mecanismo para que nos pasen un listener.
     *
     * @param arrastreListener
     */
    public void addArrastreListener(ArrastreListener arrastreListener) {
        this.arrastreListener = arrastreListener;
    }

    /**
     * Por si el usuario quiere borrar el listener.
     *
     */
    public void removeArrastreListener() {
        this.arrastreListener = null;
    }
//Getters y Setters

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
        repaint();
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {

            if (imagenFondo.getRutaImagen() != null && imagenFondo.getRutaImagen().exists()) {

                ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                        imagenFondo.getOpacidad()));
                g.drawImage(imageIcon.getImage(), 0, 0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }

}
