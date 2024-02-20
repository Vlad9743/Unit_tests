package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {

    @Test
    void testDataProcessor()
    {
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);
        when(database.query(anyString())).thenReturn(Arrays.asList("1", "2", "3"));

        List<String> strings =  dataProcessor.processData("select *");

        assertThat(strings)
                .isNotNull()
                .isNotEmpty()
                .hasSize(3)
                .contains("2");

    }

}