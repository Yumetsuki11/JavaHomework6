import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrService;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Sqr.csv")
    public void testSqrService(int expected, int lowerLimit, int upperLimit) {
        SqrService service = new SqrService();

        int actual = service.sqrCalc(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}
