class Demo{
String x;
static{
System.out.println("Hello from static block");
}
public static void main(String args[]){

//int x;
//x=x+1;  //this will be compilation faliure bcz value is not initialized //above

Demo d1 = new Demo();
System.out.println(d1.x);



}
}