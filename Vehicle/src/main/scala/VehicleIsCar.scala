
  class VehicleIsCar {
    val fuelCapacity = 50
    var currentFuel = 50

  //method to refuel the car
    def refuel(): Int = {
      currentFuel = fuelCapacity
      currentFuel
    }
    //method to move the car
    def move(): String = {
      if (currentFuel > 10) {
        currentFuel = currentFuel - 20
        s"car is moving,current Fuel left is  = $currentFuel"
      } else {
        refuel()
        "fuel is exhausted refuled to 50"
      }
    }
  }

