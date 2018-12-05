package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ChatPanel extends JFrame
{
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = new ChatController();
		this.appLayout = new SpringLayout();
		this.chatButton = new JButton("This is a button");
		this.inputField = new JTextField();
		this.chatArea = new JTextArea();
		this.chatPane = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}

}
