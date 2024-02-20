package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {

    @Test
    void bookingServiceTest()
    {
        HotelService mockHotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(mockHotelService);
        when(mockHotelService.isRoomAvailable(102)).thenReturn(true);

        boolean result =   bookingService.bookRoom(102);

        assertThat(result).isTrue();

    }

}