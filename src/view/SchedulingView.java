package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


public class SchedulingView extends javax.swing.JFrame {
    private List<JobsView> jobs = new ArrayList<JobsView>();
    private JPanel jobsPane = new JPanel();

    public SchedulingView() {
        initComponents();

        jobsPane.setBackground(new Color(255, 255, 255));
        jobsPane.setLayout(new BoxLayout(jobsPane, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(jobsPane);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        jobsList.add(scrollPane);
        jobsList.setBorder(new EmptyBorder(10, 10, 10, 10));

        this.addJob();
    }

    private void addJob() {
        JobsView addJob = new JobsView(jobs.size() + 1, this);
        jobs.add(addJob);
        jobsPane.add(addJob);
        revalidate();
        repaint();
    }

    public void removeJob(int id) {
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).job.getId() == id) {
                this.jobs.remove(i);
                this.jobsPane.remove(i);
                revalidate();
                repaint();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jobsList = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        executeButton = new javax.swing.JButton();
        algorithmBox = new javax.swing.JComboBox<>();
        bt_FCFS = new javax.swing.JRadioButton();
        bt_SJF = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 626));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(56, 174, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jobsList.setBackground(new java.awt.Color(255, 255, 255));
        jobsList.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(888, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        executeButton.setBackground(new java.awt.Color(56, 174, 255));
        executeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        executeButton.setForeground(new java.awt.Color(255, 255, 255));
        executeButton.setText("EXECUTAR");
        executeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        executeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                executeButtonMouseClicked(evt);
            }
        });

        algorithmBox.setBackground(new java.awt.Color(56, 174, 255));
        algorithmBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        algorithmBox.setForeground(new java.awt.Color(255, 255, 255));
        algorithmBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    FCFS - Not Preemptive", "    SJF - Preemptive" }));
        algorithmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algorithmBoxActionPerformed(evt);
            }
        });

        bt_FCFS.setBackground(new java.awt.Color(56, 174, 255));
        buttonGroup1.add(bt_FCFS);
        bt_FCFS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_FCFS.setForeground(new java.awt.Color(255, 255, 255));
        bt_FCFS.setText("FCFS - NÃO PREEMPTIVO");
        bt_FCFS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_FCFSMouseClicked(evt);
            }
        });
        bt_FCFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FCFSActionPerformed(evt);
            }
        });

        bt_SJF.setBackground(new java.awt.Color(56, 174, 255));
        buttonGroup1.add(bt_SJF);
        bt_SJF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_SJF.setForeground(new java.awt.Color(255, 255, 255));
        bt_SJF.setText("SJF - PREEMPTIVO");
        bt_SJF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SJFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bt_FCFS, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_SJF, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(executeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Add)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(algorithmBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jobsList, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Add)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_FCFS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_SJF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(algorithmBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, -1, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void executeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_executeButtonMouseClicked
        new ExecuteView(this).setVisible(true);
    }//GEN-LAST:event_executeButtonMouseClicked

    private void algorithmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algorithmBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_algorithmBoxActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        this.addJob();
    }//GEN-LAST:event_AddMouseClicked

    private void bt_FCFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FCFSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_FCFSActionPerformed

    private void bt_FCFSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_FCFSMouseClicked
        // TODO add your handling code here:
        
        /*if(bt_FCFS.isSelected()){
            this.algorithmBox = bt_FCFS.toString();
            return;a*/
        
    }//GEN-LAST:event_bt_FCFSMouseClicked

    private void bt_SJFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SJFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SJFMouseClicked

    public List<JobsView> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobsView> jobs) {
        this.jobs = jobs;
    }
    
   
    public JComboBox<String> getjComboBox1() {
        return algorithmBox;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.algorithmBox = jComboBox1;
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new SchedulingView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JComboBox<String> algorithmBox;
    private javax.swing.JRadioButton bt_FCFS;
    private javax.swing.JRadioButton bt_SJF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton executeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jobsList;
    // End of variables declaration//GEN-END:variables
}
