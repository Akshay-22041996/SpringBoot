package com.nt.service;

import java.util.List;

import com.nt.reposetory.FirstImpl;
import com.nt.reposetory.SecondImpl;

public interface IEmployeeServiceMangement {

	public List<SecondImpl> getEmployeeHavingLetter(String c,Class<SecondImpl> clazz);
}
