package com.tracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/getPlanController")
public class PlanningController {
	
	@GetMapping("/issue/plan")
	public Integer getPlanning() {
		
		Integer minNumWeeks = 0;
		
		//TO DO: Get Developers count + their assigned story details(StoryID and storyPoints)
		
		//TO DO: Get All stories and provide estimate, and mark its status as "ESTIMATED"
		
		//TO DO: Get All stories with status "ESTIMATED" and sort it based on "CreatedDate"
		
		/* TO DO: Story Assignment{
			iterate over developer list and stories list
				if(developer.storyPoints + story.storyPoint <= 10){
					//Assign story to the developer				
				}
				else{
					move to next developer				
				}
				
				move to next story
				
				//finally if any story is left unassigned, split it into sub modules
					and break down the story points to repeat the story assignment process above.
					
				above logic will make sure no developer is assigned more that 10 story points 	
				return the developer count, which will be minimum week's time to complete the stories.
		} */
		
		return minNumWeeks;
	}

}
