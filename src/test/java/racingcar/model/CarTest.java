package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @DisplayName("5자 이하의 이름을 가진 자동차를 생성한다.")
    @Test
    public void constructor() {
        //given
        String name = "12345";

        //when
        Car car = new Car(name);

        //then
        assertEquals(name, car.getName());
    }

    @DisplayName("이름이 5자가 넘을경우, IllegalArgumentException 발생")
    @Test
    public void constructor_fail_name_length() {
        //given
        String name = "123456";

        //expect
        assertThatIllegalArgumentException()
            .isThrownBy(() -> new Car(name))
            .withMessage("[ERROR] 자동차의 이름은 5자 이하여야 한다.");
    }

}