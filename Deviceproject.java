
package deviceproject;

import java.util.List;
import java.util.ArrayList;

abstract class Device{
private String brand;

public Device(String brand){
this.brand = brand;
}
public String getBrand(){
return brand;
}
public abstract void turnOn();
}
class Phone extends Device{
public Phone(String brand){
super(brand);
}
@Override
public void turnOn(){
System.out.println("phone brand: "+ getBrand());
}
}

class Laptop extends Device{
public Laptop(String brand){
super(brand);
}
@Override
public void turnOn(){
System.out.println("Laptop brand: "+ getBrand());
}
}
public class Deviceproject {
public static void addLaptopToList(List<? super Laptop> list){
list.add(new Laptop("Hp"));
} 
    
    public static void main(String[] args) {
    
   List<Device> deviceList = new ArrayList<>();
   
   deviceList.add(new Phone("Apple"));
   
   addLaptopToList(deviceList);
   for (Device device : deviceList){
device.turnOn();
   }
    }}
