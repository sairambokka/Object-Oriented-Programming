package CollectionsDemo;

import java.util.*;
import java.util.Map.Entry;


public class BookDetails2 {

	public static void main(String[] args) {
		
		
		Map<String, Integer> books = new HashMap<>();
		
		
		books.put("DotNet", 3);
		books.put("Java", 4);
		books.put("Selenium", 2);
		
		
		LinkedHashMap<String, Integer> sortedBooks = sortBooksByNum(books);
		
		for(Map.Entry<String, Integer> ent : sortedBooks.entrySet())
		{
			System.out.println(ent.getKey() + " -> "+ ent.getValue());
		}
		
	}
	
	public static LinkedHashMap<String, Integer> sortBooksByNum(Map<String, Integer> books)
	{
		List<Map.Entry<String, Integer>> bookList = new ArrayList<>();
		
		for(Map.Entry<String, Integer> ent : books.entrySet())
		{
			bookList.add(ent);
		}
		
		Collections.sort(bookList, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> b1, Map.Entry<String, Integer> b2) {
				return Integer.compare(b1.getValue(), b2.getValue());
			}
			
		});
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		
		Iterator<Entry<String, Integer>> itr = bookList.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry =  (Map.Entry<String, Integer>) itr.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

}
