package br.com.siteperiscopio.controller;

import br.com.siteperiscopio.services.PlaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
public class PlaceController {
    @Autowired
    private PlaceServices placeServices;
}
