import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class Janela {
	
	public Janela() {
	JFrame frame = new JFrame();
	JLabel lblLogin = new JLabel("Login: ");
    JLabel lblSenha = new JLabel("Senha: ");
    JTextField tfLogin = new JTextField();
    JTextField tfSenha = new JTextField();
    JButton btnLogar = new JButton("Logar");
    JButton btnCalcelar = new JButton("Cancelar");
    JPanel painel = new JPanel(); 
    painel.setBackground(Color.GREEN);  
    painel.setLayout(new GridLayout(3, 3));
    painel.add(lblLogin);
    painel.add(tfLogin);
    painel.add(lblSenha);
    painel.add(tfSenha);
    painel.add(btnLogar);
    painel.add(btnCalcelar);
	frame.setTitle("Sistema de Login");
	frame.setSize(300,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);	
    frame.setLayout(new FlowLayout());
    frame.add(painel);
    
	}
	
	public static void main(String[] args) {
		new Janela();

       
        
        
        
	}
	
}
