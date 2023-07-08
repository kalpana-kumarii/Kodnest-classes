
class Typecasting{
    public static void main(String []args){
   //boolean to other type conversion
short a=50;
   byte b=(byte)a; //incompatible types: possible lossy conversion from short to byte
   int c=a;
   float d=a;
   long e=a;
   double f=a;
   char g=; //incompatible types: possible lossy conversion from short to char
  // boolean h=(boolean)a; //incompatible types: short cannot be converted to boolean
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println(d);
  System.out.println(e);
  System.out.println(f);
  System.out.println(g);


    }
}