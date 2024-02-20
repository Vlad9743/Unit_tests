package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class WeatherReporterTest {

    @Test
    void generateReportTest()
    {
        WeatherService mockWeatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(20);

        String str =  weatherReporter.generateReport();

        assertThat(str).isEqualTo("Текущая температура: " + 20 + " градусов.");

    }
}