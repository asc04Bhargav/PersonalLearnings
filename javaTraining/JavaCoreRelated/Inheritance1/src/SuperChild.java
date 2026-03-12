public class SuperChild extends SuperParent{
    int x=20;
    void m1(){
        System.out.println("Inside m1() methpd of super child");

    }
    void m2(){
        System.out.println("Inside m2() method of SuperChild");
        System.out.println("value of x declared in parent class is =" +super.x);
        System.out.println("value of x declared in child class is= "+x);
        System.out.println("now calling m1() method decalred in super class");
        super.m1();
        System.out.println("now calling m1() method declared in sub class");
        m1();
    }
}
