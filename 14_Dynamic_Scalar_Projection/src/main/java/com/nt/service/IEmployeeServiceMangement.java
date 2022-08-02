package com.nt.service;

import java.util.List;

import com.nt.proxy.FirstImpl;
import com.nt.proxy.SecondImpl;

public interface IEmployeeServiceMangement {

	public List<SecondImpl> getEmployeeHavingLetter(String c,Class<SecondImpl> clazz);
}
