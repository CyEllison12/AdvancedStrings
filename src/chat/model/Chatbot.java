package chat.model;
import java.util.ArrayList; 


public class Chatbot
{
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	private String content;
	private String joke;
	private String currentUser;
	
	public Chatbot()
	{
		this.joke = "Whats a pirates favorite letter?";
		this.content = new String("boring content");
		this.currentUser = new String("This is default user");
		
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
	
	public Chatbot(String content)
	{
		
	}
	//----------------------------
	public String processText(String userText)
	{
		String answer = "";//Declares answer variable
		answer += "You said: " + userText;//Adds this text to answer
		return answer;//What will show up when method is called
	}
	//______________________________________________
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	//---------------------------
	public String getContent()
	{
		return content;
	}
	//-----------------------------
	public String getCurrentUser()
	{
		return currentUser;
	}
	//-------------------------
	public String getJoke()
	{
		return joke;
	}
	//_______________________________________
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}
	//--------------------------------
	public void setContent(String content)
	{
		this.content = content;
	}
	//--------------------------------
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	//--------------------------------
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
	

}
