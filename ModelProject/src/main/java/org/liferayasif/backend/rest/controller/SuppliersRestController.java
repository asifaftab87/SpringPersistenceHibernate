package org.liferayasif.backend.rest.controller;

import java.util.List;
import java.util.regex.Pattern;

import org.liferayasif.backend.constants.PathConstants;
import org.liferayasif.backend.model.Suppliers;
import org.liferayasif.backend.service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = PathConstants.SUPPLIER)
public class SuppliersRestController {

	@Autowired
	private SuppliersService suppliersService;
	
	
	
	@RequestMapping(value=PathConstants.ADD_SUPPLIERS, method=RequestMethod.POST)
	public Suppliers add(@RequestBody Suppliers suppliers) throws Exception
	{
		
		String fName = suppliers.getContactFName();
		if(fName==null)
			throw new Exception("fname cannot be null/empty please feed");
		
		fName = fName.trim();
		
		if(fName.isEmpty())
		{
			throw new Exception("fname is required");
		}
		
		String regexUserName = "^[A-Za-z\\s]+$";
		if(!fName.matches(regexUserName))
		{
			throw new Exception("Name shuould be only alpha");
		}
		
		
						
		
		String email = suppliers.getEmail();
		if(email==null)
			throw new Exception("email should not be empty please fill valid email");
		
		email=email.trim();
		
		if(email.isEmpty())
		{
			throw new Exception("Email cannot be empty");
		}
			
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+	"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";
								
			Pattern pat = Pattern.compile(emailRegex);
			if(!pat.matcher(email).matches())
			{
				throw new Exception("invalid email id");
			}
			
			
						
			
			String add1 = suppliers.getAddress1();
			if(add1==null)
				throw new Exception("address1 cant be null/empty");
			
			add1=add1.trim();
			
			if(add1.isEmpty())
			{
				throw new Exception("Address1 is required");
			}
			
			String comName = suppliers.getCompanyName().trim();
			
			
			
			
			String city = suppliers.getCity();	
			if(city == null )
				{
				throw new Exception(" City cannot be null/empty please feed");
				}
			
			city=city.trim();
			
			if(comName.isEmpty())
				{
					throw new Exception("Company Name is required");
				}
			
			
			
			String state = suppliers.getState();	
			if(state == null)
				{
				throw new Exception("State cant be null please feel valid state");
				}
			state=state.trim();
			if(state.isEmpty())
			{
			throw new Exception("State is required");
			}
		
					
		String postalCode = suppliers.getPostalCode();
		if(postalCode == null )
			{
			throw new Exception("Postal Code cannot be null/empty , please inout valid postal code");
			}
		postalCode=postalCode.trim();
		
		if(postalCode.isEmpty())
		{
		throw new Exception("Postal Code is required");
		}
		
		
		
		String country = suppliers.getCountry();
		if(country == null )
			{
			throw new Exception("Country is required");
			}
		country=country.trim();
		
		if(country.isEmpty())
		{
		throw new Exception("Country is required");
		}
		
		 
		
		String phNo	= suppliers.getPhone();
		
		if(phNo == null)
			{
			throw new Exception(" Phone Number cannot be null please feed  a valid ph No");
			}
		phNo=phNo.trim();
		
		if(phNo.isEmpty())
		{
		throw new Exception(" Phone Number is required");
		}
				
		String regexStr = "^[0-9]{10}$";
		if(!phNo.matches(regexStr))
		{
			throw new Exception("please enter 0-9 and 10 digit");
		}
		
		
			
		suppliers = suppliersService.addSuppliers(suppliers);
		
		return suppliers;
		
		
	}
	
	@RequestMapping(value=PathConstants.FIND_SUPPLIERS_BY_ID, method=RequestMethod.GET)
	public Suppliers findSupplierById(@RequestParam("id") int id)
	{
		Suppliers suppliers = suppliersService.getSupplierById(id);
		return suppliers;
		
	}		
	
	@RequestMapping(value=PathConstants.ALL_SUPPLIERS, method=RequestMethod.GET)
	public List<Suppliers> getAllSupp()
	{
		List<Suppliers> suppliersList = suppliersService.getAllSuppliers();
		return suppliersList;
		
	}	
	
	
}
