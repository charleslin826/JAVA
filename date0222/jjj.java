package date0222;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class jjj extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jjj frame = new jjj();
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
	public jjj() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JRadioButton rdbtnClickMe = new JRadioButton("Select ME! for nothing..");
		contentPane.add(rdbtnClickMe, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("NO.1 JFrame(Can be note book!)");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Click Here! for relaxing");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.WEST);
		
		JTextPane txtpnYouCanText = new JTextPane();
		txtpnYouCanText.setText("you can text here");
		contentPane.add(txtpnYouCanText, BorderLayout.EAST);
	}

}
