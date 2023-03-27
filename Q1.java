public class Calculator {

    private int SumValue;
    private int SubtractValue;
    private int MultiplyValue;
    private int DivideValue;
    
    public int addtion (int num1, int num2) {
        SumValue = num1 + num2;
        return SumValue;
    }
    
    public int subtraction (int num3, int num4) {
        SubtractValue = num3 - num4;
        return SubtractValue;
    }
    
    public int multiplication (int num5, int num6) {
        if (!(num5 == 0 || num6 == 0)) {
            MultiplyValue = num5 * num6;
        }  
        else {
            System.out.println ("Input can not be 0");
        }
        return MultiplyValue;
    }
    
    public int division (int num7, int num8) {
        if (!(num7 == 0 || num8 == 0)) {
            DivideValue = num7 / num8;
        } 
        else {
            System.out.println ("Input can not be 0");
        }
        return DivideValue;
    }
}