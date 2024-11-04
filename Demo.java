public class Demo {

    public static void main(String[] args) {

        Circle C1 = new Circle();
        System.out.println(C1.toString());
        Circle C2 = new Circle();
        System.out.println(C2);
        Circle C3 = new Circle(5,"blue");
        System.out.println(C3);

        Circle C4 = new Circle(C3);
        System.out.println(C4);
       

//        C1.setRadius(4);

    //    System.out.println(C1.getRadius());
      //   System.out.println(C2.getRadius());
        //  System.out.println(C3.getRadius());

        //  C1.display();
          //C2.display();
          //C3.display();
          //C4.display();
        // Circle.displayStaticData();
        
       //  System.out.println(C1.Area());
         //System.out.println(C2.Area());
         //System.out.println(C3.Area());

      //   double A = C1.Area();



    }
    
}
