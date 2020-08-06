package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class MainGame extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame frame = new MainGame();
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
	public MainGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Searching Game");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(266, -1, 186, 50);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(81, 60, 565, 330);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel StartMenu = new JPanel();
		StartMenu.setLayout(null);
		layeredPane.add(StartMenu, "name_44347427825541");
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to the game!");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(186, 11, 180, 14);
		StartMenu.add(lblNewLabel_4);
		
		txtEnterName = new JTextField();
		txtEnterName.setBounds(174, 223, 204, 20);
		StartMenu.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Enter your name");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(202, 198, 144, 14);
		StartMenu.add(lblNewLabel_5);
		
		
		JLabel lblLogoanimation = new JLabel("LOGO/ANIMATION");
		lblLogoanimation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoanimation.setBounds(186, 95, 180, 14);
		StartMenu.add(lblLogoanimation);
		
		
		JPanel Level1 = new JPanel();
		Level1.setBackground(Color.WHITE);
		layeredPane.add(Level1, "name_41123650840793");
		Level1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(MainGame.class.getResource("/puzzles/Puzzle1.JPG")));
		lblNewLabel_1.setBounds(-44, 11, 395, 308);
		Level1.add(lblNewLabel_1);
		
		JRadioButton op8 = new JRadioButton("WOOD");
		op8.setBounds(377, 239, 109, 23);
		Level1.add(op8);
		
		JRadioButton op5 = new JRadioButton("ISLAND");
		op5.setBounds(377, 162, 109, 23);
		Level1.add(op5);
		
		JRadioButton op3 = new JRadioButton("FRUITS");
		op3.setBounds(377, 111, 109, 23);
		Level1.add(op3);
		
		JRadioButton op2 = new JRadioButton("FOOD");
		op2.setBounds(377, 85, 109, 23);
		Level1.add(op2);
		
		JRadioButton op1 = new JRadioButton("AIR");
		op1.setBounds(377, 59, 109, 23);
		Level1.add(op1);
		
		JRadioButton op4 = new JRadioButton("ICE");
		op4.setBounds(377, 137, 109, 23);
		Level1.add(op4);
		
		JRadioButton op6 = new JRadioButton("TREE");
		op6.setBounds(377, 187, 109, 23);
		Level1.add(op6);
		
		JRadioButton op7 = new JRadioButton("WATER");
		op7.setBounds(377, 213, 109, 23);
		Level1.add(op7);
		
		JLabel lblNewLabel_2 = new JLabel("Find the following words and tick them");
		lblNewLabel_2.setBounds(323, 11, 222, 41);
		Level1.add(lblNewLabel_2);
		
		
		
		JPanel Level2 = new JPanel();
		layeredPane.add(Level2, "name_41133699826709");
		Level2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainGame.class.getResource("/puzzles/Puzzle2.JPG")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-35, 11, 395, 308);
		Level2.add(label);
		
		JRadioButton opt8 = new JRadioButton("SALSA");
		opt8.setBounds(387, 239, 109, 23);
		Level2.add(opt8);
		
		JRadioButton opt5 = new JRadioButton("JUICE");
		opt5.setBounds(387, 162, 109, 23);
		Level2.add(opt5);
		
		JRadioButton opt3 = new JRadioButton("CREAM");
		opt3.setBounds(387, 111, 109, 23);
		Level2.add(opt3);
		
		JRadioButton opt2 = new JRadioButton("COCKTAIL");
		opt2.setBounds(387, 85, 109, 23);
		Level2.add(opt2);
		
		JRadioButton opt1 = new JRadioButton("BURGER");
		opt1.setBounds(387, 59, 109, 23);
		Level2.add(opt1);
		
		JRadioButton opt4 = new JRadioButton("CRISPS");
		opt4.setBounds(387, 137, 109, 23);
		Level2.add(opt4);
		
		JRadioButton opt6 = new JRadioButton("NACHOS");
		opt6.setBounds(387, 187, 109, 23);
		Level2.add(opt6);
		
		JRadioButton opt7 = new JRadioButton("PIZZA");
		opt7.setBounds(387, 213, 109, 23);
		Level2.add(opt7);
		
		JLabel label_1 = new JLabel("Find the following words and tick them");
		label_1.setBounds(333, 11, 222, 41);
		Level2.add(label_1);
		
		JButton button = new JButton("Completed");
		button.setBounds(387, 285, 109, 23);
		Level2.add(button);
		
		JPanel Level3 = new JPanel();
		layeredPane.add(Level3, "name_41138361164400");
		Level3.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 395, 308);
		Level3.add(label_2);
		
		JRadioButton rdbtnA_15 = new JRadioButton("");
		rdbtnA_15.setBounds(421, 228, 109, 23);
		Level3.add(rdbtnA_15);
		
		JRadioButton rdbtnA_12 = new JRadioButton("");
		rdbtnA_12.setBounds(421, 151, 109, 23);
		Level3.add(rdbtnA_12);
		
		JRadioButton rdbtnA_10 = new JRadioButton("");
		rdbtnA_10.setBounds(421, 100, 109, 23);
		Level3.add(rdbtnA_10);
		
		JRadioButton rdbtnA_9 = new JRadioButton("");
		rdbtnA_9.setBounds(421, 74, 109, 23);
		Level3.add(rdbtnA_9);
		
		JRadioButton rdbtnA_8 = new JRadioButton("");
		rdbtnA_8.setBounds(421, 48, 109, 23);
		Level3.add(rdbtnA_8);
		
		JRadioButton rdbtnA_11 = new JRadioButton("");
		rdbtnA_11.setBounds(421, 126, 109, 23);
		Level3.add(rdbtnA_11);
		
		JRadioButton rdbtnA_13 = new JRadioButton("");
		rdbtnA_13.setBounds(421, 176, 109, 23);
		Level3.add(rdbtnA_13);
		
		JRadioButton rdbtnA_14 = new JRadioButton("");
		rdbtnA_14.setBounds(421, 202, 109, 23);
		Level3.add(rdbtnA_14);
		
		JLabel label_3 = new JLabel("Find the following words and tick them");
		label_3.setBounds(367, 0, 222, 41);
		Level3.add(label_3);
		
		JButton button_1 = new JButton("Completed");
		button_1.setBounds(421, 274, 109, 23);
		Level3.add(button_1);
		
		JButton btnNewButton = new JButton("Completed");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op1.isSelected()==true&&op2.isSelected()==true&&op3.isSelected()==true&&op4.isSelected()==true&&op5.isSelected()==true&&op6.isSelected()==true&&op7.isSelected()==true&&op8.isSelected()==true) {
			Level1.setVisible(false);
			Level2.setVisible(true);
			Level3.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(contentPane, "Please Find all the words in order to proceed");
			}
			}
		});
		btnNewButton.setBounds(377, 285, 109, 23);
		Level1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start Game!");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtEnterName.getText().isEmpty()==true) {
					JOptionPane.showMessageDialog(contentPane, "Please enter your name in order to play");
				}
				else {
				StartMenu.setVisible(false);
				Level1.setVisible(true);
				Level2.setVisible(false);
				Level3.setVisible(false);
				}
			}
		});
		btnNewButton_1.setBounds(220, 254, 121, 23);
		StartMenu.add(btnNewButton_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("Player Score:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(22, 32, 89, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblname = new JLabel("$score");
		lblname.setForeground(Color.WHITE);
		lblname.setBounds(112, 32, 129, 14);
		contentPane.add(lblname);
		
		JLabel label_4 = new JLabel("Player Name:");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(22, 11, 89, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("$name");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(112, 11, 129, 14);
		contentPane.add(label_5);
	}
}
