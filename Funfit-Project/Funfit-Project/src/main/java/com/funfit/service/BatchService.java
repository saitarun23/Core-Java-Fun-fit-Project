package com.funfit.service;

import java.util.Arrays;
import java.util.List;

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
		
		// Define allowed time slots for morning and evening batches in "9am", "8am" format
		List<String> morningTimes=Arrays.asList("6am", "7am", "8am", "9am");
		List<String> eveningTimes=Arrays.asList("5pm", "6pm", "7pm", "8pm");
		
		if(batch.getTypeofbatch().equalsIgnoreCase("morning")) {
			if(!morningTimes.contains(batch.getTime().toLowerCase())) {
				return "Invalid time for morning batch. Allowed times are: "+morningTimes;	
			}
		}else if(batch.getTypeofbatch().equalsIgnoreCase("evening")) {
			if(!eveningTimes.contains(batch.getTime().toLowerCase())) {
				return "Invalid time for evening batch. Allowed times are: "+eveningTimes;
			}
			
		}
		
		return "Batch Saved Successfully";		
	}

}
