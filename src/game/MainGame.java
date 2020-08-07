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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGame extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;
    String player_name;
    float player_score;
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
		contentPane.setLocation(-81, -49);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word Search 1.0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(251, 11, 215, 50);
		contentPane.add(lblNewLabel);
		JLabel pscore = new JLabel();
		pscore.setForeground(Color.WHITE);
		pscore.setBounds(22, 32, 104, 14);
		contentPane.add(pscore);
		
		JLabel lblplayerscore = new JLabel();
		lblplayerscore.setForeground(Color.WHITE);
		lblplayerscore.setBounds(122, 32, 129, 14);
		contentPane.add(lblplayerscore);
		
		JLabel pname = new JLabel();
		pname.setForeground(Color.WHITE);
		pname.setBounds(22, 11, 89, 14);
		contentPane.add(pname);
		
		
		JLabel lblplayername = new JLabel();
		lblplayername.setForeground(Color.WHITE);
		lblplayername.setBounds(112, 11, 252, 14);
		contentPane.add(lblplayername);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(81, 60, 565, 330);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		
		JPanel StartMenu = new JPanel();
		StartMenu.setBackground(Color.WHITE);
		StartMenu.setLayout(null);
		layeredPane.add(StartMenu, "name_44347427825541");
		
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
		lblLogoanimation.setBounds(184, 128, 180, 14);
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
		Level2.setBackground(Color.WHITE);
		layeredPane.add(Level2, "name_41133699826709");
		Level2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainGame.class.getResource("/puzzles/Puzzle2.JPG")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(-46, 11, 395, 308);
		Level2.add(label);
		
		JRadioButton opt8 = new JRadioButton("SALSA");
		opt8.setBounds(376, 239, 109, 23);
		Level2.add(opt8);
		
		JRadioButton opt5 = new JRadioButton("JUICE");
		opt5.setBounds(376, 162, 109, 23);
		Level2.add(opt5);
		
		JRadioButton opt3 = new JRadioButton("CREAM");
		opt3.setBounds(376, 111, 109, 23);
		Level2.add(opt3);
		
		JRadioButton opt2 = new JRadioButton("COCKTAIL");
		opt2.setBounds(376, 85, 109, 23);
		Level2.add(opt2);
		
		JRadioButton opt1 = new JRadioButton("BURGER");
		opt1.setBounds(376, 59, 109, 23);
		Level2.add(opt1);
		
		JRadioButton opt4 = new JRadioButton("CRISPS");
		opt4.setBounds(376, 137, 109, 23);
		Level2.add(opt4);
		
		JRadioButton opt6 = new JRadioButton("NACHOS");
		opt6.setBounds(376, 187, 109, 23);
		Level2.add(opt6);
		
		JRadioButton opt7 = new JRadioButton("PIZZA");
		opt7.setBounds(376, 213, 109, 23);
		Level2.add(opt7);
		
		JLabel label_1 = new JLabel("Find the following words and tick them");
		label_1.setBounds(322, 11, 222, 41);
		Level2.add(label_1);
		
		
		JPanel Level3 = new JPanel();
		Level3.setBackground(Color.WHITE);
		layeredPane.add(Level3, "name_41138361164400");
		Level3.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(MainGame.class.getResource("/puzzles/Puzzle3.JPG")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(-38, 11, 395, 308);
		Level3.add(label_2);
		
		JRadioButton optn8 = new JRadioButton("VENUS");
		optn8.setBounds(387, 239, 109, 23);
		Level3.add(optn8);
		
		JRadioButton optn5 = new JRadioButton("SATURN");
		optn5.setBounds(387, 162, 109, 23);
		Level3.add(optn5);
		
		JRadioButton optn3 = new JRadioButton("MARS");
		optn3.setBounds(387, 111, 109, 23);
		Level3.add(optn3);
		
		JRadioButton optn2 = new JRadioButton("JUPITER");
		optn2.setBounds(387, 85, 109, 23);
		Level3.add(optn2);
		
		JRadioButton optn1 = new JRadioButton("EARTH");
		optn1.setBounds(387, 59, 109, 23);
		Level3.add(optn1);
		
		JRadioButton optn4 = new JRadioButton("PLUTO");
		optn4.setBounds(387, 137, 109, 23);
		Level3.add(optn4);
		
		JRadioButton optn6 = new JRadioButton("SUN");
		optn6.setBounds(387, 187, 109, 23);
		Level3.add(optn6);
		
		JRadioButton optn7 = new JRadioButton("URANUS");
		optn7.setBounds(387, 213, 109, 23);
		Level3.add(optn7);
		
		JLabel label_3 = new JLabel("Find the following words and tick them");
		label_3.setBounds(333, 11, 222, 41);
		Level3.add(label_3);

		JPanel credits = new JPanel();
		credits.setBackground(Color.WHITE);
		credits.setLayout(null);
		layeredPane.add(credits, "name_11963072974199");
		
		
		JButton btnNewButton = new JButton("Completed");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op1.isSelected()==true&&op2.isSelected()==true&&op3.isSelected()==true&&op4.isSelected()==true&&op5.isSelected()==true&&op6.isSelected()==true&&op7.isSelected()==true&&op8.isSelected()==true) {
			StartMenu.setVisible(false);
			credits.setVisible(false);
			Level1.setVisible(false);
			Level2.setVisible(true);
			Level3.setVisible(false);
			
			player_score=player_score+20.0f;
			lblplayerscore.setText(Float.toString(player_score)+"pts");
				
	        
			
			}
			else {
				JOptionPane.showMessageDialog(contentPane, "Please Find all the words in order to proceed");
			}
			}
		});
		btnNewButton.setBounds(377, 285, 109, 23);
		Level1.add(btnNewButton);
		
		JButton button = new JButton("Completed");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(opt1.isSelected()==true&&opt2.isSelected()==true&&opt3.isSelected()==true&&opt4.isSelected()==true&&opt5.isSelected()==true&&opt6.isSelected()==true&&opt7.isSelected()==true&&opt8.isSelected()==true) {
					StartMenu.setVisible(false);
					credits.setVisible(false);
					Level1.setVisible(false);
					Level2.setVisible(false);
					Level3.setVisible(true);
					player_score=player_score+20.0f;
					lblplayerscore.setText(Float.toString(player_score)+"pts");
					
					}
					else {
						JOptionPane.showMessageDialog(contentPane, "Please Find all the words in order to proceed");
					}	
			}
		});
		button.setBounds(376, 285, 109, 23);
		Level2.add(button);
		
		
		JButton btnNewButton_1 = new JButton("Start Game!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtEnterName.getText().isEmpty()==true) {
					JOptionPane.showMessageDialog(contentPane, "Please enter your name in order to play");
				}
				else {
					pname.setText("PLAYER NAME:");
					pscore.setText("PLAYER SCORE:");
					player_name=txtEnterName.getText().toString();
					lblplayername.setText(player_name);
					
					player_score=0.0f;
					
					lblplayerscore.setText(Float.toString(player_score)+"pts");
					
					
				StartMenu.setVisible(false);
				credits.setVisible(false);
				Level1.setVisible(true);
				Level2.setVisible(false);	
				Level3.setVisible(false);
				}
			}
		});
		btnNewButton_1.setBounds(217, 254, 122, 23);
		StartMenu.add(btnNewButton_1);
		
		JLabel lblWelcomeGamer = new JLabel("WELCOME GAMER!");
		lblWelcomeGamer.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeGamer.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblWelcomeGamer.setBounds(129, 0, 292, 93);
		StartMenu.add(lblWelcomeGamer);
		
		
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("THANK YOU FOR PLAYING");
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(134, 90, 292, 93);
		credits.add(lblNewLabel_6);
		
		JLabel lblplayerHasEarned = new JLabel();
		lblplayerHasEarned.setHorizontalAlignment(SwingConstants.CENTER);
		lblplayerHasEarned.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblplayerHasEarned.setBounds(10, 149, 545, 127);
		credits.add(lblplayerHasEarned);
		
		JButton button_1 = new JButton("Completed");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(optn1.isSelected()==true&&optn2.isSelected()==true&&optn3.isSelected()==true&&optn4.isSelected()==true&&optn5.isSelected()==true&&optn6.isSelected()==true&&optn7.isSelected()==true&&optn8.isSelected()==true)
				{
				StartMenu.setVisible(false);
				credits.setVisible(true);
				Level1.setVisible(false);
				Level2.setVisible(false);
				Level3.setVisible(false);
				player_score=player_score+20.0f;
				lblplayerscore.setText(Float.toString(player_score)+"pts");
				lblplayerHasEarned.setText(player_name+" has completed the puzzle and earned "+Float.toString(player_score)+" points");
				pname.setVisible(false);
				pscore.setVisible(false);
				lblplayername.setVisible(false);
				lblplayerscore.setVisible(false);
			
			}
				else {
			     JOptionPane.showMessageDialog(contentPane, "please find all the words in order to proceed");		
				}
			}
		});
		button_1.setBounds(387, 285, 109, 23);
		Level3.add(button_1);
		
		
	}
}
