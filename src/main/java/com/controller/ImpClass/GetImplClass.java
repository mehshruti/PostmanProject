package com.controller.ImpClass;

import java.util.ArrayList;
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
		
	}
	@Override
	public List<GetConfig> getcourse() {
		// TODO Auto-generated method stub
		return list;
	}
	
	

}
