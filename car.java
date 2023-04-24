// Parent class
class Vehicle {
  protected String brand = "Unknown";
  public void honk() {
    System.out.println("Beep beep!");
  }
}

// Child class (inherits from Vehicle)
class Car extends Vehicle {
  private String model = "Unknown";
  public void setModel(String model) {
    this.model = model;
  }
  public void display() {
    System.out.println("This is a " + brand + " " + model);
  }
}

// Main class
class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.brand = "Ford"; // inherited from Vehicle
    myCar.setModel("Mustang");
    myCar.display(); // calls method in Car class
    myCar.honk(); // calls method in Vehicle class
  }
}
