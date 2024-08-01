package OOPS;

class Plane
{
    public void takeOff(){
        System.out.println("Plane tookOff..");
    }

    public void fly(){
        System.out.println("Plane is flying...");
    }

    public void land(){
        System.out.println("Plane is landing...");
    }
}

class PassengerPlane extends Plane{
    public void takeOff(){
        System.out.println("Passenger-Plane tookOff..");
    }

    public void fly(){
        System.out.println("Passenger-Plane is flying...");
    }

    public void land(){
        System.out.println("Passenger-Plane is landing...");
    }
}

class CargoPlane extends Plane
{
    public void takeOff(){
        System.out.println("Cargo-Plane tookOff..");
    }

    public void fly(){
        System.out.println("Cargo-Plane is flying...");
    }

    public void land(){
        System.out.println("Cargo-Plane is landing...");
    }
}

class FighterPlane extends Plane
{
    public void takeOff(){
        System.out.println("Fighter-Plane tookOff..");
    }

    public void fly(){
        System.out.println("Fighter-Plane is flying...");
    }

    public void land(){
        System.out.println("Fighter-Plane is landing...");
    }
}

class Airport
{
    // True Ploymorphism
  /* Same method call when passed P instance working as PassengerPlane
     Same method call when passed c instance working as CargoPlane
     Same method call when passed f instance working as FighterPlane */
    public void allowPlane(Plane p){
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class mehtodOverriding2 {
    public static void main(String[] args) {
        Plane p = null;

//        p = new PassengerPlane();
//        p.takeOff();
//        p.fly();
//        p.land();
//
//        System.out.println();

//        p = new CargoPlane();
//        p.takeOff();
//        p.fly();
//        p.land();
//
//        System.out.println();

//        p = new FighterPlane();
//        p.takeOff();
//        p.fly();
//        p.land();

        PassengerPlane P = new PassengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport a = new Airport();
        a.allowPlane(P);
        a.allowPlane(c);
        a.allowPlane(f);

        // One more method

        Airport b = new Airport();
        b.allowPlane(new PassengerPlane());
        b.allowPlane(new CargoPlane());
        b.allowPlane(new FighterPlane());
    }
}
