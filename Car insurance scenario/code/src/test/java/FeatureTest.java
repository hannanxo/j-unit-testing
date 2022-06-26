import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FeatureTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/input.csv")
    void test(int age, char gender, Boolean married, int points, int expectedOutput){
        Feature f = new Feature();
        int result = f.CarInsurance(age, gender, married, points);
        Assertions.assertEquals(result, expectedOutput);
    }
}