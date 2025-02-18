/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hannah.recipe;
import javax.swing.*;

/**
 *
 * @author sarak
 */
public class GUI extends javax.swing.JFrame {
    
    private DefaultListModel recipeModel;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        this.recipeModel = new DefaultListModel();
        initComponents();
        
        recipeModel = (DefaultListModel)recipeList.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recipescrollPane = new javax.swing.JScrollPane();
        recipeList = new javax.swing.JList<>();
        rPanel = new hannah.recipe.recipePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("recipeBook");
        setPreferredSize(new java.awt.Dimension(Const.WIDTH, Const.HEIGHT));
        setResizable(false);
        setSize(new java.awt.Dimension(Const.WIDTH, Const.HEIGHT));

        recipeList.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        recipeList.setModel(new DefaultListModel());
        recipeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        recipeList.setToolTipText("");
        recipeList.setAutoscrolls(false);
        recipeList.setPreferredSize(new java.awt.Dimension(Const.listWIDTH, Const.panelHEIGHT));
        recipeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                recipeListValueChanged(evt);
            }
        });
        recipescrollPane.setViewportView(recipeList);

        rPanel.setBackground(new java.awt.Color(204, 255, 204));
        rPanel.setPreferredSize(new java.awt.Dimension(Const.panelWIDTH, Const.panelHEIGHT));

        javax.swing.GroupLayout rPanelLayout = new javax.swing.GroupLayout(rPanel);
        rPanel.setLayout(rPanelLayout);
        rPanelLayout.setHorizontalGroup(
            rPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        rPanelLayout.setVerticalGroup(
            rPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(recipescrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(rPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recipescrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(rPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recipeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_recipeListValueChanged
        // something in list changed, sets selected to index of selection 
        if (recipeList.hasFocus() && ! evt.getValueIsAdjusting()) {
            int selected = recipeList.getSelectedIndex();
        }
    }//GEN-LAST:event_recipeListValueChanged

    private void updateRecipes() {
        recipeModel.clear();
        
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hannah.recipe.recipePanel rPanel;
    private javax.swing.JList<String> recipeList;
    private javax.swing.JScrollPane recipescrollPane;
    // End of variables declaration//GEN-END:variables
}
