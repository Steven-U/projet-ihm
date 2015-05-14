/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;


/**
 *
 * @author u21416039
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        planning = new javax.swing.JTable();
        panelGestion = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jourNonOuvree = new javax.swing.JTextField();
        samedi = new javax.swing.JCheckBox();
        dimanche = new javax.swing.JCheckBox();
        valider = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nouveau = new javax.swing.JMenuItem();
        ouvrir = new javax.swing.JMenuItem();
        sauve = new javax.swing.JMenuItem();
        quitter = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        modifier = new javax.swing.JMenuItem();
        copier = new javax.swing.JMenuItem();
        coller = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emploi du temps");
        setBounds(new java.awt.Rectangle(1000, 1000, 1000, 1000));

        planning.setAutoCreateRowSorter(true);
        planning.setBorder(new javax.swing.border.MatteBorder(null));
        planning.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"
            }
        ));
        planning.setColumnSelectionAllowed(true);
        planning.setRowHeight(160);
        planning.getTableHeader().setReorderingAllowed(false);
        planning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planningMouseClicked(evt);
            }
        });
        planning.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                planningAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(planning);
        if (planning.getColumnModel().getColumnCount() > 0) {
            planning.getColumnModel().getColumn(0).setResizable(false);
            planning.getColumnModel().getColumn(1).setResizable(false);
            planning.getColumnModel().getColumn(2).setResizable(false);
            planning.getColumnModel().getColumn(3).setResizable(false);
            planning.getColumnModel().getColumn(4).setResizable(false);
            planning.getColumnModel().getColumn(5).setResizable(false);
            planning.getColumnModel().getColumn(6).setResizable(false);
        }

        panelGestion.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jourNonOuvree.setEditable(false);
        jourNonOuvree.setText("Jours non ouvrés");

        samedi.setText("Samedi");

        dimanche.setText("Dimanche");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jourNonOuvree, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(samedi)
                    .addComponent(dimanche))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jourNonOuvree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(samedi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dimanche)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        valider.setText("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGestionLayout = new javax.swing.GroupLayout(panelGestion);
        panelGestion.setLayout(panelGestionLayout);
        panelGestionLayout.setHorizontalGroup(
            panelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGestionLayout.createSequentialGroup()
                .addGroup(panelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGestionLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(valider))
                    .addGroup(panelGestionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGestionLayout.setVerticalGroup(
            panelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(valider)
                .addContainerGap())
        );

        jMenu1.setText("Fichier");

        nouveau.setText("Nouveau");
        nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauActionPerformed(evt);
            }
        });
        jMenu1.add(nouveau);

        ouvrir.setText("Ouvrir");
        jMenu1.add(ouvrir);

        sauve.setText("Sauvegarder");
        jMenu1.add(sauve);

        quitter.setText("Quitter");
        quitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitterMouseClicked(evt);
            }
        });
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        jMenu1.add(quitter);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edition");

        modifier.setText("Modifier");
        jMenu2.add(modifier);

        copier.setText("Copier");
        jMenu2.add(copier);

        coller.setText("Coller");
        jMenu2.add(coller);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nouveauActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitterActionPerformed

    private void quitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quitterMouseClicked

    private void planningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planningMouseClicked
        InterSeance inter = new InterSeance();
    }//GEN-LAST:event_planningMouseClicked

    private void planningAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_planningAncestorAdded
        
    }//GEN-LAST:event_planningAncestorAdded

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        
    }//GEN-LAST:event_validerActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem coller;
    private javax.swing.JMenuItem copier;
    private javax.swing.JCheckBox dimanche;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jourNonOuvree;
    private javax.swing.JMenuItem modifier;
    private javax.swing.JMenuItem nouveau;
    private javax.swing.JMenuItem ouvrir;
    private javax.swing.JPanel panelGestion;
    private javax.swing.JTable planning;
    private javax.swing.JMenuItem quitter;
    private javax.swing.JCheckBox samedi;
    private javax.swing.JMenuItem sauve;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
