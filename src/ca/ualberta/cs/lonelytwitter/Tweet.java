package ca.ualberta.cs.lonelytwitter;

public class Tweet {
	private String tweet;
	private int retweets;
	private int favorites;
	
	public Tweet(String tweet) {
		super();
		this.tweet = tweet;
	}

	public int getRetweets() {
		return retweets;
	}

	public void setRetweets(int retweets) {
		this.retweets = retweets;
	}

	public int getFavorites() {
		return favorites;
	}

	public void setFavorites(int favorites) {
		this.favorites = favorites;
	}

	public String getTweet() {
		return tweet;
	}
	
	
	
}
