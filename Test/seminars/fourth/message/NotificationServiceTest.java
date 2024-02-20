package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class notificationServiceTest {

    @Test
    void testNotificationService() {
        MessageService mockMessageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(mockMessageService);

        notificationService.sendNotification("Hi", "Ivan");

        verify(mockMessageService, times(1)).sendMessage("Hi", "Ivan");
    }

}