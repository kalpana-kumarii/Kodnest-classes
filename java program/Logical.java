class Logical{
    public static void main(String []args){
        int a=10;
        int b=40;
        int c=34;
        System.out.println("And operator :"+ (true && true));
        System.out.println("And operator :"+ (true && false));
        System.out.println("OR operator :"+ (true && false));
        System.out.println("OR operator :"+ (false && true));
        System.out.println("NOT operator :"+ (!true));
        System.out.println("And operator :"+ ((a<b)&& (a<c)));

    }
}