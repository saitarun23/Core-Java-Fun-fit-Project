package com.funfit.service;

import com.funfit.bean.Batch;
import com.funfit.dao.BatchDao;

public class BatchService {
	
	BatchDao bd=new BatchDao();
	
	public String storeBatch(Batch batch) {
		if(batch.getBid()<0) {
			return "Batch ID must be a positive number";
		}
		else if(batch.getTypeofbatch().isEmpty() || batch.getTypeofbatch()==null) {
			return "Type of batch cannot be null or empty";
			
		}
		else if(!batch.getTypeofbatch().equalsIgnoreCase("morning") && !batch.getTypeofbatch().equalsIgnoreCase("evening")) {
			return "Type of batch must be either 'morning' or 'evening'";
		}
		return null;		
	}

}
