// HalveIt

public class HalveIt {
public static void main(String []args){

HalveIt hv = new HalveIt();
double res=hv.halveTheNumber(150);
System.out.printf("%.1f",res);

}
public static double halveTheNumber(double num){
    return num/(double)2;
}

}
