package racingcar.model;

public class Car {

    private final String name;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차의 이름은 5자 이하여야 한다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
