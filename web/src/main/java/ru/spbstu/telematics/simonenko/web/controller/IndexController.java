package main.java.ru.spbstu.telematics.simonenko.web.controller;

import main.java.ru.spbstu.telematics.simonenko.model.dao.ClassDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.ClassStyleDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.FamilyDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.ObjectDAO;
import main.java.ru.spbstu.telematics.simonenko.model.dao.StyleDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
	
	private ClassDAO classesService;
	
	private ClassStyleDAO classStylesService;
	
	private FamilyDAO familiesService;
	
	private ObjectDAO objectsService;
	
	private StyleDAO stylesService;
	
	@Autowired
	public void setClassesService(ClassDAO classesService) {
		this.classesService = classesService;
	}

	@Autowired
	public void setClassStylesService(ClassStyleDAO classStylesService) {
		this.classStylesService = classStylesService;
	}

	@Autowired
	public void setFamiliesService(FamilyDAO familiesService) {
		this.familiesService = familiesService;
	}

	@Autowired
	public void setObjectsService(ObjectDAO objectsService) {
		this.objectsService = objectsService;
	}

	@Autowired
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
		mav.addObject("families", familiesService.getAll());
		return mav;
	}
	
}