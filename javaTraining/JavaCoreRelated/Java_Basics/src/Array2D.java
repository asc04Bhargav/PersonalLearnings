public class Array2D {
    public static void main(String[] args) {
        intArray2D();
    }

    public static void intArray2D(){
        int[][] num= new int[2][2];
        num[0][0]=2;
        num[0][1]=3;
        num[1][0]=4;
        num[1][1]=5;

//        printing 2D array
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
