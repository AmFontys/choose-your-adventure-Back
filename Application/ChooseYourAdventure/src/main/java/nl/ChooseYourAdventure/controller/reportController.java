package nl.ChooseYourAdventure.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/report")
@CrossOrigin(origins =  {"http://localhost:3000/"})
public class reportController {
}
