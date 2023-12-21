package unidad2.ejemplos.hilos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BolasEnCajas extends JFrame {
    private JPanel panel;
    private int[] bolas;
    private int[] posiciones;
    private int[] cajas;
    private Random random;

    public BolasEnCajas() {
        super("Bolas en cajas");
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
                for (int i = 0; i < cajas.length; i++) {
                    g.setColor(Color.BLUE);
                    g.fillRect(i * 40, getHeight() - cajas[i], 40, cajas[i]);
                }
            }
        };
        add(panel);

        bolas = new int[10];
        posiciones = new int[10];
        cajas = new int[10];
        random = new Random();

        for (int i = 0; i < cajas.length; i++) {
            cajas[i] = random.nextInt(getHeight() - 100) + 50;
        }

        setVisible(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < bolas.length; i++) {
                        if (bolas[i] >= getHeight() - cajas[posiciones[i]] - 20) {
                            bolas[i] = 0;
                            posiciones[i] = random.nextInt(cajas.length);
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
        new BolasEnCajas();
    }
}
