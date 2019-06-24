package site.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class WindowBuilderApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JMenuItem init;
	private JMenuItem exit;
	private JButton red;
	private JButton blue;
	private JButton green;
	private JButton black;
	private JScrollPane scrollPane;
	private JTextArea area;
	private JTextField field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderApp frame = new WindowBuilderApp();
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
	public WindowBuilderApp() {
		setTitle("WindowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 418, 658);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu file = new JMenu("\uD30C\uC77C(F)");
		file.setMnemonic('F');
		menuBar.add(file);
		file.addSeparator();
		init = new JMenuItem("\uD654\uBA74 \uCD08\uAE30\uD654");
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		file.add(init);
		
		exit = new JMenuItem("\uD504\uB85C\uADF8\uB7A8 \uC885\uB8CC");
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		file.add(exit);
		
		JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0(H)");
		help.setMnemonic('H');
		menuBar.add(help);
		
		JMenuItem helping = new JMenuItem("\uB3C4\uC6C0\uB9D0");
		help.add(helping);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		red = new JButton("\uBE68\uAC04\uC0C9");
		red.setForeground(Color.RED);
		panel.add(red);
		
		blue = new JButton("\uD30C\uB791\uC0C9");
		blue.setForeground(Color.BLUE);
		panel.add(blue);
		
		green = new JButton("\uCD08\uB85D\uC0C9");
		green.setForeground(Color.GREEN);
		panel.add(green);
		
		black = new JButton("\uAC80\uC740\uC0C9");
		black.setEnabled(false);
		panel.add(black);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		area = new JTextArea();
		area.setFocusable(false);
		scrollPane.setViewportView(area);
		
		field = new JTextField();
		contentPane.add(field, BorderLayout.SOUTH);
		field.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	}


