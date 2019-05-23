
package leagueadmin;
import SQL.conection;
import Accessories.*;
import objects.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PrincipalWin extends javax.swing.JFrame implements Runnable {
    conection c = new conection();
    Thread hilo;
    boolean hil=true;
    public PrincipalWin() {
        initComponents();
        hilo = new Thread(this);
        hilo.start();
    }
    @Override
    public void run (){
        while(hil==true){
            try{
                Thread.sleep(0);
            }catch (InterruptedException e){
                System.out.println("ERROR");
            }
            Login n = new Login ();
            n.setVisible(true);
            n.setLocationRelativeTo(null);
            hil=false;
        }        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrincipalPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PrincipalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 370));

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconfinder_floppy_285657.png"))); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconfinder_BT_database_export_905551.png"))); // NOI18N
        jMenuItem2.setText("Exportar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconfinder_BT_database_import_905550.png"))); // NOI18N
        jMenuItem3.setText("Importar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Liga");

        jMenuItem4.setText("Tabla de posiciones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Tabla de goleo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Sanciones");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenu2.setText("Partidos");

        jMenuItem8.setText("Jugados");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Por jugar");
        jMenu2.add(jMenuItem9);

        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Administrar");

        jMenuItem10.setText("Registrar partido");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem7.setText("Editar tabla de posiciones");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem12.setText("Cambiar partidos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Acerca de");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 799, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        positions_table l = new positions_table();
        l.setSize(600,400);
        l.setLocation(5, 5);
        //BORRANDO CONTENIDO DEL PANEL
        PrincipalPanel.removeAll();
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();
        ///AGREGANDO NUEVO PANEL
        PrincipalPanel.add(l);
        l.setVisible(true);
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();  
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        games_played m = new games_played();
        m.setSize(600,400);
        m.setLocation(5, 5);
        //BORRANDO CONTENIDO DEL PANEL
        PrincipalPanel.removeAll();
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();
        ///AGREGANDO NUEVO PANEL
        PrincipalPanel.add(m);
        m.setVisible(true);
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        goal_table k = new goal_table();
        k.setSize(600,400);
        k.setLocation(5, 5);
        //BORRANDO CONTENIDO DEL PANEL
        PrincipalPanel.removeAll();
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();
        ///AGREGANDO NUEVO PANEL
        PrincipalPanel.add(k);
        k.setVisible(true);
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();  
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        penalties b = new penalties();
        b.setSize(600,400);
        b.setLocation(5, 5);
        //BORRANDO CONTENIDO DEL PANEL
        PrincipalPanel.removeAll();
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();
        ///AGREGANDO NUEVO PANEL
        PrincipalPanel.add(b);
        b.setVisible(true);
        PrincipalPanel.repaint();
        PrincipalPanel.revalidate();  
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Login n = new Login();
        if(!n.administrador){
            JOptionPane.showMessageDialog(null,"YOU DON'T HAVE AUTHORIZATION TO SEE THIS SECTION    ");
        }else{
            register_matches v = new register_matches();
            v.setSize(600,400);
            v.setLocation(5, 5);
            //BORRANDO CONTENIDO DEL PANEL
            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.revalidate();
            ///AGREGANDO NUEVO PANEL
            PrincipalPanel.add(v);
            v.setVisible(true);
            PrincipalPanel.repaint();
            PrincipalPanel.revalidate(); 
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
            positions_table s = new positions_table();
            s.setSize(600,400);
            s.setLocation(5, 5);
            //BORRANDO CONTENIDO DEL PANEL
            PrincipalPanel.removeAll();
            PrincipalPanel.repaint();
            PrincipalPanel.revalidate();
            ///AGREGANDO NUEVO PANEL
            PrincipalPanel.add(s);
            s.setVisible(true);
            PrincipalPanel.repaint();
            PrincipalPanel.revalidate(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
