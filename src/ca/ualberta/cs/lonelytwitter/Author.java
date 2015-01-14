package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Author extends User implements UserLike {

	public Author(String string)  {
		
		this.name = string;
	}

	@Override
	public void setName(String name) throws IOException {
		
		if(name.length() > 8){
			throw new IOException("To Long");
		}
		this.name = name;
	}

	

	
}
