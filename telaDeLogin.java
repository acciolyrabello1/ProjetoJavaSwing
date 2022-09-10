import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class telaDeLogin {
    public static void main(String[] args) throws Exception {
        
        JFrame janela = new JFrame("Tela de Login");
        JPanel painel = new JPanel(); 
        JLabel lblLogin = new JLabel("Login: ");
        JLabel lblSenha = new JLabel("Senha: ");
        JTextField tfLogin = new JTextField();
        JTextField tfSenha = new JTextField();
        JButton btnLogar = new JButton("Logar");
        JButton btnCalcelar = new JButton("Cancelar");
        janela.setLayout(new FlowLayout());
        painel.setBackground(Color.GREEN);   

        tfLogin.setBounds(100, 100, 100, 100);

        painel.setLayout(new GridLayout(3, 3));
        painel.add(lblLogin);
        painel.add(tfLogin);
        painel.add(lblSenha);
        painel.add(tfSenha);
        painel.add(btnLogar);
        painel.add(btnCalcelar);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(400, 200);
        janela.setVisible(true);

    }
}