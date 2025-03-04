package frontend;

import backend.Mitglied;
import backend.Mitgliederverwaltung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author reineckeKarin
 */
public class MitgliederverwaltungView extends javax.swing.JFrame {
    List<Mitglied> mitglieder = Mitgliederverwaltung.ladeMitglieder();
    Mitgliederverwaltung verwaltung;

    public MitgliederverwaltungView() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        verwaltung = new Mitgliederverwaltung();

        Object[][] data = new Object[mitglieder.size()][2];
        String[] columns = new String[]{
                "Mitglied", "Mitglied seit"
        };

        for (int i = 0; i < mitglieder.size(); i++) {
            data[i][0] = mitglieder.get(i).getName();
            var antrag = mitglieder.get(i).getMitgliederantrag().getDatum();
            data[i][1] = antrag;
        }

        DefaultTableModel model = new DefaultTableModel(data, columns);
        mitgliederTable.setModel(model);

        // Erzeuge das Rechtsklick-Menü
        JPopupMenu contextMenu = new JPopupMenu();

        JMenuItem removeItem = new JMenuItem("Entfernen");
        removeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = mitgliederTable.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Bitte wählen Sie eine Zeile zum Entfernen aus.");
                }
            }
        });
        contextMenu.add(removeItem);

        JMenuItem editItem = new JMenuItem("Properties");
        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = mitgliederTable.getSelectedRow();
                if (selectedRow != -1) {
                    // TODO open prop window
                } else {
                    JOptionPane.showMessageDialog(null, "Bitte wählen Sie eine Zeile zum Bearbeiten aus.");
                }
            }
        });
        contextMenu.add(editItem);

        // MouseListener hinzufügen, um das Rechtsklick-Menü zu zeigen
        mitgliederTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    int row = mitgliederTable.rowAtPoint(e.getPoint());
                    mitgliederTable.setRowSelectionInterval(row, row);
                    contextMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    public void addMitglied(Mitglied mitglied) {
        mitglieder.add(mitglied);
        // TODO hier noch speichern!!!!!
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        fitnessclubLabel = new javax.swing.JLabel();
        mitgliederScrollPane = new javax.swing.JScrollPane();
        mitgliederTable = new javax.swing.JTable();
        mitgliederverwaltungLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fitnessclubLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        fitnessclubLabel.setText("Delta Fitnessclub e.V.");
        fitnessclubLabel.setToolTipText("");
        fitnessclubLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mitgliederTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, ""},
                        {null, null, ""},
                        {null, null, ""},
                        {null, null, ""},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Mitglied", "Mitglied seit", ""
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                    true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mitgliederScrollPane.setViewportView(mitgliederTable);

        mitgliederverwaltungLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mitgliederverwaltungLabel.setText("Mitgliederverwaltung");

        closeButton.setText("Beenden");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        addButton.setText("Mitglied Hinzufügen");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mitgliederScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(closeButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addButton)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(85, 85, 85))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(fitnessclubLabel)
                                                .addGap(28, 28, 28))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(mitgliederverwaltungLabel)
                                                .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fitnessclubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mitgliederverwaltungLabel)
                                .addGap(1, 1, 1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mitgliederScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(closeButton)
                                        .addComponent(addButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {

        MitgliedHinzufuegenView mitgliedFenster = new MitgliedHinzufuegenView();
        mitgliedFenster.setVisible(true);
        this.setVisible(false);
    }


    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Mitgliederverwaltung.speichereDaten();
        dispose();
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
            java.util.logging.Logger.getLogger(MitgliederverwaltungView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MitgliederverwaltungView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MitgliederverwaltungView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MitgliederverwaltungView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MitgliederverwaltungView().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify
    private javax.swing.JButton addButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel fitnessclubLabel;
    private javax.swing.JScrollPane mitgliederScrollPane;
    private javax.swing.JTable mitgliederTable;
    private javax.swing.JLabel mitgliederverwaltungLabel;
    // End of variables declaration
}
