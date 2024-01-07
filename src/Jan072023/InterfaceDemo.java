package Jan072023;



interface VechileInterface{
    public int calculateSpeed(); //public abstract
    int a=10; //public static final
}

class Truck implements VechileInterface {
    @Override
    public int calculateSpeed() {
        return 80;
    }
}
class Bus implements VechileInterface{

    @Override
    public int calculateSpeed() {
        return 90;
    }
}

class SportBike implements VechileInterface{
    @Override
    public int calculateSpeed() {
        return 220;
    }
}


class Demo{
    public static void main(String[] args) {
        VechileInterface sb=new SportBike();
        VechileInterface truck=new Truck();
        VechileInterface bus=new Bus();
        System.out.println("Speed of sport bike = "+sb.calculateSpeed());
        System.out.println("Speed of truck  = "+truck.calculateSpeed());
        System.out.println("Speed of bus  = "+bus.calculateSpeed());
    }

}