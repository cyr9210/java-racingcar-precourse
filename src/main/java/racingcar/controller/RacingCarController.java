package racingcar.controller;

import racingcar.model.Cars;

public class RacingCarController {

    public Cars play(String[] names, int moveCount) {
        Cars cars = new Cars(names);
        for (int i = 0; i < moveCount; i++) {
            cars.move();
        }
        return cars;
    }

}
