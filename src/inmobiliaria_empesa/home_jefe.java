package inmobiliaria_empesa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro y Marta
 */
public class home_jefe extends javax.swing.JFrame {

    /**
     * Creates new form panel_control
     */
    public home_jefe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BCalculadora = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();
        botonventa = new javax.swing.JButton();
        BCitas = new javax.swing.JButton();
        botonalquiler = new javax.swing.JButton();
        BBDDBoton = new javax.swing.JButton();
        botonModPisos = new javax.swing.JButton();
        BCrearTrabajador = new javax.swing.JButton();
        eliminarTrabajadorBotton = new javax.swing.JButton();

        jButton1.setText("Concerta cita");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Home", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        BCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculator_icon-icons.com_50442.png"))); // NOI18N
        BCalculadora.setText("Calculadora");
        BCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCalculadoraActionPerformed(evt);
            }
        });

        botonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        botonExit.setText("Salir");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });

        botonventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/VentaPiso64.png"))); // NOI18N
        botonventa.setText("Pisos en venta");
        botonventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonventaActionPerformed(evt);
            }
        });

        BCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visita.png"))); // NOI18N
        BCitas.setText("Citas");
        BCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCitasActionPerformed(evt);
            }
        });

        botonalquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/alquilerPiso64.png"))); // NOI18N
        botonalquiler.setText("Alquileres");
        botonalquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonalquilerActionPerformed(evt);
            }
        });

        BBDDBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_BBDD62basico.png"))); // NOI18N
        BBDDBoton.setText("Base de datos");
        BBDDBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBDDBotonActionPerformed(evt);
            }
        });

        botonModPisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/modificar64.png"))); // NOI18N
        botonModPisos.setText("Modificar pisos");
        botonModPisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModPisosActionPerformed(evt);
            }
        });

        BCrearTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/empleado64.png"))); // NOI18N
        BCrearTrabajador.setText("Crear cuenta trabajador");
        BCrearTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCrearTrabajadorActionPerformed(evt);
            }
        });

        eliminarTrabajadorBotton.setText("Mod Trabajador");
        eliminarTrabajadorBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTrabajadorBottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonventa, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonalquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BCrearTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonModPisos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BBDDBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(eliminarTrabajadorBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonExit)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonalquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonventa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonModPisos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eliminarTrabajadorBotton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCrearTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBDDBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(botonExit))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCalculadoraActionPerformed
        // TODO add your handling code here:
        Calculadora hipoteca = new Calculadora();
        hipoteca.setVisible(true);
        
        
        
    }//GEN-LAST:event_BCalculadoraActionPerformed

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_botonExitActionPerformed

    private void BCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCitasActionPerformed
        // TODO add your handling code here:
        ConCita cita = new ConCita();
        cita.setVisible(true);
        
    }//GEN-LAST:event_BCitasActionPerformed

    private void BBDDBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBDDBotonActionPerformed
        // TODO add your handling code here:
        ConsBBDD consultas = new ConsBBDD();
        consultas.setVisible(true);
    }//GEN-LAST:event_BBDDBotonActionPerformed

    private void botonventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonventaActionPerformed
        // TODO add your handling code here:
        Pisos_venta venta = new Pisos_venta();
        venta.setVisible(true);
    }//GEN-LAST:event_botonventaActionPerformed

    private void BCrearTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCrearTrabajadorActionPerformed
        // TODO add your handling code here:
        try {
            addTrabajador add = new addTrabajador();
            add.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_BCrearTrabajadorActionPerformed

    private void botonalquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonalquilerActionPerformed
        // TODO add your handling code here:
        Pisos_alquiler alquiler = new Pisos_alquiler();
        alquiler.setVisible(true);
    }//GEN-LAST:event_botonalquilerActionPerformed

    private void eliminarTrabajadorBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTrabajadorBottonActionPerformed
        // TODO add your handling code here:
        ModificarTrabajador delete= new ModificarTrabajador();
        delete.setVisible(true);
    }//GEN-LAST:event_eliminarTrabajadorBottonActionPerformed

    private void botonModPisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModPisosActionPerformed
        // TODO add your handling code here:
        Modificar_pisos mod = new Modificar_pisos();
        mod.setVisible(true);
    }//GEN-LAST:event_botonModPisosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_jefe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBDDBoton;
    private javax.swing.JButton BCalculadora;
    private javax.swing.JButton BCitas;
    private javax.swing.JButton BCrearTrabajador;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonModPisos;
    private javax.swing.JButton botonalquiler;
    private javax.swing.JButton botonventa;
    private javax.swing.JButton eliminarTrabajadorBotton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private Pisos_alquiler Pisos_alquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
