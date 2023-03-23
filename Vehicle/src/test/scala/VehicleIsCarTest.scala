import org.scalatest.funsuite.AnyFunSuite

class VehicleIsCarTest extends AnyFunSuite{

  test ("Test case 1"){
    /*
    if car is moving three times it returns car is moving,current Fuel left is  = 30
     */
    val car = new VehicleIsCar()
    car.move()
    car.move()
    car.move()
    val expectedValue ="car is moving,current Fuel left is  = 30"
    val actualValue =car.move()
    assert(expectedValue==actualValue)
  }

  test("Test case 2") {
    /*
    if car is moving two times it returns fuel is exhausted refuled to 50
     */
    val car = new VehicleIsCar()
    car.move()
    car.move()
    val expectedValue = "fuel is exhausted refuled to 50"
    val actualValue = car.move()
    assert(expectedValue == actualValue)
  }

}
