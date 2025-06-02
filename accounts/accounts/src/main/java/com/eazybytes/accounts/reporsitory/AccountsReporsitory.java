package com.eazybytes.accounts.reporsitory;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsReporsitory extends JpaRepository<Accounts, Long> {
}
