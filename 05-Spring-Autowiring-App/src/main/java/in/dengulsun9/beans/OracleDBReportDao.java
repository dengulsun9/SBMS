package in.dengulsun9.beans;

import org.springframework.stereotype.Repository;

@Repository("oracledao")
public class OracleDBReportDao implements ReportDao{

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from oracle db..");
	}

}
