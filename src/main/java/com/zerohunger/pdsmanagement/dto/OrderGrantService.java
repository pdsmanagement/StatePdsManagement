package com.zerohunger.pdsmanagement.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Model for Order Grant Request by a State for a particular Order request")
public class OrderGrantService {
	
	@Schema(description = "State Name who is Granting Ration to another State")
	private String grantingStateName;
	@Schema(description = "Request ID for whom the Grant Order will be released")
	private String requestId;
	@Schema(description = "Quantity of the Ration granted by the State")
	private Double quantityGranted;

}
