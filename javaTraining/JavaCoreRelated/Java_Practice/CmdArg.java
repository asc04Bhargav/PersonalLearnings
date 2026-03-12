public class CmdArg{

public static void main(String array[]){
if(array.length ==0){
System.out.println("no arguments passed,please re run the app by 2 arguments");
System.exit(0);
}else{
//if we supply non integers from the cmnd line this leads to a NumberFormateException
System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
}
}
}