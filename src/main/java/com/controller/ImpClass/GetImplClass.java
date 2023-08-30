package com.controller.ImpClass;

import java.util.*;
import java.util.List;

import org.springframework.stereotype.Service;

import com.controller.Config.GetConfig;
import com.controller.Interface.GetInterface;
@Service
public class GetImplClass implements GetInterface {
	public List<GetConfig> list;
	public  GetImplClass() {
		list = new ArrayList<>();
		list.add(new GetConfig(123,"java","core java course"));
		list.add(new GetConfig(1231,"java core","core java course"));
		list.add(new GetConfig(221,"java adavance","core java course"));
		
	}
	@Override
	public List<GetConfig> getcourse() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public GetConfig getcourse(Long CourseId) {
		// TODO Auto-generated method stub
		GetConfig c = null;
		for(GetConfig getConfig : list)
		{
			if(getConfig.getId()==CourseId) {
				
				c = getConfig;
				break;
			}
		}
		return c;
	}
	
	

}
