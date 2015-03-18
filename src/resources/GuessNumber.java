package resources;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class GuessNumber implements Serializable {
	private int number;
	private String guessString;
	
	public GuessNumber() {
		number = (int)(Math.random() * 100);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getGuessString() {
		return guessString;
	}

	public void setGuessString(String guessString) {
		this.guessString = guessString;
	}
	
	public String getResponse() {
		if (guessString == null) {
			return "";
		}
		
		int guess = Integer.parseInt(guessString);
		if (guess < number) {
			return "Too low";
		}
		else {
			if (guess == number) {
				return "You are correct!";
			}
			else {
				return "Too high";
			}
		}
	}
}
