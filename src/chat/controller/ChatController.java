package chat.controller;
import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot simplebot;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		simplebot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	public Chatbot getChatbot()
	{
		return simplebot;
	}
	
	public String interactWithChatbot(String text)
	{
		String output= "";
		String userResponse = JOptionPane.showInputDialog(null, "Why hello!");
		output = simplebot.processText("Chatbot says: "+userResponse);
		return output;
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
