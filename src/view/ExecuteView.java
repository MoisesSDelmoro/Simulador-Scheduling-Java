package view;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import scheduling.FCFS;
import scheduling.Jobs;
import scheduling.SJF;

public class ExecuteView extends javax.swing.JFrame {
    private SchedulingView scheduling;
    private JPanel resultPane = new JPanel();
    JScrollPane scrollPane = new JScrollPane(resultPane);
    AdjustmentListener listener;

    public ExecuteView(SchedulingView scheduling) {
        initComponents();
        
        this.scheduling = scheduling;

        resultPane.setBackground(new Color(255, 255, 255));
        resultPane.setLayout(new BoxLayout(resultPane, BoxLayout.Y_AXIS));

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        listener = new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                e.getAdjustable().setValue(e.getAdjustable().getMaximum());
            }
        };

        scrollPane.getVerticalScrollBar().addAdjustmentListener(listener);

        jobsExecutingPanel.add(scrollPane);
        jobsExecutingPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        this.execute();
    }

    private void execute() {
        List<Jobs> jobsReady = new ArrayList<Jobs>();

        for (JobsView job : scheduling.getJobs()) {
            int id = Integer.parseInt(job.getId().getText());
            int arrivalTime = 0;
            int burstTime = 0;
            if (job.getArrivalTime().getText().length() > 0) {
                arrivalTime = Integer.parseInt(job.getArrivalTime().getText());
            }
            if (job.getBurstTime().getText().length() > 0) {
                burstTime = Integer.parseInt(job.getBurstTime().getText());
            }

            jobsReady.add(new Jobs(id, arrivalTime, burstTime));
        }

        if (scheduling.getjComboBox1().getSelectedIndex() == 0) {
            FCFS fcfs = new FCFS(jobsReady, this);
            fcfs.start();
        } else {
            SJF sjf = new SJF(jobsReady, this);
            sjf.start();
        }
    }

    public JPanel getResultPane() {
        return resultPane;
    }

    public void setResultPane(JPanel resultPane) {
        this.resultPane = resultPane;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public AdjustmentListener getListener() {
        return listener;
    }

    public void setListener(AdjustmentListener listener) {
        this.listener = listener;
    }

        public JLabel getAvgResult() {
        return avgResult;
    }

    public void setAvgResult(JLabel jLabel4) {
        this.avgResult = jLabel4;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonClose = new javax.swing.JButton();
        avgResult = new javax.swing.JLabel();
        jobsExecutingPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        buttonClose.setBackground(new java.awt.Color(56, 174, 255));
        buttonClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonClose.setForeground(new java.awt.Color(255, 255, 255));
        buttonClose.setText("Voltar");
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCloseMouseClicked(evt);
            }
        });
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        avgResult.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        avgResult.setForeground(new java.awt.Color(56, 174, 255));
        avgResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avgResult.setText("Executing...");

        jobsExecutingPanel.setBackground(new java.awt.Color(255, 255, 255));
        jobsExecutingPanel.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(56, 174, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Executando a simulação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avgResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jobsExecutingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jobsExecutingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(avgResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buttonClose)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseClicked
        dispose();
    }//GEN-LAST:event_buttonCloseMouseClicked

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCloseActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgResult;
    private javax.swing.JButton buttonClose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jobsExecutingPanel;
    // End of variables declaration//GEN-END:variables
}
