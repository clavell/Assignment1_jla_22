package com.csis3275.controller_jla_22;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csis3275.model_jla_22.Car_jla_22;


@Controller
//Here we will have this controller respond to requests from /vehicle for the vehicle servlet.
@RequestMapping("/vehicle")
public class VehicleController_jla_22 {
	/*
	 * This method will serve as default GET handler.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newProfile(ModelMap model) {
		Car_jla_22 car = new Car_jla_22();
		model.addAttribute("car", car);
		return "Assignment1View";
	}

	/*
	 * This method will be called on form submission, handling POST request It also
	 * validates the user input
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String saveProfile(Car_jla_22 car, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "Assignment1View";
		}
//		model.addAttribute("successMessage", "Dear " + em.getFirstName() + " , your profile completed successfully");
		model.addAttribute("car", car);
		return "Assignment1Success";
	}

//	/*
//	 * Method used to populate the country list in view. Note that here you can call
//	 * external systems to provide real data.
//	 */
//	@ModelAttribute("countries")
//	public List<String> initializeCountries() {
//		List<String> countries = new ArrayList<String>();
//		countries.add("USA");
//		countries.add("Canada");
//		countries.add("France");
//		countries.add("Indonesia");
//		countries.add("Australia");
//		countries.add("Other");
//		return countries;
//	}
	

}
