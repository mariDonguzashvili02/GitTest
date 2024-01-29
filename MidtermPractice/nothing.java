package MidtermPractice;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class nothing extends ConsoleProgram{
	private ArrayList<String> friends;
	private String profileName;
	private String statusProfile;
	
	public void run(){
		profileName = "Alexa";
		statusProfile = "coding";
		friends = new ArrayList<String>();
		friends.add("Don");
//		friends.add("Julie");
//		friends.add("Bob");
		String text = toStrings();
		println(text);
		
	}
	
	private String toStrings() {
		String profile = profileName + "(" + statusProfile + "): ";
		
		for(int i = 0; i < friends.size(); i++){
			if(i != friends.size() - 1){
				profile += friends.get(i) + ", ";
			}else{
				profile += friends.get(i);
			}
		}
		
		return profile;
	}

}
