//Main Class
public class Ass1{
    public static void main(String[] args){
      
        //creating objects in main class 
        Vehicle obj1=new Vehicle("Activa",2);
        Vehicle obj2=new  Vehicle("Toyota",4);      
        obj1.DisplayVehicleDetails();
        obj2.DisplayVehicleDetails();
        int result=obj1.Add(12, 15);
        System.out.println("The result is "+result);    
    }
      
    
    
}

// A class in Java is a blue print for creating objects. IT defines properties and behavious of Object
class Vehicle{
    //Properties of a class 
     String brand;
     int wheel;
    //Assigning values to the properties    
    public Vehicle(String brand,int wheel) {
        this.brand=brand;
        this.wheel=wheel;
    }
     //A method is set of instructions that can be used  again and again when called by its name there by reducing its  lines and redundancy in a program.
    //Method example (definition)
    public int Add(int a,int b){
            return a+b;
    
    }
    //displaying the values 
    public void  DisplayVehicleDetails(){
        System.out.println("This vehicle is a "+this.wheel+" wheeler of company "+this.brand);
    }     
}

