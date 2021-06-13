package com.zerohunger.pdsmanagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Availability {
	
	private String rawMaterialName;
	private Double availableQuantity;

}
