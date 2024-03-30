package se.callista.blog.synch_kafka.car.persist;

import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import se.callista.blog.synch_kafka.car.model.Car;

@Repository
public class CarRepositoryImpl implements CarRepository {

  Map<String, Car> cars = new HashMap<>();

  @PostConstruct
  private void initCars() {
    cars.put("12345678901234567", new Car("12345678901234567", "ABC123"));
    cars.put("76543210987654321", new Car("76543210987654321", "ZYX987"));
  }

  @Override
  public Car getCar(final String vin) {
    return cars.get(vin);
  }

  @Override
  public void setCar(final String vin, final Car car) {
    this.cars.put(vin, car);
  }

}
