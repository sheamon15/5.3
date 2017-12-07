/**
 * @Author:Shea Salloum
 * purpose: to display different car make models and horsepower
 */
public class CarDriver {
    public static void main(String [] args){
        Car myCar = new Car ();

        Car hisCar= new Car("yellow ", 765  , 6.0 , "lambo ");
        Car herCar = new Car ("black ", 876  ,4.0  ,"Ferrari ");

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);


        //call setters
        myCar.setColor("Orange"); myCar.setHorsePower(800);myCar.setEngineSize(8.0);myCar.setMake("Aston Martin");
        myCar.setColor("Orange"); hisCar.setHorsePower(800); hisCar.setEngineSize(8.0);hisCar.setMake("Aston Martin");
        myCar.setColor("Orange"); herCar.setHorsePower(800); herCar.setEngineSize(8.0); herCar.setMake("Aston Martin");

        System.out.println("My Car:" + myCar.getColor() + " " + myCar.getHorsePower()+ " " + myCar.getEngineSize()+" " + myCar.getMake());
        System.out.println(" His Car: " + hisCar.getColor()+" " + hisCar.getHorsePower()+" " + hisCar.getEngineSize()+" " + hisCar.getMake());
        System.out.println (" Her Car: " + herCar.getColor()+" " + herCar.getHorsePower()+ " "+ herCar.getEngineSize()+" " + herCar.getMake());
    }
}
