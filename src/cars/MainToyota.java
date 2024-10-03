package cars;

public class MainToyota {

    public static void main(String[] args){
        Toyota camry = new Toyota();
        camry.info();
        System.out.printf("has GPS: %b",camry.isGPS());

        camry.go(5,true);
        camry.fuelGuage();
        camry.go(7,false);
        camry.fuelGuage();

        Toyota myCar = new Toyota();
        Car newCar = new Car();
        Fiat fiat = new Fiat();

        Carworkshop workshop = new Carworkshop();

        workshop.service(myCar);
        workshop.service(newCar);
        workshop.service(fiat);
    }
    
}
