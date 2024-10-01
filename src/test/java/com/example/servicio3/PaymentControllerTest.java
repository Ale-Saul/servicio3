package com.example.servicio3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class PaymentControllerTest {

    private MockMvc mockMvc;

    @Test
    void testProcessPayment() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/processPayment")
                        .contentType("application/json")
                        .content("{\"cardNumber\":\"1234567812345678\",\"cvv\":\"123\",\"expirationDate\":\"12/25\",\"amount\":100.0}"))
                .andExpect(status().isOk());
    }
}