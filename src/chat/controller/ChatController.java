package chat.controller;

import chat.view.ChatFrame;
//import model.ArrayList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.model.chatTwitter;

//_______________________________________________________
public class ChatController
{
	private Chatbot simplebot;
	private ChatFrame appFrame;
	private chatTwitter myTwitter;
	//_________________________________________________________
	public ChatController()
	{
		simplebot = new Chatbot();
		appFrame = new ChatFrame(this);
		myTwitter = new chatTwitter(this);
	}
	//---------------------------------------------
	public Chatbot getChatbot()
	{
		return simplebot;
	}
	//---------------------------------------------
	public void start()
	{
		/*String userResponse = JOptionPane.showInputDialog(null, "Why hello there");
		useChatbotCheckers(userResponse);
		JOptionPane.showMessageDialog(null, interactWithChatbot(userResponse));
		String continueInput = JOptionPane.showInputDialog(null, "Type 'Yes' to run the program again");
		String userInput = JOptionPane.showInputDialog(null, "q to quit");
		{
			useChatbotCheckers(userInput);
		}*/
	}
	//__________________________________________________
	public String interactWithChatbot(String userInput)
	{
		/**String output = "You said: " + userInput + "Chatbot says: " + simplebot.processText(userInput);
		return output;*/
		
		String output = "";
		output += simplebot.processText(userInput);
		return output;
	}
	//____________________________________________
	public String useChatbotCheckers(String input)
	{
		String output = "";
		if (simplebot.spookyChecker(input))//Use the object simplebot, not the class Chatbot
		{
			output = "You said a spooky word. Halloween";
		}
		
		return output;
	}
	//_____________________________________________
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public void tweet(String text)
	{
		myTwitter.sendTweet(text);
	}
	
	public String findWords(String user)
	{
		String results = myTwitter.getMostCommonWord(user);
		return results;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}