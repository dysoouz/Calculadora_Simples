package calculadora;
public abstract class Calculadora {
    //atributos
    protected double number1,number2;
    protected int tipoCalculo;

    //métodos
    public Calculadora(){}
    
    public Calculadora(double number1, double number2,int tipoCalculo){
        this.number1=number1;
        this.number2=number2;
        this.tipoCalculo=tipoCalculo;
    }

    public int getTipoCalculo() {
        return tipoCalculo;
    }

    public void setTipoCalculo(int tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    public double getCalculo(){
        switch(tipoCalculo){ 
            case 1:
                return number1 + number2;
               
            case 2:
               return number1 - number2; 
              
            case 3:
                return number1 * number2;
               
            case 4:
                return number1 / number2;
            default:
                 return 0;
        }     
    }
    
    public String getTipo(){
        switch(tipoCalculo){ 
            case 1:
                return "+";
               
            case 2:
               return "-"; 
              
            case 3:
                return "x";
               
            case 4:
                return "/";
                
            case 5:
                return "^";
                
            case 6:
                return "sqrt";
                        
            default:
                break;
        }
        return null;   
    }
}
