import java.util.*;
import java.lang.*;
class Q5{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<Dealer> my_list = new ArrayList<Dealer>();
        for(int i = 0; i < n; i++){
            String ip = sc.nextLine();
            String[] str = ip.split("\\s+");
            Car car_obj = new Car(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            my_list.add(new Dealer(str[4], Double.parseDouble(str[5]), car_obj));
        }
        for(Dealer d: my_list){
            System.out.println(d.car.getModelName()+" "+d.car.totalPrice()+" "+d.onRoadPrice());
        }
    }
    public static class Car{
        String modelName;
        String engineNo;
        Integer basePrice;
        Integer additionalCharge;
        public Car(String modelName, String engineNo, Integer basePrice, Integer additionalCharge){
            this.modelName = modelName;
            this.engineNo = engineNo;
            this.basePrice = basePrice;
            this.additionalCharge = additionalCharge;
        }
        public Integer totalPrice(){
            return this.basePrice + this.additionalCharge;
        }
        public String getModelName(){
            return this.modelName;
        }
    }
    public static class Dealer{
        String dealerName;
        double discountPercentage;
        Car car;
        public Dealer(String dealerName, double discountPercentage, Car car){
            this.dealerName = dealerName;
            this.discountPercentage = discountPercentage;
            this.car = car;
        }
        public double onRoadPrice(){
            return (this.car.totalPrice() - (this.car.totalPrice()*this.discountPercentage/100));
        }
    }
}