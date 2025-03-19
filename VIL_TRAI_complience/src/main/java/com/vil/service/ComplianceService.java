package com.vil.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vil.dao.ComplianceRepository;
import com.vil.entities.ComplianceRecord;
import com.vil.utilities.UserComplienceDTO;


@Service
public class ComplianceService {
		
		@Autowired
		private ComplianceRepository repository;
		

	    public ComplianceRecord saveRecord(ComplianceRecord userDto) {
	    	/*private int compl_Id;
	    	private long mobileNo;
	    	private String emialId;
	    	private float tarrifAmount;
	    	private String subscriberName;
	    	private String circle;
	    	private String serviceType; //related to which issue ->actinvation or deactivation
	    	private String isRBT;
	    	private String VASProvider;
	    	private String channelType; //IVR_call/SMS/CRM/vil_site/
	    	private Date createdOn;
	    	private String createdBy;
	    	private String updatedOn;
	    	private String description;
	    	private String TRAIstatus;*/
	    	ComplianceRecord record=ComplianceRecord.build(0, userDto.getMobileNo(), userDto.getEmialId(),
	    			userDto.getTarrifAmount(), userDto.getSubscriberName(), userDto.getCircle(), userDto.getServiceType(), 
	    			userDto.getIsRBT(), userDto.getVASProvider(),userDto.getChannelType(), new java.sql.Date(System.currentTimeMillis()), 
	    			userDto.getCreatedBy(), new java.sql.Date(System.currentTimeMillis()), userDto.getDescription(), "new");
	        return repository.save(record);
	    }
	    
	    
	    
	    
	    
	    
	    
	    

}
