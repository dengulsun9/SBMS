package in.dengulsun9;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.dengulsun9.entity.Account;
import in.dengulsun9.entity.AccountPK;
import in.dengulsun9.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ct= SpringApplication.run(Application.class, args);
		
		AccountRepo repo = ct.getBean(AccountRepo.class);
		
		//setting composite keys values
		AccountPK pk=new AccountPK();
		pk.setAccNum((long) 1212121212);
		pk.setAccType("Savings");
		
		//setting entity data
		Account ac=new Account();
		ac.setHolderName("Gulsan");
		ac.setBranch("Ameerpet");
		ac.setAccountPK(pk);
		
		
		repo.save(ac);
		
		System.out.println("Record Saved...");
		
//		Optional<Account> bi = repo.findById(pk);
//		System.out.println(bi.get());
	}

}
