/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Instrucciones.java
 *
 * Created on 21-may-2010, 22:46:55
 */

package juegopantalla;

/**
 *
 * @author Nelly
 */
public class Instrucciones extends javax.swing.JFrame {

    /** Creates new form Instrucciones */
    public Instrucciones() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTinstrucciones = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(juegopantalla.JuegoPantallaApp.class).getContext().getResourceMap(Instrucciones.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(resourceMap.getColor("jScrollPane1.background")); // NOI18N
        jScrollPane1.setForeground(resourceMap.getColor("jScrollPane1.foreground")); // NOI18N
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTinstrucciones.setBackground(resourceMap.getColor("jTinstrucciones.background")); // NOI18N
        jTinstrucciones.setColumns(20);
        jTinstrucciones.setEditable(false);
        jTinstrucciones.setFont(resourceMap.getFont("jTinstrucciones.font")); // NOI18N
        jTinstrucciones.setForeground(resourceMap.getColor("jTinstrucciones.foreground")); // NOI18N
        jTinstrucciones.setLineWrap(true);
        jTinstrucciones.setRows(5);
        jTinstrucciones.setText(resourceMap.getString("jTinstrucciones.text")); // NOI18N
        jTinstrucciones.setName("jTinstrucciones"); // NOI18N
        jTinstrucciones.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTinstrucciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 650, 250));

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 230, -1));

        jButton10.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton10.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setName("jButton10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 90, 40));

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setActionCommand(resourceMap.getString("jButton1.actionCommand")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 100, 40));

        fondo.setIcon(resourceMap.getIcon("fondo.icon")); // NOI18N
        fondo.setText(resourceMap.getString("fondo.text")); // NOI18N
        fondo.setName("fondo"); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 830, 580));
        fondo.getAccessibleContext().setAccessibleName(resourceMap.getString("jLabel1.AccessibleContext.accessibleName")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        pantallaDecision pantalla = new pantallaDecision();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTinstrucciones;
    // End of variables declaration//GEN-END:variables

}