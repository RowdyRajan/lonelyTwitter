package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tweeter {
	
	private ArrayList<Tweeter> following = new ArrayList<Tweeter>();
	private ArrayList<Tweeter> followers = new ArrayList<Tweeter>();
	private ArrayList<Tweet> allTweets = new ArrayList<Tweet>();
	private String twitterHandle;
	
	
	public Tweeter(String twitterHandle) {
		super();
		this.twitterHandle = twitterHandle;
	}

	public ArrayList<Tweeter> getFollowing() {
		return following;
	}

	public void setFollowing(ArrayList<Tweeter> following) {
		this.following = following;
	}

	public ArrayList<Tweeter> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<Tweeter> followers) {
		this.followers = followers;
	}

	public String getTwitterHandle() {
		return twitterHandle;
	}

	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	
	public void addFollowers(Tweeter user){};
	public void removeFollowers(Tweeter user){};
	public void startFollowing(Tweeter user){};
	public void stopFollowing(Tweeter user){}

	public ArrayList<Tweet> getAllTweets() {
		return allTweets;
	}

	public void setAllTweets(ArrayList<Tweet> allTweets) {
		this.allTweets = allTweets;
	};
	
	
	
	
	
	
	
}
