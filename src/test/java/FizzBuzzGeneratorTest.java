import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;
public class FizzBuzzGeneratorTest {
    private FizzBuzzGenerator fizzBuzzGenerator;

    @BeforeEach
    void setUp() {
        fizzBuzzGenerator = new FizzBuzzGenerator();
    }

    @ParameterizedTest
    @CsvSource({"3,Fizz", "6,Fizz"})
    void multiplesOfThreeReturnsFizz(int input, String result){
        String fizzBuzz = fizzBuzzGenerator.getFizzBuzz(input);
        assertThat(fizzBuzz).isEqualTo(result);
    }

//    Things to add:
//    @BeforeEach
//    @ParameterizedTest
//    @Test
//    @CsvSource()

}
