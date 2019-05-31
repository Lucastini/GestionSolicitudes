/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import negocio.GestorSolicitudes;

/**
 *
 * @author Mosqueteros
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private GestorSolicitudes gestor;
    
    public VentanaPrincipal() {
        initComponents();
        gestor=new GestorSolicitudes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmenuSolicitudes = new javax.swing.JMenu();
        jMenuItemNuevaSolicitud = new javax.swing.JMenuItem();
        jitemMostrarSolicitud = new javax.swing.JMenu();
        jMenuItemMostrarSolicitudes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmenuSolicitudes.setText("Solicitudes");

        jMenuItemNuevaSolicitud.setText("Nueva Solicitud");
        jMenuItemNuevaSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaSolicitudActionPerformed(evt);
            }
        });
        jmenuSolicitudes.add(jMenuItemNuevaSolicitud);

        jMenuBar1.add(jmenuSolicitudes);

        jitemMostrarSolicitud.setText("Reportes");

        jMenuItemMostrarSolicitudes.setText("Mostrar Solicitudes");
        jMenuItemMostrarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMostrarSolicitudesActionPerformed(evt);
            }
        });
        jitemMostrarSolicitud.add(jMenuItemMostrarSolicitudes);

        jMenuBar1.add(jitemMostrarSolicitud);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevaSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaSolicitudActionPerformed
        VentanaNuevaSolicitud vns=new VentanaNuevaSolicitud(this, gestor);
        vns.setVisible(true);
    }//GEN-LAST:event_jMenuItemNuevaSolicitudActionPerformed

    private void jMenuItemMostrarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMostrarSolicitudesActionPerformed
        VentanaReportes vr=new VentanaReportes(this, gestor);
        vr.setVisible(true);
    }//GEN-LAST:event_jMenuItemMostrarSolicitudesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMostrarSolicitudes;
    private javax.swing.JMenuItem jMenuItemNuevaSolicitud;
    private javax.swing.JMenu jitemMostrarSolicitud;
    private javax.swing.JMenu jmenuSolicitudes;
    // End of variables declaration//GEN-END:variables
}