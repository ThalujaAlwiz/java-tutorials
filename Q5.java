public class Calculator {

    private int MultiplyValue;

	public int multiplication (G, H) {
        if (!(G == 0 || H == 0)) {
            MultiplyValue = G * H;
        }  
        else {
            System.out.println ("Input can not be 0");
        }
        return MultiplyValue;
    }
}