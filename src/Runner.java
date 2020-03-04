public class Runner {
    public static void main(String[]args){
        Car myCar = new Car( 2016, "Mercedes" , "Mustang");
        System.out.println(myCar.toString());
        myCar.drive(1000);
        System.out.println(myCar.toString());

        Rectangle myRectangle= new Rectangle(300,788);
        System.out.println(myRectangle.printrecInfo() );
        Rectangle mySquare= new Rectangle(60,60);
        System.out.println(mySquare.printrecInfo() );


    }

}