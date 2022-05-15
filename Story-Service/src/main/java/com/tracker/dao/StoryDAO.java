package com.tracker.dao;

import java.util.List;

import com.tracker.entity.Story;

public interface StoryDAO {

	public List<Story> getAllStories();
	
	public Boolean addStory(Story story);
	
	public Boolean updateStory(Story story);
	
}
