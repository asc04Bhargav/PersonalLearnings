public class ArrayEX1 {
    public static void main(String[] args) {
        intArray();
        stringArray();
        doubleArray();
        stringArray2();

    }

    public static void intArray(){
        int scores[];
        scores = new int[5];
        scores[0]=3;
        scores[1]=6;
        scores[2]=8;
        scores[3]=9;
        scores[4]=10;
        System.out.print("intArray :");
        for(int i=0; i<5; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }

    public static void stringArray(){
        String names[];
        names = new String[5];
        names[0]="bhargav";
        names[1]="Mani";
        names[2]="Muni";
        names[3]="Kumar";
        names[4]="Veni";
        System.out.print("stringArray :");
        for(int i=0; i<5; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }

    public static void doubleArray(){
        double arears[] = new double[5];
        arears[0]=1.0;
        arears[1]=12.0;
        arears[2]=14.0;
        arears[3]=16.0;
        arears[4]=18.0;

        System.out.print("doubleArray :");
        for(int i=0; i<5; i++){
            System.out.print(arears[i] + " ");
        }
        System.out.println();
    }

    public static void stringArray2(){
        String names[] ={"Angular", "ReactJS","SpringBoot","MySql"};
        System.out.print("stringArray :");
//        for(int i=0; i<5; i++){
//            System.out.print(names[i] + " ");
//        }

//        Enhanced for loop.
        for(String i : names){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
