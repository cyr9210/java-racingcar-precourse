package racingcar.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputViewTest {

    @DisplayName("콤마로 구분한 문자열 배열을 입력받는다.")
    @Test
    public void inputCarsNames() {
        //given
        InputView inputView = new InputView();
        String input = "최용락,용,락,용락";

        //when
        String[] names = inputView.inputCarsNames(() -> input);

        //then
        assertEquals(4, names.length);
        assertEquals(names[0], "최용락");
        assertEquals(names[1], "용");
        assertEquals(names[2], "락");
        assertEquals(names[3], "용락");
    }

}