package com.tracker.controller;

import static org.slf4j.LoggerFactory.getLogger;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tracker.dao.StoryDAOImpl; 
import com.tracker.entity.Story;

@Controller
@RequestMapping(value = "/getStorycontroller")
public class StoryController {

	@Autowired
	private StoryDAOImpl storyDAOImpl;
	private Logger logger = getLogger(StoryController.class);

	private List<Story> storyList = new ArrayList<Story>();

	@Autowired
	public StoryController(StoryDAOImpl developerDAOImpl) {
		this.storyDAOImpl = developerDAOImpl;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addStory() {
		logger.info("Add a developer");
		// TO DO: Get all story details from user(UI) and push it to DB.
		//Sample data hardcoded for time being.
		
		Story story = new Story();
		story.setAssigneeID(101);
		story.setDescription("New feature in XXX");
		story.setStoryPoint(2);
		story.setTitle("Implement ABC feature in XXX module");
		story.setStatus("NEW");

		this.storyDAOImpl.addStory(story);
		return "Developer added";
	}

	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String removeDeveloper() {
		logger.info("Remove a developer");

		this.storyDAOImpl.updateStory(null);
		return "Developer removed";
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Story> getDevelopers() {
		logger.info("GET a developer");

		List<Story> storyLists = this.storyDAOImpl.getAllStories();
		//TO DO: GET all story list from Database.
		return storyLists;
	}

}
