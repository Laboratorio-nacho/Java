import javax.swing.JOptionPane;

public class JoptionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        

        cadena = JOptionPane.showInputDialog("digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero"));
        letra = JOptionPane.showInputDialog("digite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));


        JOptionPane.showMessageDialog(null, "la cadena es "+ cadena);
        JOptionPane.showMessageDialog(null, "el entero es " + entero);
        JOptionPane.showMessageDialog(null, "el caracter es "+ letra);
        JOptionPane.showMessageDialog(null, "el decimal es "+ decimal );

    }

    public static String showInputDialog(String string) {
        return null;
    }
}