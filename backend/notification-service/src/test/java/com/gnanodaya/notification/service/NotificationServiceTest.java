package com.gnanodaya.notification.service;

import com.gnanodaya.notification.repository.NotificationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class NotificationServiceTest {
    @Mock NotificationRepository repository;
    @InjectMocks NotificationService service;

    @Test
    void findByIdThrowsWhenMissing() {
        when(repository.findById(999L)).thenReturn(java.util.Optional.empty());
        assertThrows(ResourceNotFoundException.class, () -> service.findById(999L));
    }
}
