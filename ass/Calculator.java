// Author: SAI SATISH JALADI
public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }// default constructor



   // add

   public void add(int number)
   {
     result += number;

   }// end of add

    // substract

    public void substract(int number)
    {
      result -= number;
    }// end of substract

    // multiply
    public void multiply(int number1, int number2)
    {

        result = number1 * number2;
    }

// divide

   public void divide(int number1, int number2)
   {
      result = number1 / number2;

   }
    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
//declare 2 numbers

	int n1 = 541, n2 =549;
// instantiate an object of type calculator

Calculator Mycalculator = new Calculator();

// add n1

Mycalculator.add(n1);
System.out.println("The result of the calculator(ADD) is " + Mycalculator.getResult());
        
// substract n2


Mycalculator.substract(n2);
System.out.println("The result of the calculator(SUB) is " + Mycalculator.getResult());

//multiply num1 and num2


Mycalculator.multiply(n1,n2);
System.out.println("The result of the calculator(MUL) is " + Mycalculator.getResult());

// display the result
Mycalculator.divide(n1,n2);
System.out.println("The result of the calculator(DIV) is" + Mycalculator.getResult());

    }
}
