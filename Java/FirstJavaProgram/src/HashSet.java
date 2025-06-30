public class HashSet
{
    public static void main(String[] args)
    {
        java.util.HashSet<Integer> myHashSet = new java.util.HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}