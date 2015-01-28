import junit.framework.AssertionFailedError;
import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;


public class TweetListModelTests extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	private TwitterListModel tweets;
	public TweetListModelTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets = new TwitterListModel();
	}
	/*
	public void testtweetListsInitialized(){
		
		assertNotNull("Is list initialized", tweets);
		
	}
	
	public void testListCount(){
		
		NormalTweetModel tweet = new NormalTweetModel("hi");
		tweets.addTweet(tweet);
		assertEquals("added a tweet, counter updated?", 1, tweets.getListLength());
		
	}*/
	
	public void testEquals(){
		NormalTweetModel tweet = new NormalTweetModel("YES");
		NormalTweetModel tweet2 = new NormalTweetModel("YES");
		assertTrue(tweet.equals(tweet2));
	}
	
	public void testAddTweet() {
		NormalTweetModel tweet = new NormalTweetModel("YES");
		NormalTweetModel tweet2 = new NormalTweetModel("YES");
		tweets.addTweet(tweet);
		try{
			tweets.addTweet(tweet2);
		}
		catch(IllegalArgumentException e){
			assertTrue(1==1);
		}
	}
	public void testGetTweets(){
		NormalTweetModel tweet = new NormalTweetModel("Checking");	
		NormalTweetModel tweet2 = new NormalTweetModel("Thing");
		NormalTweetModel[] tweetArray = { tweet, tweet2};
		tweets.addTweet(tweet);
		tweets.addTweet(tweet2);
		assertTrue(tweetArray.equals(tweets.getTweets()));
	}
	public void testHasTweet() {
		NormalTweetModel tweet = new NormalTweetModel("Checking");
		tweets.addTweet(tweet);
		assertTrue(tweets.hasTweet(tweet));
	}
	
	public void testRemoveTweet() {
		NormalTweetModel tweet = new NormalTweetModel("Checking");
		tweets.addTweet(tweet);
		tweets.removeTweet(tweet);
		assertFalse(tweets.hasTweet(tweet));
	}

}
