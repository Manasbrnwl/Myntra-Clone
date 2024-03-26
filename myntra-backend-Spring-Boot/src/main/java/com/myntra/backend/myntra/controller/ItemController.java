package com.myntra.backend.myntra.controller;

import org.springframework.web.bind.annotation.RestController;

import com.myntra.backend.myntra.entities.Item;
import com.myntra.backend.myntra.entities.Rating;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("*")
@RequestMapping("/items")
public class ItemController {

	@GetMapping
	public ResponseEntity<List<Item>> getItems() throws InterruptedException {
		Thread.sleep(2000);
		return ResponseEntity.ok(items);
	}

	private static List<Item> items = Arrays.asList(
			new Item("001", "images/1.jpg", "Carlton London", "Rhodium-Plated CZ Floral Studs", 1045, 606, 42, 14,
					"10 Oct 2023", new Rating(4.5, 1400)),
			new Item("002", "images/2.jpg", "CUKOO", "Women Padded Halter Neck Swimming Dress", 2599, 1507, 42, 14,
					"10 Oct 2023", new Rating(4.3, 24)),
			new Item("003", "images/3.jpg", "NUEVOSDAMAS", "Women Red & White Printed A-Line Knee-Length Skirts", 1599, 495,
					69, 14,
					"10 Oct 2023", new Rating(4.1, 249)),
			new Item("004", "images/4.jpg", "ADIDAS", "Indian Cricket ODI Jersey", 999, 999, 0, 14,
					"10 Oct 2023", new Rating(5, 10)),
			new Item("005", "images/5.jpg", "Roadster", "Pure Cotton T-shirt", 1399, 489, 65, 14,
					"10 Oct 2023", new Rating(4.2, 3500)),
			new Item("006", "images/6.jpg", "Nike", "Men ReactX Running Shoes", 14995, 14995, 0, 14,
					"10 Oct 2023", new Rating(0, 0)),
			new Item("007", "images/7.jpg", "The Indian Garage Co", "Men Slim Fit Regular Shorts", 1599, 639, 60, 14,
					"10 Oct 2023", new Rating(4.2, 388)),
			new Item("008", "images/8.jpg", "Nivea", "Men Fresh Deodrant 150ml", 285, 142, 50, 14,
					"10 Oct 2023", new Rating(4.2, 5200)));
}
