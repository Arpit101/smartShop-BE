package com.codeWe.smartShop.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeWe.smartShop.Dto.SmartShopDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController	
@RequestMapping("api/v1/sshop")
public class SmartShopController {
	private static final Logger log=LoggerFactory.getLogger(SmartShopController.class);
	
	@GetMapping("/home")
	public ResponseEntity<List<SmartShopDto>> getShopItem(){
		SmartShopDto smartShopDto=SmartShopDto.builder()
				.title("Shirt")
				.itemPrice("1000")
				.dateOfPurchase("13/08/2024")
				.build();
		
		List<SmartShopDto> sShop=new ArrayList<>();
		sShop.add(smartShopDto);
		log.info("sShop"+sShop);
		return ResponseEntity.ok(sShop);		
		
	}

} 