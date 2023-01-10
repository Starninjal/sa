package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrincipalLogin extends JFrame {

	private JPanel contentPane;
	private JTextField edtLogin;
	private JTextField edtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrincipalLogin frame = new ViewPrincipalLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewPrincipalLogin() {
		setTitle("Login - SA System 1.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		edtLogin = new JTextField();
		edtLogin.setBounds(10, 60, 414, 41);
		contentPane.add(edtLogin);
		edtLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(10, 35, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 131, 46, 14);
		contentPane.add(lblSenha);
		
		edtSenha = new JTextField();
		edtSenha.setColumns(10);
		edtSenha.setBounds(10, 168, 414, 41);
		contentPane.add(edtSenha);
		
		JButton lblLogar = new JButton("Logar");
		lblLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edtLogin.setText(getName());
			}
		});
		lblLogar.setBounds(178, 227, 89, 23);
		contentPane.add(lblLogar);
	}
}
