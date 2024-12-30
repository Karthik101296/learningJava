public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        System.out.println("Arithmetic Operators ------");

        //+ (Addition): Adds two values together.
        int sum = 4 + 2; // Sum = 8
        System.out.println("sum = "+ sum);

        //- (Subtraction): Subtracts one value from another.
        int difference = 10 - 4; // difference = 6
        System.out.println("difference = "+ difference);

        //* (Multiplication): Multiplies two values.
        int product = 7 * 3; // product = 21
        System.out.println("product = "+ product);

        // (Division): Divides one value by another. If both operands are integers, the result is an integer (fractional part is discarded).
        int quotient = 20 / 5; // quotient = 4
        double quotient2 = 20.0 / 3.0; // quotient2 ≈ 6.6667
        System.out.println("quotient = "+ quotient);
        System.out.println("quotient2 = "+ quotient2);

        //% (Modulus): Returns the remainder of the division.
        int remainder = 10 % 3; // remainder = 1
        System.out.println("remainder = "+ remainder + "\n");

        //Assignment Operators
        System.out.println("Assignment Operators ------");

        //=: Assigns the value on the right to the variable on the left.
        int a = 10; // Assigns 10 to a

        // +=: Adds the value on the right to the variable on the left and assigns the result to the variable.
        int b = 5;
        b += 3; // Equivalent to b = b + 3; b = 8

        // -=: Subtracts the value on the right from the variable on the left and assigns the result to the variable.
        int c = 7;
        c -= 2; // Equivalent to c = c - 2; c = 5

        //*=: Multiplies the variable on the left by the value on the right and assigns the result to the variable.
        int d = 4;
        d *= 3; // Equivalent to d = d * 3; d = 12

        // /=: Divides the variable on the left by the value on the right and assigns the result to the variable.
        int e = 20;
        e /= 4; // Equivalent to e = e / 4; e = 5

        //%=: Takes the modulus of the variable on the left with the value on the right and assigns the result to the variable.
        int f = 10;
        f %= 3; // Equivalent to f = f % 3; f = 1

        System.out.println("a = " + a + "\n" + "b = " + b + "\n" + "c = " + c + "\n" + "d = " + d + "\n" + "e = " + e + "\n" + "f = " + f + "\n");

        //Comparison Operators
        System.out.println("Comparison Operators ------");

        // == (Equal to): Checks if two values are equal.
        boolean isEqual = (5 == 5); // isEqual = true
        boolean isEqual1 = (5 == 6); // isEqual = false

        // != (Not equal to): Checks if two values are not equal.
        boolean isNotEqual = (5 != 3); // isNotEqual = true

        // (Greater than): Checks if the value on the left is greater than the value on the right.
        boolean isGreater = (10 > 5); // isGreater = true

        // < (Less than): Checks if the value on the left is less than the value on the right.
        boolean isLess = (3 < 7); // isLess = true

        // >= (Greater than or equal to): Checks if the value on the left is greater than or equal to the value on the right.
        boolean isGreaterOrEqual = (8 >= 8); // isGreaterOrEqual = true

        // <= (Less than or equal to): Checks if the value on the left is less than or equal to the value on the right.
        boolean isLessOrEqual = (6 <= 9); // isLessOrEqual = true

        System.out.println("isEqual : " + isEqual + "\n" + "isEqual1 5==6 : " + isEqual1 + "\n" + "isNotEqual : " + isNotEqual + "\n" + "isGreater than : " + isGreater + "\n" + "isLess than : " + isLess + "\n" + "isGreaterOrEqual to : " + isGreaterOrEqual + "\n" + "isLessOrEqual to : " + isLessOrEqual + "\n");

        //Logical Operators
        System.out.println("Logical Operators ------");

        // && (Logical AND): Returns true if both operands are true.
        boolean resultAnd = (5 > 3) && (8 > 6); // result = true

        // || (Logical OR): Returns true if at least one of the operands is true.
        boolean resultOr = (5 < 3) || (8 > 6); // result = true

        // ! (Logical NOT): Reverses the result of the boolean expression.
        boolean resultNot = !(5 > 3); // result = false

        System.out.println("resultAnd : " + resultAnd + "\n" + "resultOr : " + resultOr + "\n" + "resultNot : " + resultNot + "\n");

        //Increment and Decrement Operators
        System.out.println("Increment and Decrement Operators ------");

        //prefix
        int p = 5;
        int q = ++p; 
        System.out.println("prefix q - " + q );

        //postfix
        int r = 5;
        int s = ++r; 
        System.out.println("postfix s - " + s );

    }
}
