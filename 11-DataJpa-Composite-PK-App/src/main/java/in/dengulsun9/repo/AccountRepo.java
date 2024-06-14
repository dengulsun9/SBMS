package in.dengulsun9.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dengulsun9.entity.Account;
import in.dengulsun9.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK>{

}
