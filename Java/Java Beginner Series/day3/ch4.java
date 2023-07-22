//Operators in Java

public class ch4{
    public static void main(String[] args) {
        
    }
}

//Java Operators
 
//Java has different types of operators for different operations. They are as follows:

//Arithmetic operators: Arithmetic operators are used to perform arithmetic/mathematical operations.

//Name            Operator            Example
//Addition           +                 a+b
//Subtraction        -                 a-b
//Multiplication     *                 a*b
//Division           /                 a/b
//Modulus            %                 a%b
//Increment          ++              a++ or b++
//Decrement          --              a-- or b--
 
//Assignment operators: These operators are used to assign values to variables.

//Name                            Operator            Evaluated As
//Assignment                         =                     a=b
//Addition assignment                +=               a+=b    or    a=a+b
//Subtraction assignment             -=               a-=b    or    a=a-b
//Multiplication assignment          *=               a*=b    or    a=a*b
//Division assignment                /=               a//=b    or    a=a//b
//Modulus assignment                 %=               a%=b    or    a=a%b
//Bitwise AND assignment             &=               a&=b    or    a=a&b
//Bitwise inclusive OR assignment    |=               a|=b    or    a=a|b
//Bitwise exclusive OR assignment    ^=               a^=b    or    a=a^b
//Right Shift assignment             >>=              a>>=b    or    a=a>>b
//Left Shift assignment              <<=              a<<=b    or    a=a<<b
 
//Bitwise operators: Bitwise operators are used to deal with binary operations.

//Name                    Operator                Example
//Bitwise AND                 &                     a & b
//Bitwise OR                  |                     a | b
//Bitwise NOT                 ~                      ~a
//Bitwise XOR                 ^                     a ^ b
//Bitwise right shift         >>                     a>>
//Bitwise left shift          <<                     b<<
//Unsigned right shift        >>>                    a>>>
 
//Comparison operators: These operators are used to compare values.

//Name                    Operator                  Example
//Equal                      ==                       a==b
//Not Equal                  !=                       a!=b
//Less Than                   <                       a>b
//Greater Than                >                       a<b
//Less Than or Equal to       <=                      a>=b
//Greater Than or Equal to    >=                      a<=b
 
//Logical operators: These operators are used to deal with logical operations.

//Name                   Operator                    Example
//AND                      &&                         a && b
//OR                       ||                         a || b
//NOT                       !                     ! (a=2 or b=3)
 
//Other operators:

//1) instanceof operator: This operator checks if an object is an instance of class.

//Example:
class Main {
    public static void main(String[] args) {
  
        Integer number = 5;
        boolean res;
    
        if (res = number instanceof Integer){
            System.out.println("number is an object of Integer. Hence: " + res);
        } else {
            System.out.println("number is not an object of Integer.Hence: " + res);
        }
    }
}
//Output: number is an object of Integer. Hence: true
 
//2) conditional operator: It is used in a single line if-else statement.

//Example:
class Main2 {
    public static void main(String[] args) {
  
        Integer number = 3;
        String res;
    
        res = (number > 5) ? "number greater than five" : "number lesser than five";
        System.out.println(res);
    }
}
//Output: number lesser than five