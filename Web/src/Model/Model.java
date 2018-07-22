package Model;

import DatabaseENUM.NameENUM;

public class Model {
	public boolean checkInputbyEquailty(String input, NameENUM dBname){
		if(input.equals(dBname.toString())){
			return true;
		}
		else {
			return false;
		}
	}
}
