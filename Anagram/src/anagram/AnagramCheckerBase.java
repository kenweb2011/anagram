package anagram;

import java.util.List;
import java.util.stream.Collectors;

interface IAnagramChecker
{
    boolean IsAnagram(String source, String target);
    String EchoAnagram(String source, String target);
}

abstract class AnagramCheckerBase implements IAnagramChecker
{  
    public String EchoAnagram(String source, String target)
    {
        return String.format("Is %s anagram of %s? %b",
        		source, target, IsAnagram(source, target));
    }
}

class AnagramCheckerList extends AnagramCheckerBase
{
    public boolean IsAnagram(String source, String target)
    {
    	List<Character> ss = source.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    	List<Character> tt = target.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    	
        for (var i = 0; i < tt.size(); i++)
        {
            var removed = ss.remove(tt.get(i));
            if (!removed) return false;
        }
        return true;
    }   
}

class AnagramCheckerSort extends AnagramCheckerBase
{
    public boolean IsAnagram(String source, String target)
    {
    	List<Character> ss = source.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    	List<Character> tt = target.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    	
    	ss.sort(null);
    	tt.sort(null);
    	
    	return ss.equals(tt);
    }   
}

