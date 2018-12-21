package com.aekashiraki.lms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aekashiraki.lms.model.CountryModel;
import com.aekashiraki.lms.model.ProvinceModel;
import com.aekashiraki.lms.service.CountryService;
import com.aekashiraki.lms.service.ProvinceService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService ;
	
	@Autowired
	private ProvinceService provinceService;
	
	/* Menu Country */
	@RequestMapping(value = "country")
	public String country(Model model) {
		String jsp = "country/country";
		return jsp;
	}
	
	/* List Country */
	@RequestMapping(value = "country/list")
	public String listcountry(Model model) {
		List<CountryModel> countryModelList = new ArrayList<CountryModel>();
		countryModelList = this.countryService.searchAll();
		model.addAttribute("countryModelList", countryModelList);
		String jsp = "country/list";
		return jsp;
	}

	/* Popup Add Country */
	@RequestMapping(value = "country/tambah")
	public String tambahcountry(Model model) {
		String jsp = "country/tambah";
		return jsp;
	}

	/* Create Country */
	@RequestMapping(value = "country/create")
	public String create(HttpServletRequest request, Model model) {
		
		Integer qtyInt;
		
		if (request.getParameter("citizenQty")=="") {
			qtyInt = 0;
		} else {
			qtyInt = Integer.parseInt(request.getParameter("citizenQty"));
		}

		CountryModel countryModel = new CountryModel();
		countryModel.setCode(request.getParameter("code"));
		countryModel.setName(request.getParameter("name"));
		countryModel.setCitizenQty(qtyInt);
		countryModel.setContinent(request.getParameter("continent"));		

		this.countryService.create(countryModel);
		model.addAttribute("countryModel", countryModel);

		String jsp = "country/country";
		return jsp;
	}
	
	/* Popup Edit Country */
	@RequestMapping(value = "country/edit")
	public String countryEdit(HttpServletRequest request, Model model) {
		
		/* Country ID */
		Long id = Long.valueOf(request.getParameter("id"));
		
		CountryModel countryModel = new CountryModel();
		countryModel = this.countryService.searchById(id);
		model.addAttribute("countryModel", countryModel);

		String jsp = "country/edit";
		return jsp;
	}
	
	/* Edit Country */
	@RequestMapping(value = "country/edit/save")
	public String countryEditSave(HttpServletRequest request, Model model) throws Exception {
		
		/* Country  ID */
		Long id = Long.valueOf(request.getParameter("id"));

		/* Get Old Value */
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		Integer citizenQty = Integer.parseInt(request.getParameter("citizenQty"));
		String continent = request.getParameter("continent");		

		/* New Model */
		CountryModel countryModelDB = new CountryModel();
		countryModelDB = this.countryService.searchById(id);

		/* New Value */
		countryModelDB.setCode(code);
		countryModelDB.setName(name);
		countryModelDB.setCitizenQty(citizenQty);
		countryModelDB.setContinent(continent);

		this.countryService.update(countryModelDB);
		model.addAttribute("countryModelDB", countryModelDB);

		String jsp = "country/country";
		return jsp;
	}
	
	/* Popup Add Province */
	@RequestMapping(value = "country/tambahProvince")
	public String tambahprovince(HttpServletRequest request) {
		
		/* Country  ID */
		Long id = Long.valueOf(request.getParameter("id"));
		
		String jsp = "country/tambahProvince";
		return jsp;
	}
	
	/* Create Province*/
	@RequestMapping(value = "country/createProvince")
	public String createProvince(HttpServletRequest request, Model model) {
		
		/* Country  ID */
		Long countryId = Long.valueOf(request.getParameter("id"));

		ProvinceModel provinceModel = new ProvinceModel();
		provinceModel.setCode(request.getParameter("code"));
		provinceModel.setCountryId(countryId);
		provinceModel.setName(request.getParameter("name"));

		this.provinceService.create(provinceModel);
		model.addAttribute("provinceModel", provinceModel);

		String jsp = "country/edit";
		return jsp;
	}
	
	/* List Province */
	@RequestMapping(value = "country/listProvince")
	public String listprovince(Model model) {
		List<ProvinceModel> provinceModelList = new ArrayList<ProvinceModel>();
		provinceModelList = this.provinceService.searchAll();
		model.addAttribute("provinceModelList", provinceModelList);
		String jsp = "country/listProvince";
		return jsp;
	}

}
