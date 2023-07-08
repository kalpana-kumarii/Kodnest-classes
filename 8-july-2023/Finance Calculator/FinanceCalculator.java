public class FinanceCalculator {
public static void main(String []args){

FinanceCalculator calculator = new FinanceCalculator();
double res=calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
System.out.printf("%.2f",res);

}
public double calculateSimpleInterest(double principal, double rate, double time){
    return principal*rate*time;

}

}
