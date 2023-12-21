package unidad2.ejemplos.hilos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bolas extends JFrame {
    private JPanel panel;
    private int[] bolas;
    private int[] posiciones;
    private Random random;

    public Bolas() {
        super("Bolas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < bolas.length; i++) {
                    g.setColor(Color.RED);
                    g.fillOval(posiciones[i], bolas[i], 20, 20);
                }
            }
        };
        add(panel);

        bolas = new int[10];
        posiciones = new int[10];
        random = new Random();

        setVisible(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < bolas.length; i++) {
                        if (bolas[i] >= getHeight()) {
                            bolas[i] = 0;
                            posiciones[i] = random.nextInt(getWidth() - 20);
                        } else {
                            bolas[i] += 5;
                        }
                    }
                    panel.repaint();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new Bolas();
    }
}