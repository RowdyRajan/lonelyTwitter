import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSample(){
		assertFalse("This First Number is greater", greaterThan(6, 7));
	}
	
	public void testEqual(){
		NormalTweetModel normal = new NormalTweetModel("test tweet");
		NormalTweetModel secondTweet = new NormalTweetModel("test tweet");
		assertFalse("Different Tweets are not equal", normal.equals(secondTweet));
		
	}
	
	public boolean greaterThan(int i, int j){
		if (i>j)
			return true;
		else
			return false;
	}
}
