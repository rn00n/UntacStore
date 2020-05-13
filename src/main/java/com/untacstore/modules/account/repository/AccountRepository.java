package com.untacstore.modules.account.repository;

import com.untacstore.modules.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String username);
}