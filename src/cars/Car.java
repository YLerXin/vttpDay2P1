package cars;

public class Car{
    protected String make;
    protected String owner;
    protected String colour;
    protected int fuel = 100;

    



// This is overloading
    public Car(){ 
        this.colour ="silver";//string is the only primative that can use this otherwise its new String("silver")
        this.make ="toyota";
    }

    public Car(String m){
        this.make = m;
    }

    public Car(String m,String c){
        this.make = m;
        this.colour = c;
    }

    //getters and setters (make property)
    //can use source actions to make getters and setters ctr shift p then search
    public void setMake(String m){
        this.make = m;
    }
    public String getMake() {
        return this.make;
    }

    public void setOwner(String o){
        this.owner = o;
    }
    public String getOwner() {
        return this.owner;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void info(){
        System.out.printf("Make: %s,Owner: %s\n", this.make, this.owner);
    }

    public void go(){
        //this.go(1,false)
        this.fuel--;
    }

    public void go(int distance){
        //this.go(distance,false)
        this.fuel-= distance;
    }

    public void go(int distance, boolean turbo){
        if(turbo){
            this.fuel -=2;
        }
        this.fuel-= distance;

    }

    public void fuelGuage(){
        System.out.printf("Fuel: %d\n", this.fuel);
    }

}




