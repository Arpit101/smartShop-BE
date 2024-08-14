package com.codeWe.smartShop.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmartShopDto {

	private String title;
	private String itemPrice;
	private String dateOfPurchase;
	
}
