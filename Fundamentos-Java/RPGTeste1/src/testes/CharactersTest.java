package testes;

import exception.InvalidInputException;
import exception.InvalidNameException;
import model.Characters;

public class CharactersTest {
	
	public static void main(String[] args) {
		
		try {
			Characters char1 = new Characters("Amarildo", 15, "Lawfull", "Camarilla", true);
			System.out.println(char1);
			
		}catch (InvalidInputException| InvalidNameException e){
			System.out.println(e.getMessage());
		}
		
		try {
			Characters char2 = new Characters("", 0, "", "", false);
			char2.setName("a");
			char2.setAge(-1);
			char2.setAlignment("Chaotic");
			char2.setClan("Sabah");
			char2.setNPC(false);
			
		}catch(InvalidInputException| InvalidNameException e){
			System.out.println(e.getMessage());
		}
		

	}
}
