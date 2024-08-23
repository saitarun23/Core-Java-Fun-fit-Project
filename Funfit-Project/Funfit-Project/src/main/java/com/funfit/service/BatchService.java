package com.funfit.service;

import java.util.List;

import com.funfit.bean.Batch;
import com.funfit.dao.BatchDao;

public class BatchService {
	
	BatchDao bd=new BatchDao();
	
	public String storeBatch(Batch batch) {
		if(batch.getBid()<=0) {
			return "Id >0";
		}
		else if(bd.storeBatch(batch)>0) {
			return "Details  saved";
		}
		else {
		return "Batch Saved Successfully";	
		}
	}
	
	public String deletebatch(int bid) {
		if(bd.deletebatch(bid)>0) {
			return "Batch deleted Successfully";
		}
		else {
			return "Batch not present";
		}
	}
	
	public String updateBatch(Batch batch) {
		if(bd.updateBatch(batch)>0) {
			return "Batch Time updated Successfully";
		}
		else {
			return "Bacth not Present";
		}
	}
	
	public List<Batch> findAllBatch(){
		return bd.findAllBatches();
	}
}
