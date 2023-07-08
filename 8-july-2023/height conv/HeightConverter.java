public class HeightConverter {
public static void main(String []args){
    
HeightConverter converter = new HeightConverter();
double res=converter.convertInchesToFeet(72.0);
System.out.printf("%.2f",res);
}
public double convertInchesToFeet(double inches){
    double res= inches/12;

    return res;
}

}
