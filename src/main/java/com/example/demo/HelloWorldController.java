package com.example.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;


@RestController
public class HelloWorldController {

    @Schema(description = "Transaction account", requiredMode = REQUIRED)
    public static class Account {
        @Schema(description = "Account's id", requiredMode = REQUIRED)
        public long id;
        @Schema(description = "Account's name", requiredMode = REQUIRED)
        public String name;
    }

    @Schema(description = "Transaction")
    public static class Transaction {
        @Schema(description = "trade number", requiredMode = REQUIRED)
        public long tradeNO;
        @Schema(description = "total transaction amount", requiredMode = REQUIRED)
        public long totalAmount;
        @Schema(description = "transaction subject", requiredMode = REQUIRED)
        public String subject;

        @Schema(description = "transaction initiator, payer", requiredMode = REQUIRED)
        public Account fromAccount;

        @Schema(description = "transaction receiver, payee", requiredMode = REQUIRED)
        public Account toAccount;
    }

    @GetMapping("/transactions/{id}")
    public Transaction getTransaction(@PathVariable long id) {
        return null;
    }
}
