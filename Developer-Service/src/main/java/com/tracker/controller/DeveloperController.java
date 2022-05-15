package com.tracker.controller;

import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tracker.dao.DeveloperDAOImpl;
import com.tracker.entity.Developer;


@Controller
@RequestMapping(value = "/getdevelopercontroller")
public class DeveloperController {

	 @Autowired
	  private DeveloperDAOImpl developerDAOImpl;
	  private Logger logger = getLogger(DeveloperController.class);


	  @Autowired
	  public DeveloperController(DeveloperDAOImpl developerDAOImpl)
	  {
	    this.developerDAOImpl = developerDAOImpl;
	  }

	  
	  @RequestMapping(value = "/add", method = RequestMethod.GET)
	  public String addDeveloper()
	  {
	    logger.info("Add a developer");
	    
	    this.developerDAOImpl.addDeveloper("Divya");
	    return "Developer added";
	  }

	  @RequestMapping(value = "/remove", method = RequestMethod.GET)
	  public String removeDeveloper()
	  {
	    logger.info("Remove a developer");
	    
	    this.developerDAOImpl.deleteDeveloper("101");
	    return "Developer removed";
	  }


	  @RequestMapping(method = RequestMethod.GET)
	  public List<Developer> getDevelopers()
	  {
	    logger.info("GET a developer");

	    List<Developer> developerLists = this.developerDAOImpl.getAllDevelopers();	    
	    return developerLists;
	  }

}
