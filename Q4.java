public class Calculator {

    private int DivideValue;

	public int division (E, F) {
        if (!(E == 0 || F == 0)) {
            DivideValue = E / F;
        } 
        else {
            System.out.println ("Input can not be 0");
        }
        return DivideValue;
    }
}