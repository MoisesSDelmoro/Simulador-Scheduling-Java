package scheduling;

import java.awt.Color;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import view.ExecuteView;

public class FCFS extends Thread {
    private List<Jobs> readyQueue = new ArrayList<Jobs>();
    private ExecuteView executeView;
    
    public FCFS(List<Jobs> readyQueue, ExecuteView executeView) {
        this.readyQueue = readyQueue;
        this.executeView = executeView;
        
        Collections.sort(this.readyQueue, firstArrived);
    }
    
    public static Comparator<Jobs> firstArrived = new Comparator<Jobs>() {
        @Override
        public int compare(Jobs job1, Jobs job2) {
            if (job1.getArrivalTime() > job2.getArrivalTime()) {
                return 1;
            } else if (job1.getArrivalTime() < job2.getArrivalTime()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    @Override
    public void run() {
        double totalTime = 0;
        double avgTime = 0;
        double totalJobs = readyQueue.size();
        double lastTime = this.readyQueue.get(0).getArrivalTime();
        
        for (Jobs jobs : readyQueue) {
            for (int i = jobs.getBurstTime(); i > 0; i--) {
                this.print(Color.black, "P" + jobs.getId() + " está executando (Burst Time = " + i + ")");
            }

            this.print(Color.red, "P" + jobs.getId() + " executado (Burst Time = 0s)");
            
            totalTime = totalTime + lastTime;
            lastTime = lastTime + jobs.getBurstTime();
        }

        avgTime = totalTime / totalJobs;
        
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.DOWN);
        this.executeView.getAvgResult().setText("TM = " + df2.format(avgTime) + " segundos");
        this.executeView.getScrollPane().getVerticalScrollBar().removeAdjustmentListener(this.executeView.getListener());
    }

    private void print(Color color, String message) {
        JLabel label = new JLabel();
        label.setText(message);
        label.setForeground(color);
        this.executeView.getResultPane().add(label);
        this.executeView.getResultPane().revalidate();
        this.executeView.getResultPane().repaint();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FCFS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
