package conversormonedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {
    public static void main(String[] args) {
        String clave = JOptionPane.showInputDialog(null,
                "Ingrese la contrasena:",
                "Inicio de Sesion",
                JOptionPane.QUESTION_MESSAGE);
        if (clave != null && clave.equals("1234")) {
            JOptionPane.showMessageDialog(null,
                    "Bienvenido Sergio!",
                    "Acceso Correcto",
                    JOptionPane.INFORMATION_MESSAGE);
            ConversorForm formulario = new ConversorForm();
            formulario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Contrasena incorrecta. El programa se cerrara.",
                    "Acceso Denegado",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
 