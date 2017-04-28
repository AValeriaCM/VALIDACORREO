/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacorreo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import validacorreo.Validacion;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import validacorreo.ListaCorreo;

/**
 *
 * @author Angie Castañeda
 */
public class PanelCorreo extends JPanel implements ActionListener,KeyListener{
    
    private List<ListaCorreo> listaCorreo;
    
    private String mensaje;
    
    Validacion valida;
    
    ListaCorreo correo;
    
    private JLabel JLCorreo;
    
    private JLabel JLMensaje;
    
    private JTextField JTCorreo;
    
    private JButton JBConfirmar;
    
    private JButton JBGuardar;
    
    /**
     * Constructor de clase     
     */
    
    public PanelCorreo(){
        
        setLayout(null);
        
        listaCorreo = new ArrayList<ListaCorreo>();
        
        JLCorreo = new JLabel("Ingrese Correo:  ");
        JLCorreo.setBounds(10, 10, 100, 120);
        add(JLCorreo);
        
        JTCorreo = new JTextField();
        JTCorreo.setBounds(130, 65, 200, 20);
        JTCorreo.addKeyListener(this);
        add(JTCorreo);
        
        JLMensaje = new JLabel(mensaje);
        JLMensaje.setBounds(130, 95, 200, 20);
        add(JLMensaje);
        
       JBConfirmar = new JButton();
       JBConfirmar.setBounds(350, 65, 20, 20);
       JBConfirmar.setBackground(Color.gray);
       add(JBConfirmar);
       
       JBGuardar = new JButton("Guardar");
       JBGuardar.setBounds(130, 135, 200, 20);
       JBGuardar.addActionListener(this);
       add(JBGuardar);
        
        
    }

    /**
     * Escuchador de eventos para botones     
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(validarDatos()){
            correo = new ListaCorreo(JTCorreo.getText()); 
            
            JOptionPane.showMessageDialog(this, "Correo creado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
        }
    }
    
    private void vaciarDatos() {
        JTCorreo.setText("");
        JLCorreo.setForeground(Color.BLACK);
    }
    
     private boolean validarDatos() {
        if(JTCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío, ingrese datos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            JLCorreo.setForeground(Color.red);
            return false;
        } 
        return true;
     }
    
    /**
     * Escuchador de eventos para teclas     
     */
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int i = 0;
        
        JTextField textField = (JTextField) e.getSource();
        String text = textField.getText();
        int tama = text.length();
        if(tama >= 4){
        Validacion valida1 = new Validacion(text);
        valida1.getMensaje();
        JLMensaje.setText(valida1.getMensaje());
         if(valida1.getColor()==0){
           JLMensaje.setForeground(Color.RED);
           JBConfirmar.setBackground(Color.RED);
        } else {
             JLMensaje.setForeground(Color.GREEN);
             JBConfirmar.setBackground(Color.GREEN);
         }
        }
       
        
        
        if(text.length()==0){
           JLMensaje.setText("");
       }
    }
    /**
    * 
    * Metodo que retorna
     * @return 
    */
    public List<ListaCorreo> getListaCorreo() {
        return listaCorreo;
    }
    /**
    * 
    * Metodo que modifica 
     * @param listaCorreo
    */
    public void setListaCorreo(List<ListaCorreo> listaCorreo) {
        this.listaCorreo = listaCorreo;
    }
    

 }
    

