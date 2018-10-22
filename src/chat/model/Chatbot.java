package chat.model;
import java.util.ArrayList; 


public class Chatbot
{
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	private String content;
	private String joke;
	private String currentuser;
	
	public Chatbot()
	{
		this.joke = "Whats a pirates favorite letter?";
		this.content = new String("boring content");
		this.currentuser = new String("This is default user");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}

	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("Thats not nice!");
		responseList.add("I don't understand...");
		responseList.add("Thats pretty funny!");
		responseList.add("You already said that!");
		responseList.add("Don't say that!");
		responseList.add("I think you are cool");
		responseList.add("Very Funny!");
		responseList.add("Your welcome!");
		responseList.add("Thanks!");
		responseList.add("What do you call yourself?");
		responseList.add("Are you my friend?");
		responseList.add("Very Scary!");
		responseList.add("Nice try!");
		responseList.add("You say that too much!");
		
		spookyList.add("BOO!");
		spookyList.add("Trick or Treat!");
		spookyList.add("I pick trick!");
		}
	
	public String processText(String userText)
	{
		String answer = "";
		answer += "You said: " + userText;
		return answer;
	}
	

}
