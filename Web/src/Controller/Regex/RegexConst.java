package Controller.Regex;

public interface RegexConst {
	String name_regex = "^[a-zA-Z ]{2,15}$";
	String surname_regex = "[a-zA-Z ]{2,15}";
	String email_regex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.]{0,1}[a-zA-Z]+";
}
