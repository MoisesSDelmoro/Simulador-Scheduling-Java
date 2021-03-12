/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTextField;
import scheduling.Jobs;

public class JobsView extends javax.swing.JPanel {
    public Jobs job = new Jobs();
    private SchedulingView scheduling;
    
    /**
     * Creates new form AddJobs
     */
    public JobsView(int id, SchedulingView scheduling) {
        initComponents();
 
        this.job.setId(id);
        this.scheduling = scheduling;

        idInput.setText(id + "");  
    }

    public JTextField getId() {
        return idInput;
    }

    public void setId(JTextField jTextField1) {
        this.idInput = jTextField1;
    }

    public JTextField getArrivalTime() {
        return arriavalTimeInput;
    }

    public void setArrivalTime(JTextField jTextField2) {
        this.arriavalTimeInput = jTextField2;
    }

    public JTextField getBurstTime() {
        return burstTimeInput;
    }

    public void setBurstTime(JTextField jTextField3) {
        this.burstTimeInput = jTextField3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        arrivalTimeLabel = new javax.swing.JLabel();
        arriavalTimeInput = new javax.swing.JTextField();
        burstTimeLabel = new javax.swing.JLabel();
        burstTimeInput = new javax.swing.JTextField();
        removeButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        idLabel.setText("ID");
        idLabel.setToolTipText("");

        idInput.setEditable(false);
        idInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        idInput.setMargin(new java.awt.Insets(2, 12, 2, 2));

        arrivalTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        arrivalTimeLabel.setText("Arrival Time");
        arrivalTimeLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        arriavalTimeInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        arriavalTimeInput.setMargin(new java.awt.Insets(2, 12, 2, 2));

        burstTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        burstTimeLabel.setText("Burst Time");

        burstTimeInput.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        burstTimeInput.setMargin(new java.awt.Insets(2, 12, 2, 2));

        removeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 51, 51));
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Remove.png"))); // NOI18N
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arriavalTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(burstTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton))
                    .addComponent(burstTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arrivalTimeLabel)
                            .addComponent(burstTimeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arriavalTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(burstTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        scheduling.removeJob(this.job.getId());
    }//GEN-LAST:event_removeButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arriavalTimeInput;
    private javax.swing.JLabel arrivalTimeLabel;
    private javax.swing.JTextField burstTimeInput;
    private javax.swing.JLabel burstTimeLabel;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel removeButton;
    // End of variables declaration//GEN-END:variables
}
