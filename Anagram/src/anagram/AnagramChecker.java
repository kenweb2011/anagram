package anagram;

public class AnagramChecker
{
	public static void main(String[] args)
	{
		IAnagramCheckerFactory factory = new AnagramCheckerFactory();
		IAnagramChecker checker;
		
		checker = factory.Create(AnagramPlanEnum.List);
		System.out.println(checker.EchoAnagram("anagram", "nagaram"));
		System.out.println(checker.EchoAnagram("binary", "brainy"));
		System.out.println(checker.EchoAnagram("adobe", "abode"));
		
		checker = factory.Create(AnagramPlanEnum.Sort);
		System.out.println(checker.EchoAnagram("anagram", "nagaram"));
		System.out.println(checker.EchoAnagram("binary", "brainy"));
		System.out.println(checker.EchoAnagram("adobe", "abode"));
	}
}
