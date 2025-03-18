package com.vil.entities;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "COMPLIANCE_MANAGMENT_TRAI")
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class ComplianceRecord{
	@Id
	@GeneratedValue
	private int compl_Id;
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
	private Date updatedOn;
	private String description;
	private String TRAIstatus;
	

}
