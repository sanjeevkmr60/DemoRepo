package com.qa.LiteralsInJava;
/*Literal : Any constant value which can be assigned to the variable is called as literal/constant.
Here 100 is a constant/literal.
        int x = 100;
1.Integral literals:Decimal/octal/Hexa-decimal/Binary
2.Floating-Point literal:
         For Floating-point data types, we can specify literals in only decimal form and we cant specify in octal and Hexa-decimal forms.
3.Char literal:Single/char/Unicode Represenatation
4.String literal:
      Any sequence of characters within double quotes is treated as String literals.
      String s = "Hello";
5.boolean literals:Only two values are allowed for Boolean literals i.e. true and false.
                     boolean b = true;


*/

public class Literal {

    public static void main(String[] args)
    {
        //Integral Literal
        int a = 101; // decimal-form literal
        int b = 0100; // octal-form literal
        int c = 0xFace; // Hexa-decimal form literal
        int d = 0b1111; // Binary literal
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //floating Literal
        float e = (float) 101.230; // decimal-form literal
        float f = (float) 0123.222; // It also acts as decimal literal
        System.out.println(e);
        System.out.println(f);


        //Char literal
        char ch = 'a'; // signle character literl within signle quote
        char b1 = 789; // It is an Integer literal with octal form
        char c1 = '\u0061'; // Unicode representation
        System.out.println(ch);
        System.out.println(b1);
        System.out.println(c1);
        // Escape character literal
        System.out.println("\"  is a symbol");


        String s = "Hello";
        // If we assign without "" then it treats as a variable
        // and causes compiler error
        String s1 = "Hello";
        System.out.println(s);
        System.out.println(s1);

        boolean b2 = true;
        boolean c2 = false;

        int e2 = 1;
        System.out.println(b1);
        System.out.println(c1);

        System.out.println(e2);

    }
}
