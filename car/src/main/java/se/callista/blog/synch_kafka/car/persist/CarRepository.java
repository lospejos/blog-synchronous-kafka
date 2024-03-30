package se.callista.blog.synch_kafka.car.persist;

import se.callista.blog.synch_kafka.car.model.Car;

public interface CarRepository {

  Car getCar(final String vin);
  void setCar(final String vin, final Car car);
}
