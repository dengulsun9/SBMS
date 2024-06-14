package in.dengulsun9.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqldao")
@Primary
public class MySQLDBReportDao implements ReportDao {

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from MySql db..");
	}

}
