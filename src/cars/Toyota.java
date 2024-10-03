package cars;

public class Toyota extends Car {

    private boolean gps = false;
    
    public Toyota(){
        setMake("Toyota");
    }
    public boolean isGPS(){return gps;}

    public void setGPS(boolean gps){this.gps = gps;}
    //overriding
    @Override
    public void go(int d, boolean t){
        this.fuel -= d;
    }
}
