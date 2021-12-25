package com.developer618.demo.formula1.api;

import com.developer618.demo.formula1.api.endpoints.ConstructorsApi;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class ConstructorsApiIntegrationTest {

    @Mock
    ConstructorsApi constructorsApi;

    @Test
    void something() throws Exception {
        // Arrange
        MockitoAnnotations.openMocks(this);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(constructorsApi).build();

        doCallRealMethod().when(constructorsApi).getAllConstructors();

        // Act
        MvcResult result = mockMvc.perform(get(URI.create("/f1/constructors")).contentType(MediaType.APPLICATION_JSON)).andReturn();

        // Assert
        assertEquals(HttpStatus.NOT_IMPLEMENTED.value(), result.getResponse().getStatus());
    }
}
