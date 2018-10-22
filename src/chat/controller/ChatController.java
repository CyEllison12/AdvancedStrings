package chat.controller;
import javax.swing.JOptionPane;

import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simplebot;
	
	public ChatController()
	{
		simplebot = new Chatbot();
	}
	public Chatbot getChatbot()
	{
		return simplebot;
	}
	
	public String interactWithChatbot(String text)
	{
		String output= "";
		String userResponse = JOptionPane.showInputDialog(null, "WHY");
		output = simplebot.processText(userResponse);
		return output = "";
	}
	
	public void start() 
	{

		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput =JOptionPane.showInputDialog(null, "THIS IS A TEST");
			JOptionPane.showMessageDialog(null, userInput);
		}
		

		
	}

}