package com.example.AbhishekNM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.AbhishekNM.entity.Customer;
import com.example.AbhishekNM.entity.Item;
import com.example.AbhishekNM.entity.Sale;
import com.example.AbhishekNM.repository.CustomerRepo;
import com.example.AbhishekNM.repository.ItemRepo;
import com.example.AbhishekNM.repository.SaleRepo;

@Controller
public class MainController {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private ItemRepo itemRepo;

	@Autowired
	private SaleRepo saleRepo;

	@GetMapping("/")
	public String showForm(Model model) {

		List<Customer> customers = customerRepo.findAll();
		List<Item> items = itemRepo.findAll();

		model.addAttribute("customers", customerRepo.findAll());
		model.addAttribute("items", itemRepo.findAll());

		model.addAttribute("sale", new Sale());

		return "form";
	}

	@PostMapping("/selection-overview")
	public String selectionPage(@ModelAttribute Sale sale2, Model model) {

		Customer customer = customerRepo.findById(sale2.getCustomerid()).get();

		Item item = itemRepo.findById(sale2.getItemid()).get();

		sale2.setAmount(item.getPrice());

		model.addAttribute("customer", customer);
		model.addAttribute("item", item);
		model.addAttribute("sale", sale2);

		return "overview";
	}

	@PostMapping("/submit")
	public String submit(@ModelAttribute Sale sale) {

		Item item = itemRepo.findById(sale.getItemid()).get();
		sale.setAmount(item.getPrice());

		Sale saved = saleRepo.save(sale);

		return "redirect:/report/" + saved.getSaleid();
	}

	@GetMapping("/report/{saleid}")
	public String report(Model model, @PathVariable Integer saleid) {

		Sale sale = saleRepo.findById(saleid).get();
		Item item = itemRepo.findById(sale.getItemid()).get();
		Customer customer = customerRepo.findById(sale.getCustomerid()).get();

		model.addAttribute("customer", customer);
		model.addAttribute("item", item);
		model.addAttribute("sale", sale);

		return "report";

	}

}
