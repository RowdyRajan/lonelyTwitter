package ca.ualberta.cs.lonelytwitter;

public class Viewer extends User {
	public void setName(String name){
		if(name.length() > 8){
			throw new RuntimeException("To Long");
		}
		this.name = name;
	}
}
