package racingcar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarViewTest {

    @Test
    void parseCarNameTest(){
        String text = "hendo,brody,summer";
        ArrayList<String> nameList = CarView.parseCarName(text);
        assertThat(nameList).contains("hendo").contains("brody").contains("summer");
    }

    @Test
    void validateCarNameTest(){
        assertThatThrownBy(() -> {
            String text = "hendooo,brody,summer";
            ArrayList<String> nameList = CarView.parseCarName(text);
            CarView.validateCarName(nameList);
        });
    }

}