package com.controller.Interface;

import java.util.List;

import com.controller.Config.GetConfig;

public interface GetInterface {
	List<GetConfig> getcourse();
	
	public GetConfig getcourse(Long CourseId);

}
