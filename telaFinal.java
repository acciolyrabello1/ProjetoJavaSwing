import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class telaFinal {
    public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de Login");
    String login = JOptionPane.showInputDialog("Informe seu login");
    String senha = JOptionPane.showInputDialog("Informe sua senha");
    JOptionPane.showMessageDialog(null, login + " Logado com sucesso");
    
}
}