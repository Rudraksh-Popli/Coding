public class OperatorPrecedence
{
    public static void main(String[] args)
    {
        // Precedence & Associativity

        // int a = 6*5-34/2;

        /*

        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            = 30-34/2
            = 30-17
            = 13

        */

        // int b = 60/5-34*2;

        /*

            = 12-34*2
            = 12-68
            = -56

        */

        // System.out.println(a);
        // System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        //  int k = x * y/2;

        float b = 0;
        float c = 0;
        float a = 10;
        float k = (b*b - 4*a*c)/(2*a);
        System.out.print(k);
    }
}