package ec.com.sofka.gateway;

import ec.com.sofka.account.Account;
import ec.com.sofka.gateway.dto.AccountDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {
    Mono<AccountDTO> findByAccountNumber(String accountNumber);
    Mono<AccountDTO> save(AccountDTO account);
    Mono<AccountDTO> update(AccountDTO account);
    Flux<AccountDTO> findAll();
}
