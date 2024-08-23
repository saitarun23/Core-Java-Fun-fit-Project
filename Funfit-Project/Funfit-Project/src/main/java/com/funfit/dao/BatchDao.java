package com.funfit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public int deletebatch(int bid) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from batch where bid=?");
			pstmt.setInt(1, bid);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int updateBatch(Batch batch) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("update batch set time=? where bid=?");
			pstmt.setString(1, batch.getTime());
			pstmt.setInt(2, batch.getBid());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Batch> findAllBatches(){
		List<Batch> listofbatch=new ArrayList<Batch>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from batch");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Batch b=new Batch();
				b.setBid(rs.getInt(1));
				b.setTypeofbatch(rs.getString(2));
				b.setTime(rs.getString(3));
				listofbatch.add(b);				
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listofbatch;
	}
}
