import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class unsuc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					unsuc frame = new unsuc();
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
	public unsuc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 280);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unsuccessful");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel.setForeground(new Color(176, 224, 230));
		lblNewLabel.setBounds(120, 45, 400, 102);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("Please Enter valid details");
		lblNewLabel2.setBackground(new Color(0, 0, 0));
		lblNewLabel2.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel2.setForeground(new Color(176, 224, 230));
		lblNewLabel2.setBounds(65, 80, 400, 102);
		contentPane.add(lblNewLabel2);
	}

}
