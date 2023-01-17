package collegeToCorporate;

import java.io.*;
import java.util.*;


public class AnagramFinder {
    public static void main(String[] args) throws Exception {
        ArrayList<String> sowpod = readSowPod();
       
        HashMap<String, ArrayList<String>> result = new HashMap<>();
        
        result = groupAnagrams(sowpod);
        
        
        for(Map.Entry<String, ArrayList<String>> set : result.entrySet()) {
        	if(set.getValue().size() > 1) {
        		System.out.println(set.getValue());
        		
        	}
        	
        }
     
        
        
    }
    
    public static HashMap<String, ArrayList<String>> groupAnagrams(ArrayList<String> sowpod) {
    	
    	
    	HashMap<String, ArrayList<String>> map = new HashMap<>();
    	
    	for(String str : sowpod) {
    		char[] chr = str.toCharArray();
    		Arrays.sort(chr);
    		String sortedWord = new String(chr);
    		
    		if(map.containsKey(sortedWord)) {
    			map.get(sortedWord).add(str);
    		}
    		else
    		{
    			ArrayList<String> strList = new ArrayList<>();
    			strList.add(str);
    			map.put(sortedWord, strList);
    		}
    	}
    	return map;
    	
    }
   

	public static ArrayList<String> readSowPod() throws Exception {
        File file = new File("sowpods.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> sowpod = new ArrayList<String>();
        String line = "";
        while((line = br.readLine()) != null) {
            sowpod.add(line);
        }
        br.close();
        return sowpod;
    }
    
    
	 
}