package calculadora;
public final class CalCompleta extends Calculadora{
    //atributos
    //métodos
    public CalCompleta(){}
    public CalCompleta(double number1, double number2, int tipoCalculo) {
        super(number1, number2, tipoCalculo);
    }

    public double getComplemento(){ 
        switch(tipoCalculo){ 
            case 5:
                return Math.pow(number1, number2);
            case 6:
                return Math.sqrt(number2);  
            default:
                return getCalculo();
        }
    }
    
    @Override
    public String toString(){ 
        return String.format("%.0f %s %.0f = %.1f", number1,getTipo(),number2,getComplemento());
    }
}
