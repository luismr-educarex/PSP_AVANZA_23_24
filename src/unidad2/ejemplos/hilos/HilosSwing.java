package unidad2.ejemplos.hilos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HilosSwing extends JFrame {
    private JLabel label;
    private JButton button;
    private int count;

    public HilosSwing() {
        super("Ejemplo de hilos en Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new JLabel("0");
        add(label);

        button = new JButton("Iniciar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 1; i <= 10; i++) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            count++;
                            label.setText(Integer.toString(count));
                        }
                    }
                }).start();
            }
        });
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new HilosSwing();
    }
}
