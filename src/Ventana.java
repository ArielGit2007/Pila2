import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Ventana;
    private JSpinner spinNumero;
    private JButton btnCalcular;
    private JLabel lbl;
    private JLabel lblResultado;
    private Pila pila = new Pila();


    public Ventana() {
        SpinnerNumberModel smn = new SpinnerNumberModel(21,1,1000,1);
        spinNumero.setModel(smn);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer numero= Integer.parseInt(spinNumero.getValue().toString());S
                while (numero!=0){
                    Integer residuo = numero%2;
                    pila.push(residuo);
                    numero=numero/2;
                }
                lblResultado.setText(pila.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
