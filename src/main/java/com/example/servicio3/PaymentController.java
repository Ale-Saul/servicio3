package com.example.servicio3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping("/processPayment")
    public String processPayment(@RequestBody PaymentRequest paymentRequest) {
        // Simulando lógica simple de pago
        if (paymentRequest.getCardNumber().length() == 16 && paymentRequest.getCvv().length() == 3) {
            return "Pago procesado exitosamente por un monto de: " + paymentRequest.getAmount();
        } else {
            return "Datos de pago inválidos";
        }
    }
}
