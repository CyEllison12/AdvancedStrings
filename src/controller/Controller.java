package controller;
import model.ChatBot;
import javax.swing.JOptionPane;

public class Controller
{
	private ChatBot simpleBot;
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
