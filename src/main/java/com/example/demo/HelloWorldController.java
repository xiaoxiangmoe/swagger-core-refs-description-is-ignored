package com.example.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
public class HelloWorldController {

    @Schema(description = "Transaction account")
    public static class Account {
        @Schema(description = "Account's id")
        @NotNull
        public long id;
        @Schema(description = "Account's name")
        @NotNull
        public String name;
    }

    @Schema(description = "Transaction")
    public static class Transaction {
        @Schema(description = "trade number")
        @NotNull
        public long tradeNO;
        @Schema(description = "total transaction amount")
        @NotNull
        public long totalAmount;
        @Schema(description = "transaction subject")
        @NotNull
        public String subject;

        @Schema(description = "transaction initiator, payer")
        @NotNull
        public Account fromAccount;

        @Schema(description = "transaction receiver, payee")
        @NotNull
        public Account toAccount;
    }

    @GetMapping("/transactions/{id}")
    public Transaction getTransaction(@PathVariable long id) {
        return null;
    }
}
