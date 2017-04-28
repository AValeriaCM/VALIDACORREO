/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacorreo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Angie Castañeda
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    /**
     * Variables privadas    
     */
    private JMenuBar menuBar;
    
    private JMenu MBPrincipal;
    
    private JMenu MBVer;
    
    private JMenuItem MIAyuda;
    
    private JMenuItem MINosotros;
    
    private JMenuItem MISalir;
    
    private JMenuItem MInfo;
    
    private PanelImagen panelImg;
    
    private PanelCorreo panelCorreo;
    
    
    
    /**
     * Variables estaticas privadas    
     */
    
    private static final String AYUDA = "AYUDA";
    
    private static final String INFO = "INFO";
    
    private static final String SALIR = "SALIR";
    
    /**
     * Constructor de clase     
     */
    
    public VentanaPrincipal() {
        setSize(600, 600);
        setTitle("Titulo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        
        panelImg = new PanelImagen();
        panelImg.setBounds(10, 10, 565, 265);
        getContentPane().add(panelImg);
        
        panelCorreo = new PanelCorreo();
        panelCorreo.setBounds(10, 250, 565, 265);
        getContentPane().add(panelCorreo);
        
        menuBar = new JMenuBar();        
        setJMenuBar(menuBar);
        
        MBPrincipal = new JMenu("Principal");
        
        MIAyuda = new JMenuItem("Ayuda");
        MIAyuda.setActionCommand(AYUDA);
        MIAyuda.addActionListener(this);
        MINosotros = new JMenuItem("Nosotros");
        MISalir = new JMenuItem("Salir");
        MISalir.setActionCommand(SALIR);
        MISalir.addActionListener(this);
        
        MBPrincipal.add(MIAyuda);
        MBPrincipal.add(MINosotros);
        MBPrincipal.add(MISalir);
        menuBar.add(MBPrincipal);
        
        MBVer = new JMenu("Ver");
        
        MInfo = new JMenuItem("Info");
        MInfo.setActionCommand(INFO);
        MInfo.addActionListener(this);
        
        MBVer.add(MInfo);
        menuBar.add(MBVer);
        
        
        setVisible(true);
    }
    /**
     * Escuchador de eventos
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(AYUDA)) {
            System.out.println("principal");
        } else if(e.getActionCommand().equals(INFO)) {
            PanelMuestra panelMuestra1 = new PanelMuestra(panelCorreo);
              panelMuestra1.setVisible(true);
        } else if(e.getActionCommand().equals(SALIR)) {
            System.exit(0);
        }
    }
 
}
