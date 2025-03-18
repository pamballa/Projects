package com.vil.utilities;

import java.sql.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserComplienceDTO {
	@NotBlank(message = "Mobile number  is mandatory")
	private long mobileNo;
	@Email(message = "EMial is mandatory")
	private String emialId;
	@NotBlank(message = "Amount cant be null")
	private float tarrifAmount;
	@NotBlank(message = "suscriber name is mandatory")
	private String subscriberName;
	private String circle;
	@NotBlank(message = "service type is mandatory")
	private String serviceType; //related to which issue ->actinvation or deactivation
	private String isRBT;
	private String VASProvider;
	@NotBlank(message = "channal type is mandatory")
	private String channelType; //IVR_call/SMS/CRM/vil_site/
	private Date createdOn;
	private String createdBy;
	private String updatedOn;
	private String description;
	private String TRAIstatus;

}
