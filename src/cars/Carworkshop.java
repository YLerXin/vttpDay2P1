package cars;

public class Carworkshop {

    public void service(Toyota toyota){
        System.out.println("Its a me a Toyota");
    }

    public void service(Car car){
        if (car instanceof Fiat){
            System.out.println("Its a Fiat");
        }
        else{
            System.out.println("Car is serviced");
    }

    }
}
