/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_presentacion;

/**
 *
 * @author PC26
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle(".: SISTEMA DE CONTROL DE PCs :.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        contenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRegComputadora = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuBuscarxSerie = new javax.swing.JMenuItem();
        mnuRegEstadoCompu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuRepListadoGeneral = new javax.swing.JMenuItem();
        mnuRepCompuxMarca = new javax.swing.JMenuItem();
        mnuRepCompuxEstado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuAcercaDe = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Mantenimiento");

        mnuRegComputadora.setText("Registrar Computadora");
        mnuRegComputadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegComputadoraActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRegComputadora);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Procesos");

        mnuBuscarxSerie.setText("Buscar Computadora x Serie");
        mnuBuscarxSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBuscarxSerieActionPerformed(evt);
            }
        });
        jMenu2.add(mnuBuscarxSerie);

        mnuRegEstadoCompu.setText("Registrar Estado Actual Computadora");
        mnuRegEstadoCompu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegEstadoCompuActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRegEstadoCompu);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Reportes");

        mnuRepListadoGeneral.setText("Listado General");
        mnuRepListadoGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRepListadoGeneralActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRepListadoGeneral);

        mnuRepCompuxMarca.setText("Listado Computadoras x Marca");
        mnuRepCompuxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRepCompuxMarcaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRepCompuxMarca);

        mnuRepCompuxEstado.setText("Cantidad de computadoras x Estado");
        mnuRepCompuxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRepCompuxEstadoActionPerformed(evt);
            }
        });
        jMenu4.add(mnuRepCompuxEstado);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ayuda");

        mnuAcercaDe.setText("Acerca de");
        jMenu5.add(mnuAcercaDe);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRegComputadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegComputadoraActionPerformed
        // TODO add your handling code here:
        frmRegistrarPC  objForm = new frmRegistrarPC();
        contenedor.add(objForm);
        objForm.setVisible(true);
    }//GEN-LAST:event_mnuRegComputadoraActionPerformed

    private void mnuRepListadoGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRepListadoGeneralActionPerformed
        // TODO add your handling code here:
        frmListadoComputadoras objForm = new frmListadoComputadoras();
        contenedor.add(objForm);
        objForm.setVisible(true);
    }//GEN-LAST:event_mnuRepListadoGeneralActionPerformed

    private void mnuBuscarxSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBuscarxSerieActionPerformed
        // TODO add your handling code here:
        frmBuscarComputadora  objForm = new frmBuscarComputadora();
        contenedor.add(objForm);
        objForm.setVisible(true);
    }//GEN-LAST:event_mnuBuscarxSerieActionPerformed

    private void mnuRegEstadoCompuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegEstadoCompuActionPerformed
        // TODO add your handling code here:
        frmModificarEstado  objForm = new frmModificarEstado();
        contenedor.add(objForm);
        objForm.setVisible(true);
    }//GEN-LAST:event_mnuRegEstadoCompuActionPerformed

    private void mnuRepCompuxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRepCompuxMarcaActionPerformed
        // TODO add your handling code here:
        frmListadoxMarca  objForm = new frmListadoxMarca();
        contenedor.add(objForm);
        objForm.setVisible(true);
    }//GEN-LAST:event_mnuRepCompuxMarcaActionPerformed

    private void mnuRepCompuxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRepCompuxEstadoActionPerformed
        // TODO add your handling code here:
        frmCantidadCompuxEstado  objForm = new frmCantidadCompuxEstado();
        contenedor.add(objForm);
        objForm.setVisible(true);
    }//GEN-LAST:event_mnuRepCompuxEstadoActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        //ListaComputadoras.grabarDatos();
        this.dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenuItem mnuBuscarxSerie;
    private javax.swing.JMenuItem mnuRegComputadora;
    private javax.swing.JMenuItem mnuRegEstadoCompu;
    private javax.swing.JMenuItem mnuRepCompuxEstado;
    private javax.swing.JMenuItem mnuRepCompuxMarca;
    private javax.swing.JMenuItem mnuRepListadoGeneral;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
