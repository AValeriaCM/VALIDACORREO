/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacorreo;

import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import validacorreo.ListaCorreo;

/**
 *
 * @author Angie Castañeda
 */
public class PanelMuestra extends JDialog{
    
    JPanel panel;
    JTable tablaArtista;
    
    private DefaultTableModel dtm;
    private PanelCorreo correo1;
    
    public PanelMuestra(PanelCorreo correo) {
        this.correo1 = correo;
        setSize(300, 300);
        setTitle("CONSULTA CORREOS");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("CORREOS"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaArtista = new JTable(dtm);
        
        Object[] columna = {"Correos Electrónicos Guardados"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        
        JScrollPane scrollPane = new JScrollPane(tablaArtista);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
    }
    
    public void actualizarTabla() {
         List<ListaCorreo> lista = this.correo1.getListaCorreo();
         for (ListaCorreo email1 : lista) {
             Object[] fila = {email1.getCorreo()};
             dtm.addRow(fila);
        }
    }

}