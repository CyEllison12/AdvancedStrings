package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class ChatPanel extends JPanel
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
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		this.chatButton = new JButton("Chat");
		this.chatField = new JTextField("Talk to bot here", 50);
		this.checkerButton = new JButton("Check Text");
		this.loadButton = new JButton("Load");
		this.saveButton = new JButton("Save");
		this.chatArea = new JTextArea("Chat Area", 20, 50);



		this.chatPane = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);repaint();
		
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

		add(chatArea);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, chatField, 100, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatArea, -230, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 18, SpringLayout.SOUTH, chatArea);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 100, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -92, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatField, -6, SpringLayout.WEST, chatButton);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 53, SpringLayout.SOUTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 133, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 56, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 133, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 56, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 133, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 18, SpringLayout.SOUTH, chatArea);
		
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
				});
			
		
	}
	


}
