public class AnimalService {
    public static void callSound(Animal a){
//        a.sound();

        if(a instanceof Dog){
            ((Dog)a).bite();
        }
        if (a instanceof Cat){
            ((Cat)a).scrach();
        }
    }
}
