public class Operators
{
    public static void main(String[] args)
    {
        // 1. Arithmetic Operators
        int a1 = 4;
        // int b1 = 6-a1;
        // int b1 = 6+a1;
        // int b1 = 6/a1;
        // int b1 = 6*a1;
        int b1 = 6 % a1; // Modulo Operator
        // b1++;
        b1--;
        System.out.println(b1);
        // 4.8 % 1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int b2 = 9;
        // b1 += 3;
        // b1 -= 3;
        // b1 /= 3;
        b2 *= 3;
        System.out.println(b2);

        // 3. Comparison Operators
        System.out.println(64<6);
        System.out.println(64>6);
        System.out.println(64==6);
        System.out.println(64<=6);
        System.out.println(64>=6);
        System.out.println(64!=6);

        // 4. Logical Operators
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.print(2&3);
        //        10
        //        11
        //       ----
        //        10
    }
}