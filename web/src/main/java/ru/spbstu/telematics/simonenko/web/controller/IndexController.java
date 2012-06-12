package main.java.ru.spbstu.telematics.simonenko.web.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.ru.spbstu.telematics.simonenko.model.dao.ClassDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.ClassStyleDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.FamilyDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.ObjectDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.StyleDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dto.ClassDTO;
import main.java.ru.spbstu.telematics.simonenko.model.dto.ClassStyleDTO;
import main.java.ru.spbstu.telematics.simonenko.model.dto.FamilyDTO;
import main.java.ru.spbstu.telematics.simonenko.model.dto.ObjectDTO;
import main.java.ru.spbstu.telematics.simonenko.model.dto.StyleDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	@Autowired
	private ClassDAO classesService;
	
	@Autowired
	private ClassStyleDAO classStylesService;
	
	@Autowired
	private FamilyDAO familiesService;
	
	@Autowired
	private ObjectDAO objectsService;
	
	@Autowired
	private StyleDAO stylesService;
	
	public void setClassesService(ClassDAO classesService) {
		this.classesService = classesService;
	}

	public void setClassStylesService(ClassStyleDAO classStylesService) {
		this.classStylesService = classStylesService;
	}

	public void setFamiliesService(FamilyDAO familiesService) {
		this.familiesService = familiesService;
	}

	public void setObjectsService(ObjectDAO objectsService) {
		this.objectsService = objectsService;
	}

	public void setStylesService(StyleDAO stylesService) {
		this.stylesService = stylesService;
	}

	@RequestMapping("/")
	public String rootRedirect() {
		return "redirect:index";
	}
	
	@RequestMapping("/index")
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("index");
		//mav.addObject("objects", objectsService.getAll(ObjectDTO.class));
		return mav;
	}
	
}
