package com.example.collection;

import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args) {
//        integerArrayListExample();
//        stringArrayListExample();
        prodArrayListExample();
//        intTreeSetExample();
//        prodTreeSetExample();
//        prodHashSetExample();
    }

    public static void prodTreeSetExample(){
        Set<Product> prodSet = new TreeSet<Product>();

        prodSet.add(new Product(1, "Samsung",26000));
        prodSet.add(new Product(2,"Xiami",32000));
        prodSet.add(new Product(3, "Realme",32000));

    }

    public static void prodHashSetExample(){
        Set<Product> prodSet = new HashSet<Product>();

        prodSet.add(new Product(1, "Samsung",26000));
        prodSet.add(new Product(2,"Xiami",32000));
        prodSet.add(new Product(3, "Realme",32000));

//        System.out.println(prodSet.contains(new Product(2,"Xiami",32000)));
//        System.out.println(prodSet.remove((new Product(3,"Realme",32000))));

    }

    public static void integerArrayListExample(){
//        List intList = new ArrayList();  non-generics old version.

        List<Integer> intList1 = new Vector<Integer>();

        intList1.add(34);
        intList1.add(50);
        intList1.add(56);
        intList1.add(32);
        Collections.sort(intList1);
        System.out.println(intList1);


//        for(Integer temp: intList1){
//            if (temp==32){
//                intList1.remove(temp);
//            }
//        }


//        Iterator<Integer> itr = intList1.iterator();
//        System.out.println("Traversing through the legacy way..");
//        while(itr.hasNext()){
//            Integer temp = itr.next();
//            System.out.print(temp +" ");
//        }
//
//        intList1.forEach(System.out::println);





//        System.out.println("intList1.size() == "+ intList1.size());
//        System.out.println("intList1.contains(34) == "+ intList1.contains(34));
//        System.out.println("intList1.contains(10) == "+ intList1.contains(10));
//        System.out.println("intList1.remove(Integer.value(10)) ==> "+ intList1.remove(Integer.valueOf(10)));
//        System.out.println("intList1.remove(Integer.value(34)) ==> "+ intList1.remove(Integer.valueOf(34)));
//        System.out.println("clearing List...");
//        intList1.clear();
//        System.out.println(intList1);


    }

    public static void intTreeSetExample(){
        Set<Integer> intSet = new TreeSet<Integer>();
        intSet.add(1234);
        intSet.add(35);
        intSet.add(2);
        intSet.add(1);

//        System.out.println(intSet);

    }

    public static void stringArrayListExample(){
        List<String> stringList = new ArrayList<String>();

        stringList.add("bhargav");
        stringList.add("mani");
        stringList.add("veni");

//        System.out.println("traversing using enhanced for loop");
//
//        for(String temp: stringList){
//            System.out.println(temp);
//        }


//        System.out.println("Traversing in a legacy way..");
//
//        Iterator<String> itr1 = stringList.iterator();
//
//        while(itr1.hasNext()){
//            String temp = itr1.next();
//            System.out.println("length of "+temp + " is "+ temp.length());
//        }

//        System.out.println("intList1.size() == "+ stringList.size());
//        System.out.println("intList1.contains(34) == "+ stringList.contains(34));
//        System.out.println("intList1.contains(10) == "+ stringList.contains(10));
//        System.out.println("intList1.remove(Integer.value(10)) ==> "+ stringList.remove(Integer.valueOf(10)));
//        System.out.println("intList1.remove(Integer.value(34)) ==> "+ stringList.remove(Integer.valueOf(34)));
//        System.out.println("clearing List...");
//        stringList.clear();
//        System.out.println(stringList);

    }

    public static void prodArrayListExample(){
        List<Product> prodObj = new ArrayList<Product>();
        Product p1= new Product();
        p1.setProdCode(1);
        p1.setProdName("Samsung");
        p1.setPrice(30000);

        Product p2 = new Product();
        p2.setProdCode(2);
        p2.setProdName("iPhone");
        p2.setPrice(40000);

        Product p3 =new Product(3,"Realme",25000);

        prodObj.add(p2);
        prodObj.add(p1);
        prodObj.add(p3);

        Collections.sort(prodObj);
        Collections.sort(prodObj,new ProdNameComparator());
        for(Product temp: prodObj){
            System.out.println(temp.getProdCode()+ " "+ temp.getProdName());
        }



//        System.out.println("using enhanced loop");
//        for(Product temp: prodObj){
//            System.out.println("price of "+ temp.getProdName() +" after discount :"+ (temp.getPrice()-(temp.getPrice()*0.10)));
//
//        }

//        Iterator<Product> itr1 = prodObj.iterator();
//
//        while (itr1.hasNext()){
//            Product temp = itr1.next();
////            System.out.println(temp);
//
//            if (temp.getPrice()> 500 ){
//                System.out.println("price of "+ temp.getProdName() +" after discount :"+ (temp.getPrice()-(temp.getPrice()*0.10)));
//            }else {
//                System.out.println("price of "+ temp.getProdName() +" after discount :"+ (temp.getPrice()-(temp.getPrice()*0.05)));
//            }
//        }


//        System.out.println("This is using Index: "+prodObj.get(0));
//        System.out.println("Remove using index: "+ prodObj.remove(prodObj.size() - 1));

//        System.out.println(prodObj);
//        System.out.println("Contains = "+prodObj.contains(p1));
//        System.out.println("remove = "+prodObj.remove(p3));

    }
    public static void ArrayListExample(){

    }


}
