package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingCarController racingCarController = new RacingCarController();

        String[] names = inputView.inputCarsNames();
        int moveCount = inputView.inputCarsMoveCount();
        Cars cars = racingCarController.play(names, moveCount);
        resultView.printCars(cars);
    }

}
