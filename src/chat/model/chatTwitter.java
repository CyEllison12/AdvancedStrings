package chat.model;

import chat.controller.ChatController;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class chatTwitter
{
	private ChatController app;
	private Twitter chatTwitter;
	
	private String tweetEnd;
	
	public chatTwitter(ChatController app)
	{
		this.app = app;
		this.chatTwitter = TwitterFactory.getSingleton();
		this.tweetEnd = " @CodyHenrichsen, @ChatbotCTEC";
	}

	public void sendTweet(String tweetText)
	{
		try
		{
			chatTwitter.updateStatus(tweetText);
		}
		catch(TwitterException twitterError)
		{
			app.handleErrors(twitterError);
		}
	}
}
