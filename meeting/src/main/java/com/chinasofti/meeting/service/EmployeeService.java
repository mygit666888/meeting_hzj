package com.chinasofti.meeting.service;

import com.chinasofti.meeting.dao.EmployeeDao;
import com.chinasofti.meeting.vo.Employee;

public class EmployeeService {
    private EmployeeDao dao=new EmployeeDao();
    
    private Employee loginedEmployee;//登陆的员工
    
    
    public Employee getLoginedEmployee() {
		return loginedEmployee;
	}

	public void setLoginedEmployee(Employee loginedEmployee) {
		this.loginedEmployee = loginedEmployee;
	}

	public int login(String username,String pwd) {
    	int flag=3;
    	Employee employee=dao.selectByNamePwd(username, pwd);
    	if(employee != null) {
    		loginedEmployee= employee;//记录登陆员工信息
    		String status= employee.getStatus();
    		if(status!=null&& "1".equals(status)) {
    			flag=1;//审核通过
    		}else if(status!=null&& "0".equals(status)) {
    			flag=0;}//等待审核
    		else if(status!=null&& "2".equals(status)) {
    			flag=2;//审核通过
    	}
    }
		return flag;
    	
    }
    
 public static void main(String[] args) {
	EmployeeService service=new EmployeeService();
	int i=service.login("lilei", "123");
	System.out.println(i);
}
}