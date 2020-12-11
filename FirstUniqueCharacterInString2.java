import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) 
	{
		String input = "lloveleetcode";
		FirstUniqueCharacterInString obj = new FirstUniqueCharacterInString();
		int index = obj.firstUniqChar(input);
		
		System.out.println(index);
	}
	public int firstUniqChar(String s) 
	{
		if(s == null || s.length() == 0)
		{
			return -1;
		}
		Map<Character, Integer> myhashMap = new HashMap<Character, Integer>(); 
		
		for(int i=0 ;i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(myhashMap.containsKey(c))
			{
				myhashMap.put(c, myhashMap.get(c) + 1);
			}
			else
			{
				myhashMap.put(c, 1);
			}
		}
		
		for(int i=0 ;i < s.length(); i++)
		{
			if(myhashMap.get(s.charAt(i)) == 1)
			{
				return i;
			}
		}
		return -1;
    }
}
