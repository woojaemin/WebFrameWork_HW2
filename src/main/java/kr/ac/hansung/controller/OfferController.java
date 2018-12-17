package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OfferService;

@Controller
public class OfferController {

	@Autowired
	private OfferService offerService;

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers", offers);

		return "offers";
	}
	
	@RequestMapping("/offers_by_semester")
	public String showOffers_by_semester(Model model) {
		List<Offer> offers = offerService.getCount();
		model.addAttribute("offers", offers);

		return "offers_by_semester";
	}
	
	@RequestMapping("/offers_detail")
	public String showOffers_detail(Model model, @RequestParam String year, @RequestParam String semester) {
		List<Offer> offers = offerService.getOffer(year, semester);
		model.addAttribute("offers", offers);

		return "offers_detail";
	}
	
	@RequestMapping("/delete")
	public String showdelete(Model model, @RequestParam String name) {
		
		offerService.delete(name);

		return "home";
	}
	
	@RequestMapping("/offercreated2019")
	public String showOffers2019(Model model) {
		List<Offer> offers = offerService.getOffers2019();
		model.addAttribute("offers", offers);

		return "offercreated2019";
	}

	@RequestMapping("/createoffer")
	public String createOffer(Model model) {

		model.addAttribute("offer", new Offer());

		return "createoffer";
	}

	@RequestMapping("/docreate")
	public String docreate(Model model, @Valid Offer offer, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createoffer";
		}
		
		offerService.insert(offer);
		
		return "offercreated";
	}
}
