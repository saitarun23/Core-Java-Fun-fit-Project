package com.funfit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.funfit.bean.Batch;
import com.funfit.resource.DbResource;

public class BatchDao {
	
	public int storeBatch(Batch batch) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into batch values(?,?,?)");
			pstmt.setInt(1, batch.getBid());
			pstmt.setString(2, batch.getTypeofbatch());
			pstmt.setString(3, batch.getTime());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}

}
