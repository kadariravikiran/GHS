package com.gnanodaya.teacher.service;

import com.gnanodaya.teacher.repository.TeacherRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TeacherServiceTest {
    @Mock TeacherRepository repository;
    @InjectMocks TeacherService service;

    @Test
    void findByIdThrowsWhenMissing() {
        when(repository.findById(999L)).thenReturn(java.util.Optional.empty());
        assertThrows(ResourceNotFoundException.class, () -> service.findById(999L));
    }
}
