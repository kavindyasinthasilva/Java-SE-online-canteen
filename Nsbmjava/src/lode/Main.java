/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package lode;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//from   w ww . j  a  v a 2  s . co  m
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Kavindu Yasintha
 */
public class Main  {
  
    
   public static void main(String[] args) {
        new Main();
    }

    public Main() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
            setLayout(new GridBagLayout());
            JProgressBar pb = new JProgressBar();
            add(pb);

            new ProgressWorker(pb, 40).execute();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

    }

    public class ProgressWorker extends SwingWorker<Void, Integer> {

        private int delay;
        private JProgressBar pb;

        public ProgressWorker(JProgressBar progressBar, int delay) {
            this.pb = progressBar;
            this.delay = delay;
        }

       /**
        *
        * @param chunks
        */
     

        @Override
        protected Void doInBackground() throws Exception {
            for (int index = 0; index < 100; index++) {
                publish(index);
                Thread.sleep(delay);
            }
            return null;
        }

        @Override
        protected void done() {
            // Back in the EDT...
            //pii.dispose();
            //o.Eros();
        }

    }

} 