package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

public class ResultView {

    public void printCars(Cars cars) {
        for (Car car : cars.getCars()) {
            printCar(car);
        }
    }

    private void printCar(Car car) {
        String name = car.getName();
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" : ");
        for (int i = 0; i < car.getPosition(); i++) {
            builder.append("-");
        }
        String resultString = builder.toString();
        System.out.println(resultString);
    }

}
