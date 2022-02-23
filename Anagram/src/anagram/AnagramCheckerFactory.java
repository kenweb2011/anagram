package anagram;

enum AnagramPlanEnum
{
    List,
    Sort
}

interface IAnagramCheckerFactory
{
    IAnagramChecker Create(AnagramPlanEnum plan);
}

class AnagramCheckerFactory implements IAnagramCheckerFactory
{
    public IAnagramChecker Create(AnagramPlanEnum plan)
    {
        switch (plan)
        {
            case List:
                return new AnagramCheckerList();
            case Sort:
                return new AnagramCheckerSort();
            default:
                return new AnagramCheckerList();
        }
    }
}