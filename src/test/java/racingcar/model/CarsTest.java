package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    @Test
    public void constructor() {
        //given
        String[] names = new String[]{"최용락", "용", "락", "용락"};

        //when
        Cars cars = new Cars(names);

        //then
        assertEquals(4, cars.size());
    }

}