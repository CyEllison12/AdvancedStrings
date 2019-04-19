package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import chat.controller.IOController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JButton saveButton;
	private JButton loadButton;
	private JButton clearButton;
	private JButton checkerButton;
	private JButton tweetButton;
	private JButton searchTwitter;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JPanel buttonPanel;
	
	private ImageIcon saveIcon;
	private ImageIcon loadIcon;
	private ImageIcon chaticon;
	private ImageIcon checkerIcon;
	private ImageIcon tweetIcon;
	private ImageIcon searchIcon;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		this.chatButton = new JButton("Chat");
		this.chatField = new JTextField("Talk to bot here", 50);
		this.checkerButton = new JButton("Check Text");
		this.clearButton = new JButton("Clear Text");
		this.loadButton = new JButton("Load");
		this.saveButton = new JButton("Save", saveIcon);
		this.chatArea = new JTextArea("Chat Area", 20, 50);
		
		this.saveIcon = new ImageIcon(getClass().getResource("/chat/view/images/save.png"));
		
		this.tweetButton = new JButton("Send Tweet");
		this.searchTwitter = new JButton("Search Twitter");
		
		buttonPanel = new JPanel(new GridLayout(1,0));
		
		this.chatPane = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
		setupButtonPanel();
	}
	
	private void setupButtonPanel()
	{
		buttonPanel.add(saveButton);
		buttonPanel.add(loadButton);
		buttonPanel.add(chatButton);
		buttonPanel.add(checkerButton);
		buttonPanel.add(tweetButton);
		buttonPanel.add(searchTwitter);
		
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
		this.setPreferredSize(new Dimension(1024, 768));
		this.setBackground(Color.CYAN);
		this.add(chatPane);
		this.add(chatField);
		buttonPanel.setPreferredSize(new Dimension(900,150));
		buttonPanel.setBackground(Color.MAGENTA);
		this.add(buttonPanel);

		add(chatArea);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, buttonPanel);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, buttonPanel);
		appLayout.putConstraint(SpringLayout.NORTH, buttonPanel, 523, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, buttonPanel, 65, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 23, SpringLayout.SOUTH, chatArea);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 65, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatArea, 366, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -59, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 10, SpringLayout.NORTH, this);
	}
	
	private String getPath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if(choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		return path;
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
		
		clearButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.setText("Text reset! \nRIP chatbot");
			}
				});
		
		saveButton.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent click)
	{
		String chatText = chatArea.getText();
		String path = ".";
		IOController.saveText(appController, path, chatText);
		chatArea.setText("Chat saved!");
	}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent click)
	{
		String path = getPath("load");
		String chatText = IOController.loadFile(appController, path);
		chatArea.setText(chatText);
	}
		});
		
		
			
		
	}
	


}
