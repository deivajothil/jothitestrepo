public class Constructor_Demo
{
int no1; 
float no2; 
public Constructor_Demo()
{
System.out.println("Hi-- added this for remote changes"); 
}
public Constructor_Demo(int no1, float no2)
{
this.no1 = no1; 
this.no2 = no2; 
}
public static void main(String[] args)
{
Constructor_Demo cd1 = new Constructor_Demo(); 
Constructor_Demo cd2 = new Constructor_Demo(10,2.5f);
System.out.println(cd2.no1);
System.out.println(cd2.no2);
}
}
