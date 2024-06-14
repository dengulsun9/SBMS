package in.dengulsun9.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable{

	private String accType;
	private Long accNum;
}
