package Constructors;

public class RoadToll_Main {

    public static void main(String[] args) {

        Road_Toll rt1 = new Road_Toll();

        rt1.type = "Sadan";
        rt1.tiresCount = 4;
        rt1.calculateToll();

        Road_Toll rt2 = new Road_Toll("Truck", 6);
        rt2.calculateToll();

    }
}
