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
		this.content = new String("Pizza");
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
		
		spookyList.add("Happy Halloween!");
		spookyList.add("Trick or Treat!");
		spookyList.add("Awesome costume!");
		spookyList.add("Spooky skeletons");
		spookyList.add("The spookiest thing here are your jokes!");
		spookyList.add("BOOOO!");
		spookyList.add("YOUR FACE!");
		spookyList.add("Very spooky!");
		spookyList.add("IM JACK... THE PUMPKIN KING!");
		
		}
	
	//----------------------------
	public String processText(String userText)
	{
		/**String answer = "You said: ";//Declares answer variable
		answer += "Chatbot says: " + userText;//Adds this text to answer
		return answer;//What will show up when method is called*/
		
		String answer = "";
		
		if(!legitimacyChecker(userText))
		{
			answer += "\nYou really should not send null";
		}
		else
		{
			answer += "\nYou said: " + userText + "\n";
			
			if (contentChecker(userText))
			{
				answer += "You said the special words\n";
			}
			int randomIndex = (int) (responseList.size() * Math.random());
			answer += "Chatboy says: " + responseList.get(randomIndex) + "\r";
		}
		return answer;
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
	//---------------------------------
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2)
		{
			isValid = false;
		}
		else if(input.contains("sdf") || input.contains("jkl") || input.contains("cvb"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	//----------------------------------
	public boolean spookyChecker(String input)
	{
		boolean isValid = true;
		
		for(String spookyString: spookyList)
		{
			if (input.contains(spookyString))
			{
				isValid = true;
			}
			if(input.contains("Easter"))
			{
				isValid = false;
			}

		}
		
		return isValid;
		
	}
	//-------------------------------------COME BACK TO THIS-----------------------------
	public boolean contentChecker(String input)
	{
		boolean isValid = false;
	
			
		
		return isValid;
	}
	
	//-------------------------------------------
	public Chatbot(String string)
	{
		content = "sample content";
	}
	
	
	
	
	
	
	
	

}
