import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame
{

	private JPanel Panel;
	private JTextField textField;
	private JPasswordField passwordField;
	public static void main(String[] args) 
	{			
				try 
				{
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}			
			}
	/**
	 * Create the frame.
	 */
	public LoginPage() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 321);
		Panel = new JPanel();
		Panel.setBackground(new Color(230, 230, 250));
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		Panel.setLayout(null);
		
		JLabel nameLabel = new JLabel("Login Page");
		nameLabel.setForeground(new Color(0, 0, 0));
		nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		nameLabel.setBounds(168, 38, 95, 28);
		Panel.add(nameLabel);
		
		JLabel newLabel1 = new JLabel("Username");
		newLabel1.setForeground(new Color(0, 0, 0));
		newLabel1.setBackground(new Color(240, 255, 240));
		newLabel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		newLabel1.setBounds(99, 95, 69, 20);
		Panel.add(newLabel1);
		
		textField = new JTextField();
		textField.setBounds(191, 95, 185, 20);
		Panel.add(textField);
		textField.setColumns(10);
		
		JLabel newLabel2 = new JLabel("Password");
		newLabel2.setForeground(new Color(0, 0, 0));
		newLabel2.setFont(new Font("Tahoma", Font.BOLD, 11));
		newLabel2.setBounds(99, 145, 69, 20);
		Panel.add(newLabel2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(191, 145, 185, 20);
		Panel.add(passwordField);
		
		JButton btnButton = new JButton("Login");
		btnButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String username= textField.getText();
	            String password=passwordField.getText();
	            System.out.println(username+","+password);
	    		
	            if(username.equals("hrithik") && password.equals("nr"))
	            {
	            	wel H=new wel();
	            	H.setVisible(true);
	            	dispose();
	            }
	            else
	            {
	            	unsuc H=new unsuc();
	            	H.setVisible(true);
	            	dispose();
	            }
	            	                      	
			}
		});
		
		btnButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnButton.setBounds(158, 210, 117, 23);
		Panel.add(btnButton);
		
		
	}
}
