package com.greatlearning.service;

import java.util.ArrayList;
import java.util.Random;

public class CredentialService {
	
	public String generatePassword() {

	    final String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    final String nums = "0123456789";
	    final String special = "!@#$%^&*()_+=-";
	    
	    StringBuilder sb = new StringBuilder();
	    Random rand = new Random();
	    
	    int random = 0, index = 0, length = 8; 
	    ArrayList<Character> randomChar = new ArrayList<Character>();
	    
	    for (int i = 0; i < 4; i++) {
	    	
	    	switch(i) {
	    	case 0:
	    		index = rand.nextInt(Alphabet.length());
	    		randomChar.add(Alphabet.charAt(index));
	    	break;
	    	
	    	case 1:
	    		index = rand.nextInt(alphabet.length());
	    		randomChar.add(alphabet.charAt(index));
	    	break;
	    	
	    	case 2:
	    		index = rand.nextInt(nums.length());
	    		randomChar.add(nums.charAt(index));
	    	break;
	    	
	    	case 3:
	    		index = rand.nextInt(special.length());
	    		randomChar.add(special.charAt(index));
	    	break;
	    	}
	    }
	    
	    for(int i = 4; i < length; i++) {
	    	
	    	random = (int) Math.floor(Math.random() * (4) + 1);
	    	index = 0;
	    	switch(random) {
	    	case 1:
	    		index = rand.nextInt(Alphabet.length());
	    		randomChar.add(Alphabet.charAt(index));
	    		break;
	    		
	    	case 2: 
		  	    index = rand.nextInt(alphabet.length());
		  	    randomChar.add(alphabet.charAt(index));
			    break;
			    
	    	case 3:
	    		index = rand.nextInt(nums.length());
	    		randomChar.add(nums.charAt(index));
			    break;
			    
	    	case 4:
	    		index = rand.nextInt(special.length());
	    		randomChar.add(special.charAt(index));
			    break;
			    }
	    	}
	    
	    while(randomChar.size()!= 0){
            int rando = (int)(Math.floor(Math.random() * randomChar.size()));
            sb.append(randomChar.remove(rando));
        }
	    return sb.toString();
		}
	
	public String generateEmailAddress(String firstName, String lastName, int department) {
		
		String email = null;
		
		switch(department) {
		case 1:
			email = firstName + lastName + "@tech.abc.com";
			break;
			
		case 2:
			email = firstName + lastName + "@admin.abc.com";
			break;
			
		case 3:
			email = firstName + lastName + "@hr.abc.com";
			break;
			
		case 4:
			email = firstName + lastName + "@legal.abc.com";
			break;
			
		default:
			System.out.println("Invalid choice");
		}
		return email;
	}
	public void showCredentials(String firstName, String email, String password) {
		System.out.println("Dear " + firstName + " your generated credentials are as follows: \n");
		System.out.println("Email      ---> " + email);
		System.out.println("Password   ---> " + password);
	}
}
