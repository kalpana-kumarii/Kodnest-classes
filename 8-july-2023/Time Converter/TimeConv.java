public class TimeConv {
public static void main(String []args){

TimeConv time = new TimeConv();
double res=time.convertToHours(90);
System.out.printf("%.1f",res);

}
public static double convertToHours(int minutes){
    double t=minutes/(double)60;
    return t;
}

}
