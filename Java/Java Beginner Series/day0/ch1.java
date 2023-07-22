// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class ch1 { //this is a class in java #Point to note keep this class name same as your file name
//In the above program the line public class main
// is a line that design a public class named main
//this class can be used anywhere in the program at any point as it is public/global
//the public keyword set the data to global

public static void main(String[] args){ //this is a function in java
    //In line public static void main(args)
    //the word static here helps to use a function outside it's class without affecting it's orginal class file
    //Ex --> We create a class of HouseHoldWork with all the function of works one such as making tea.
    // Using static keyword we can use the following tea making function even outside the class without importing the class
    //Void refers to the type of output the program gonna return null
    //We can use int instead of void when expecting an integer output

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}

//Identifiers -->
// In java the name of function and classes is done by two different methods ->
    //1) PascalNamingConvention
    //2) camelNameingConvention

//The functions are named using camelNamingConvention --> ex. -> patternPrintingFunction
//and the Classes are named using PascalNamingConvention --> ex. -> HouseHoldWorkClass


//Anatomy of a Java Program
//1)Documentation Section --> In this section we mention what's the purpose of our program, what is does, date of programming and the name of the author and etc
//2)Package Statement --> In this state we declare the package in which our class belongs
//3)Import Statement --> If we want to take input from the user we use inport statement
//4)Interface Statement -->
//5)Class Definitions --> Java in an Object-Oriented Programming language hence for every program that we write has to be within a class only.
//6)Main Method Definitions --> The main method definitions are the entry point of java program execution hence it's mandatory to write main method definitions.

//Variables --> Variable can be understood as containers that hold on given data
//There are some rules to name a variables such as -->
//Must not begin with a digit
//Name is Case Sensitive
//Should not be a keyword
//White Space not allowed
//Can contains alphanumeric and special characters only in the name begins with alphabet
//If more than one word name is being used camelNamingConvention can be used or words can be seperated using _ instead of white spaces.

//Data Types in Java --> Data types refers to especific types of value that we use during programming like intergers,decimals etc

//In order to choose the data type we first need to find the type of data we want to store.After that we need ti analyze the min & max value we might use.
//1)Primitive Data Types and 2)Non-Primitive Data Types
//Primitive Data Types (Intrinsic) --> Java is statically typed hence variable must be declared before using.There are 8 primitive data types -->
                            //byte ->   //value ranges from -(2⁸)/2 to (2⁸)/2 -1
                                        //takes 1 byte = 8 bits
                                        //default value is 0
                            //short ->  //value ranges from -(2¹⁶)/2 to (2¹⁶)/2 -1
                                        //take 2 bytes = 16 bits
                                        //default value is 0
                            //integer-> //value ranges from -(2³²)/2 to (2³²)/2 -1
                                        //take 4 bytes = 32 bits
                                        //default value is 0
                            //float ->  //value ranges from beyond the scope of discussion
                                        //take 4 bytes = 32 bits
                                        //default value is 0.0
                            //long -->  //value ranges from -(2⁶⁴)/2 to (2⁶⁴)/2 -1
                                        //take 8 bytes = 64 bits
                                        //default value is 0
                            //double -> //value ranges from beyond the scope of discussion
                                        //take 8 bytes = 64 bits
                                        //default value is 0.0
                            //char ->   //value ranges from 0 to 65535 i.e (2¹⁶-1) {as it does not contains negative value hence it's not being divided by 2}
                                        //takes 2 bytes = 16 bits --> because it supports unicode
                                        //default value is '\U0000' --> Unicode is a subset of AsCII characters
                            //bool ->   //value can be True or False
                                        //size depends on JVM
                                        //default value is false

//Non-Primitive Data Types (Derived) -->y