import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Anagram 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Anagram anagram1 = new Anagram();
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> lists = anagram.groupAnagrams(strs);
		
		for (List<String> list : lists) 
		{
			System.out.print("[");
            for (String item : list) 
            { 
                System.out.print(item + " "); 
            } 
            System.out.print("]");
        } 
	}
	
	public List<List<String>> groupAnagrams(String[] strs) 
	{
		if(strs.length == 0) return new ArrayList();
        Hashtable<String, ArrayList<String>> table = new Hashtable<String, ArrayList<String>>();
	    
		for(String str : strs)
		{
			char[] letters = str.toCharArray();
			Arrays.sort(letters);
			String key = String.valueOf(letters);
			if(!table.containsKey(key)) 
			{
				table.put(key, new ArrayList<String>());
			}
			table.get(key).add(str);
		}
	   return new ArrayList(table.values());	
	 }
}
