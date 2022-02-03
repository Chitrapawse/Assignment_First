 /*Q.6] Find the output and write explanation?
class Test {
    public static void main(String[] args) {
        byte b = 127;
        ++b;
        b++;
        System.out.println("Value of variable b : "+b);
    }
}
*/

 package Assignment1;
class Test
{
    public static void main(String[] args)
    {
        byte b = 127;
        ++b;
        b++;
        System.out.println("Value of variable b :"+b);
    }
}
/*
        Output –
        value of variable b: -127.

        Explanation -> The Range of Byte is -128 to 127
        b =127
        when b = ++b
        means b = -128
       then  b = b++
        means b = -128 + 1
        b = -127
        So , Output is -127.


 */