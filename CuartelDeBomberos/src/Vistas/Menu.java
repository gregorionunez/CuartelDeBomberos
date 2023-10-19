/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Vistas.Bombero.ListaDeBomberos;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        jbAltaSiniestro.setIcon(setIcono("/Imagenes/fuego.png", jbAltaSiniestro));
        jbAltaSiniestro.setPressedIcon(setIconoPresionado("/Imagenes/fuego.png", jbAltaSiniestro, 30, 15));
        jbModificarSiniestro.setIcon(setIcono("/Imagenes/lapiz.png", jbModificarSiniestro));
        jbModificarSiniestro.setPressedIcon(setIconoPresionado("/Imagenes/lapiz.png", jbModificarSiniestro, 30, 15));
        jbCerrarSiniestro.setIcon(setIcono("/Imagenes/cerca.png", jbCerrarSiniestro));
        jbCerrarSiniestro.setPressedIcon(setIconoPresionado("/Imagenes/cerca.png", jbCerrarSiniestro, 30, 15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/background3.jpg"));
        Image miImagen = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jbModificarSiniestro = new javax.swing.JButton();
        jbCerrarSiniestro = new javax.swing.JButton();
        jbAltaSiniestro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMGestionDeRecursos = new javax.swing.JMenu();
        jMIBomberos = new javax.swing.JMenuItem();
        jMIBrigada = new javax.swing.JMenuItem();
        jMICuartel = new javax.swing.JMenuItem();
        jMGestionDeSiniestros = new javax.swing.JMenu();
        jMIAltaSiniestro = new javax.swing.JMenuItem();
        jMIModificacionSiniestro = new javax.swing.JMenuItem();
        jMICierreSiniestro = new javax.swing.JMenuItem();
        jMEstadisticas = new javax.swing.JMenu();
        jMIInformacionBrigadas = new javax.swing.JMenuItem();
        jMIBomberosPorBrigadas = new javax.swing.JMenuItem();
        jMIBrigadasPorCuartel = new javax.swing.JMenuItem();
        jMIInformacionDeSiniestros = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alta de Siniestro");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bomberos");

        jbModificarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarSiniestroActionPerformed(evt);
            }
        });

        jbCerrarSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSiniestroActionPerformed(evt);
            }
        });

        jbAltaSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaSiniestroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alta de Siniestro");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modificación de Siniestro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cerrar Siniestro");

        escritorio.setLayer(jbModificarSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbCerrarSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbAltaSiniestro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jbAltaSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jbModificarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbCerrarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAltaSiniestro, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jbModificarSiniestro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCerrarSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jMGestionDeRecursos.setText("Gestión de Recursos");

        jMIBomberos.setText("Bomberos");
        jMIBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBomberosActionPerformed(evt);
            }
        });
        jMGestionDeRecursos.add(jMIBomberos);

        jMIBrigada.setText("Brigada");
        jMGestionDeRecursos.add(jMIBrigada);

        jMICuartel.setText("Cuartel");
        jMICuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICuartelActionPerformed(evt);
            }
        });
        jMGestionDeRecursos.add(jMICuartel);

        jMenuBar1.add(jMGestionDeRecursos);

        jMGestionDeSiniestros.setText("Gestión de Siniestros");

        jMIAltaSiniestro.setText("Alta");
        jMGestionDeSiniestros.add(jMIAltaSiniestro);

        jMIModificacionSiniestro.setText("Modificación");
        jMGestionDeSiniestros.add(jMIModificacionSiniestro);

        jMICierreSiniestro.setText("Cierre");
        jMICierreSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICierreSiniestroActionPerformed(evt);
            }
        });
        jMGestionDeSiniestros.add(jMICierreSiniestro);

        jMenuBar1.add(jMGestionDeSiniestros);

        jMEstadisticas.setText("Estadísticas");

        jMIInformacionBrigadas.setText("Información de Brigadas");
        jMEstadisticas.add(jMIInformacionBrigadas);

        jMIBomberosPorBrigadas.setText("Bomberos por Brigadas");
        jMEstadisticas.add(jMIBomberosPorBrigadas);

        jMIBrigadasPorCuartel.setText("Brigadas por Cuartel");
        jMEstadisticas.add(jMIBrigadasPorCuartel);

        jMIInformacionDeSiniestros.setText("Información de Siniestros");
        jMEstadisticas.add(jMIInformacionDeSiniestros);

        jMenuBar1.add(jMEstadisticas);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBomberosActionPerformed
        // TODO add your handling code here:
        ListaDeBomberos ventana = new ListaDeBomberos();
        escritorio.add(ventana);
        ventana.setVisible(true);

        int x = (escritorio.getWidth() - ventana.getWidth()) / 2;
        int y = (escritorio.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jMIBomberosActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMSalirMouseClicked

    private void jMICierreSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICierreSiniestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMICierreSiniestroActionPerformed

    private void jbCerrarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSiniestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCerrarSiniestroActionPerformed

    private void jbAltaSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaSiniestroActionPerformed
        AltaSiniestro ventana = new AltaSiniestro();
        escritorio.add(ventana);
        ventana.setVisible(true);

        int x = (escritorio.getWidth() - ventana.getWidth()) / 2;
        int y = (escritorio.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jbAltaSiniestroActionPerformed

    //CARGO ABM DE CUARTEL
    private void jMICuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICuartelActionPerformed

        CuartelUI ventana = new CuartelUI();
        escritorio.add(ventana);
        ventana.setVisible(true);

        int x = (escritorio.getWidth() - ventana.getWidth()) / 2;
        int y = (escritorio.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jMICuartelActionPerformed

    private void jbModificarSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarSiniestroActionPerformed
        ModifSiniestro ventana = new ModifSiniestro();
        escritorio.add(ventana);
        ventana.setVisible(true);

        int x = (escritorio.getWidth() - ventana.getWidth()) / 2;
        int y = (escritorio.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jbModificarSiniestroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(alto, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMEstadisticas;
    private javax.swing.JMenu jMGestionDeRecursos;
    private javax.swing.JMenu jMGestionDeSiniestros;
    private javax.swing.JMenuItem jMIAltaSiniestro;
    private javax.swing.JMenuItem jMIBomberos;
    private javax.swing.JMenuItem jMIBomberosPorBrigadas;
    private javax.swing.JMenuItem jMIBrigada;
    private javax.swing.JMenuItem jMIBrigadasPorCuartel;
    private javax.swing.JMenuItem jMICierreSiniestro;
    private javax.swing.JMenuItem jMICuartel;
    private javax.swing.JMenuItem jMIInformacionBrigadas;
    private javax.swing.JMenuItem jMIInformacionDeSiniestros;
    private javax.swing.JMenuItem jMIModificacionSiniestro;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbAltaSiniestro;
    private javax.swing.JButton jbCerrarSiniestro;
    private javax.swing.JButton jbModificarSiniestro;
    // End of variables declaration//GEN-END:variables
}
