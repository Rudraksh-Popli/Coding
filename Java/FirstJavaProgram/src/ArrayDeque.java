public class ArrayDeque
{
    public static void main(String[] args)
    {
        java.util.ArrayDeque<Integer> ad1 = new java.util.ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}