package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.OfferDAO;
import kr.ac.hansung.model.Offer;

@Service
public class OfferService {

	@Autowired
	private OfferDAO offerDAO;

	public List<Offer> getCurrent() {

		return offerDAO.getOffers();
	}

	public List<Offer> getOffers2019() {

		return offerDAO.getOffers2019();
	}

	public void insert(Offer offer) {

		offerDAO.insert(offer);

	}
	
	
	public void delete(String name) {

		offerDAO.delete(name);

	}
	
	public List<Offer> getCount(){
		return offerDAO.getYearSemesterSum();
	}
	
	public List<Offer> getOffer(String year, String semester){
		return offerDAO.getOffer(year, semester);
	}
	
	
}
