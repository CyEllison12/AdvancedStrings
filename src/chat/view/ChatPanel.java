package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class ChatPanel extends JFrame
{
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JButton saveButton;
	private JButton loadButton;
	private JButton checkerButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = new ChatController();
		this.appLayout = new SpringLayout();
		
		this.chatButton = new JButton("This is a button");
		this.chatButton = new JButton("Chat");
		this.saveButton = new JButton("Save");
		this.loadButton = new JButton("Load");
		this.checkerButton = new JButton("Check Text");
		
		this.chatField = new JTextField("Talk to bot here", 50);
		this.chatArea = new JTextArea("Chat Area", 20, 50);
		this.chatPane = new JScrollPane();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.CYAN);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	


}
