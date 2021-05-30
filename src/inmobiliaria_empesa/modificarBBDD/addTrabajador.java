/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_empesa.modificarBBDD;

import inmobiliaria_empresa_clases_usuarios.Trabajador;
import inmobiliaria_empresa_clases_usuarios.Usuario;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Alex
 */
public class addTrabajador extends javax.swing.JFrame {
    private Usuario ebo = new Usuario();
    private Trabajador isa = new Trabajador();

    public addTrabajador() throws SQLException {
        initComponents();
        
    }
    public TableModel listarUsuario(JTable tablaUsuarios){
        try{
            String[][] t=ebo.listarUsuario(TablaUsuarios);
            String [] columnas = {"NICK","CONTRASENA","NOMBRE","APELLIDO1","APELLIDO2","CORREO","EDAD","NUM_TELEFONO","ID"};
            System.out.println(Arrays.toString(t));
            DefaultTableModel myData = new DefaultTableModel(t,columnas );
            return myData;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public TableModel listarTrabajador(JTable tablaUsuarios){
        try{
            String[][] t=isa.listarTrabajador();
            String [] columnas = {"ID_USUARIO","SUELDO","VENTAS","ID_TRABAJADOR"};
            System.out.println(Arrays.toString(t));
            DefaultTableModel myData = new DefaultTableModel(t,columnas );
            return myData;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        CrearTrabajadorjButton1 = new javax.swing.JButton();
        SueldojTextField1 = new javax.swing.JTextField();
        ventasjTextField2 = new javax.swing.JTextField();
        ID_UsuariojTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTrabajadores = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuarios");

        TablaUsuarios.setModel(listarUsuario(TablaUsuarios));
        jScrollPane1.setViewportView(TablaUsuarios);

        CrearTrabajadorjButton1.setText("Crear trabajador");
        CrearTrabajadorjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTrabajadorjButton1ActionPerformed(evt);
            }
        });

        SueldojTextField1.setBackground(new java.awt.Color(255, 255, 255));

        ventasjTextField2.setBackground(new java.awt.Color(255, 255, 255));

        ID_UsuariojTextField3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sueldo");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ventas");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID Usuario");

        TablaTrabajadores.setModel(listarTrabajador(TablaTrabajadores));
        jScrollPane2.setViewportView(TablaTrabajadores);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Trabajadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SueldojTextField1)
                                    .addComponent(ventasjTextField2)
                                    .addComponent(ID_UsuariojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(CrearTrabajadorjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SueldojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ventasjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_UsuariojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CrearTrabajadorjButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearTrabajadorjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTrabajadorjButton1ActionPerformed
        // TODO add your handling code here:
        Trabajador trab= new Trabajador();
        Trabajador meter=new Trabajador();
        int sueldo=Integer.parseInt(SueldojTextField1.getText());
        int ventas=Integer.parseInt(ventasjTextField2.getText());
        int id_usuario=Integer.parseInt(ID_UsuariojTextField3.getText());
        
        trab.setId_usuario(id_usuario);
        trab.setSueldo(sueldo);
        trab.setVentas(ventas);
        try {
            meter.agregarTrabajador(trab);
            JOptionPane.showMessageDialog(null,"Has creado un trabajador");
            
        } catch (Exception e) {
            System.out.println("Ha fallado");
        }
        
    }//GEN-LAST:event_CrearTrabajadorjButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearTrabajadorjButton1;
    private javax.swing.JTextField ID_UsuariojTextField3;
    private javax.swing.JTextField SueldojTextField1;
    private javax.swing.JTable TablaTrabajadores;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ventasjTextField2;
    // End of variables declaration//GEN-END:variables
}
