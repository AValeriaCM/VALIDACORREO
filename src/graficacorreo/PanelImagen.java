/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacorreo;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
/**
 *
 * @author Angie Castañeda
 */
public class PanelImagen extends JPanel{
    
    private JLabel etiquetaImagen;
    private JLabel info;
    
    public PanelImagen(){
        setBackground(Color.WHITE);
        setBorder(new LineBorder (Color.GRAY));
        ImageIcon icon = new ImageIcon("imagenes/logo.JPG");
        etiquetaImagen = new JLabel();
        etiquetaImagen.setIcon(icon);
        add(etiquetaImagen);
        
        String texto = "<html><body>Angie Valeria Castañeda Moreno<br>Leidy Milena Torres Guerrero<br>Ing. de Sistemas</body></html>";
        info = new JLabel(texto); 
        add(info);
        
    }
}
