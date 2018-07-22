package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Controller.Regex.RegexConst;
import Model.Model;

public class Controller implements RegexConst {
	private Model model; 
    Pattern pattern;
    Matcher matcher;
    
    public Controller() {
	}
    
	public Controller(Model model) {
	    this.model = model;
	}
	
	public boolean checkValidation(String regex, String str) {
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(str);
		if(matcher.matches()) {
			return true;
		}
		else
			return false;
	}
}
