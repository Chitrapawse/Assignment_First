/*
        Q.3] Initialize On Object Creation
        i. Create a class Car which contains wheels and model as Instance variables.
        ii. Initialize the number of wheels of the car at the time of creating the Object of the car and assign the model of the car to the model variable and print the model after creating the object of the car class(not at the time of creating the object).
        */
package Assignment1;
class Car
{    int wheels;
    String model="hyundai creta";

    Car(int wheels)
    {
        this.wheels = wheels;
        System.out.println("Wheels of the Car :\t" +wheels);
        System.out.println("Model of the Car:\t"+model);
    }

    public static void main(String[] args)
    {
        Car obj = new Car(4);
    }
}

/*
Wheels of the Car :	4
Model of the Car:	hyundai creta
 */

