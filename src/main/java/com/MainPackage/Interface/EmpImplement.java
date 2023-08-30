package com.MainPackage.Interface;

import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.MainPackage.Config.EmployeeDetails;
@Service
public class EmpImplement implements EmpInt {
	List<EmployeeDetails> list;
	public EmpImplement() {
		list = new ArrayList<>();
		list.add(new EmployeeDetails(123498,50000,"Raj",897654357));
		list.add(new EmployeeDetails(49843,30000,"Veer",897654357));
	}
	

	@Override
	public List<EmployeeDetails> getInfo() {
		return list;
	}


	@Override
	public EmployeeDetails getDet(Long MobNo) 
	{
		EmployeeDetails emp = null;
		for(EmployeeDetails emDetails : list) {
			if(emDetails.getMob()==MobNo)
			{
				emp= emDetails;
				break;
			}
		}
		return emp;
	}

}
