package com.jdgl.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Login_zhanghao;
	private JPasswordField Login_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("\u5982\u5BB6\u9152\u5E97\u7BA1\u7406\u7CFB\u7EDF");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/image/\u62A4\u76EE\u955C.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 22));
		lblNewLabel.setBounds(126, 210, 149, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 23));
		lblNewLabel_1.setBounds(126, 284, 164, 40);
		contentPane.add(lblNewLabel_1);
		
		Login_zhanghao = new JTextField();
		Login_zhanghao.setBounds(222, 218, 257, 30);
		contentPane.add(Login_zhanghao);
		Login_zhanghao.setColumns(10);
		
		Login_password = new JPasswordField();
		Login_password.setBounds(222, 284, 257, 30);
		contentPane.add(Login_password);
		
		JButton Login_btn1 = new JButton("\u767B  \u5F55");
		Login_btn1.setFont(new Font("阿里汉仪智能黑体", Font.PLAIN, 17));
		Login_btn1.setBounds(126, 401, 149, 46);
		contentPane.add(Login_btn1);
		
		JButton Login_btn2 = new JButton("\u9000  \u51FA");
		Login_btn2.setFont(new Font("阿里汉仪智能黑体", Font.PLAIN, 17));
		Login_btn2.setBounds(378, 401, 149, 46);
		contentPane.add(Login_btn2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/\u9152\u5E97\u7F8E\u56FE.jpg")));
		lblNewLabel_2.setBounds(10, 0, 554, 385);
		contentPane.add(lblNewLabel_2);
	}
}
