package in.dengulsun9.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="account_tbl")
public class Account {
	
	private String holderName,branch;
	
	@EmbeddedId
	private AccountPK accountPK;
	
}
