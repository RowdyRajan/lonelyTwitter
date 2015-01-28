package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TwitterListModel {
	private ArrayList<LonelyTweetModel> tweets;
	private int count;
	
	
	public TwitterListModel() {
		count = 0;
		tweets = new ArrayList<LonelyTweetModel>();
	}
	
	public int getListLength(){
		return count;
	}
	
	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException{
		for (LonelyTweetModel i : tweets){
			if (i.equals(tweet)){
				throw new IllegalArgumentException();
			}
		}
		tweets.add(tweet);
		
		
	}
	
	public LonelyTweetModel[] getTweets(){
		
		return  (LonelyTweetModel[]) tweets.toArray();
		
	}
	
	public boolean hasTweet(LonelyTweetModel tweet	){
		for (LonelyTweetModel i : tweets){
			if (i.equals(tweet))
				return true;
		}
		return false;
		
	}
	
	public void removeTweet(LonelyTweetModel tweet){
		if(tweets.contains(tweet)){
			tweets.remove(tweet);
		}
	}
}
