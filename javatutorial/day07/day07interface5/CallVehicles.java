package javatutorial.day07.day07interface5;

import java.util.ArrayList;

public class CallVehicles {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Airplane());

        for( Vehicle v : vehicles){
            v.move();
            if(v instanceof Airplane){
                ((Airplane) v).fly();
            }
        }
    }
}
