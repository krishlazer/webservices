package com.krish.streaming.wservice.loadmaximapps.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController 
{

	@GetMapping(path = "/{BrandID}")
	public String getBrand(@PathVariable int BrandID)
	{
		
		return "get brand was called with Brand ID " + BrandID;
	
	}
	
	@GetMapping
	public String getBrands()
	{
		
		return "get brands was called for all brands";
	
	}


	@PostMapping
	public String createBrand()
	{
		
		return " Create Brand was called.";
	}

	
	@PutMapping
	public String updateBrand()
	{
		
		return " Update Brand was called.";
	}

	@DeleteMapping
	public String deleteBrand()
	{
		
		return " Delete Brand was called.";
	}
}
