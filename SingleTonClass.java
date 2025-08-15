class WaterJug{
    private int waterQuantity = 500;
    private static WaterJug object = null;
    private WaterJug(){};
    public int getWater(int quantity){
        waterQuantity-=quantity;
        return quantity;
    }

    public static WaterJug getInstance(){
        if (object == null) {
            object = new WaterJug();
        }
        return object;
    }
}

public class SingleTonClass {
    public static void main(String...Samrudh){

        WaterJug jug = WaterJug.getInstance();
        int water = jug.getWater(5);
        System.out.println(water);
    }
}
