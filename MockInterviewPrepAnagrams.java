/*  Spit out list of all anagrams from a given list of words */
/* Eg: "star", "arc", "rats", "car", "arts", "stars" */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;

public class MockInterviewPrepAnagrams {

	public static void main(String[] argv) {
		
		HashMap<String, ArrayList<String>> mapReturn  = new HashMap<String, ArrayList<String>>(); 
		ArrayList<String> input = new ArrayList<String>();
		
		input.add("star");
		input.add("arc");
		input.add("zzy");
		input.add("rats");
		input.add("car");
		input.add("aab");
		input.add("arts");
		input.add("stars");
		input.add("rac");
		input.add("aba");
		input.add("zyz");
		
		mapReturn = anagrams(input);
		System.out.println(mapReturn);		
	}

	public static  HashMap<String, ArrayList<String>> anagrams(ArrayList<String> input) {
		
		HashMap<String, ArrayList<String>> map  = new HashMap<String, ArrayList<String>>(); 
		
		String sorted = null;
		
		for (String word: input) {
			
			/*Sort each word in the list*/
			sorted = sortString(word);
			
			//System.out.println(sorted);
			
			if (map.keySet().contains(sorted)) {
				map.get(sorted).add(word);
			}else {
				map.put(sorted, new ArrayList<String>());
				map.get(sorted).add(word);
			}
		}
		return map;
	}

	public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 	
	
}
