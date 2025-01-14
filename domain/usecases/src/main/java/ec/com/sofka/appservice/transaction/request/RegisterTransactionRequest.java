package ec.com.sofka.appservice.transaction.request;

import ec.com.sofka.generics.utils.Request;
import ec.com.sofka.transaction.values.objects.Description;
import ec.com.sofka.utils.enums.TransactionTypes;

import java.math.BigDecimal;

public class RegisterTransactionRequest extends Request {
    private final BigDecimal amount;
    private final TransactionTypes transactionTypes;
    private final String customerId;
    private final String accountNumber;
    private final String description;

    public RegisterTransactionRequest(BigDecimal amount, TransactionTypes transactionTypes, String accountNumber, String customerId, String description){
        super(null);
        this.amount = amount;
        this.transactionTypes = transactionTypes;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionTypes getTransactionTypes() {
        return transactionTypes;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getDescription() {
        return description;
    }
}
