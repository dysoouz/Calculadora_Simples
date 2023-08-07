package calculadora;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        String texto;

        texto="1 [+] \n2 [-] \n3 [x] \n4 [/] \n5 [pow]  \n6 [sqrt]\nEscolha o tipo de Calculo";
        CalCompleta calculadora = new CalCompleta();
        calculadora.tipoCalculo=Integer.parseInt(JOptionPane.showInputDialog(texto));

        switch(calculadora.tipoCalculo){
            case 6:
                calculadora.number2=Double.parseDouble(JOptionPane.showInputDialog("sqrt "));
                JOptionPane.showMessageDialog(null, calculadora, "_CALCULADORA_", 3);
                break;
            default:
                
                calculadora.number1=Double.parseDouble(JOptionPane.showInputDialog(String.format("%s", calculadora.getTipo()))); 
                calculadora.number2=Double.parseDouble(JOptionPane.showInputDialog(String.format("%.0f %s ",calculadora.number1, calculadora.getTipo())));   
                
                JOptionPane.showMessageDialog(null, calculadora, "_CALCULADORA_", 2);
                break;
        }  
    }    
}
