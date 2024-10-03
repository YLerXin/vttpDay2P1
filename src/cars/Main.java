package cars;

public class Main {
    public static void main(String[] args){
        //myCar is an instance of car
        Car myCar = new Car();
        myCar.setMake("Toyota");
        myCar.setOwner("Steve");
        myCar.info();

        Car yourCar = new Car();
        yourCar.setMake("BMW");
        yourCar.setOwner("AH");
        yourCar.info();

        Car ourCar = new Car();
        ourCar.setMake("Merc");
        ourCar.setOwner("steve again");
        ourCar.info();

        Car batCar = new Car();
        batCar.setOwner("bruce wayne");
        batCar.info();

        batCar.fuelGuage();
        batCar.go();
        batCar.fuelGuage();
        batCar.go(3,true);
        batCar.fuelGuage();

        //car trailer for 6 cars
        Car[] trailer = new Car[6];
        trailer[0] = myCar;

        



    }
}
