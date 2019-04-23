package chat.model;

import chat.controller.ChatController;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class chatTwitter
{
	private ChatController app;
	private Twitter chatTwitter;
	
	public chatTwitter(ChatController app)
	{
		this.app = app;
		this.chatTwitter = TwitterFactory.getSingleton();
	}

}
