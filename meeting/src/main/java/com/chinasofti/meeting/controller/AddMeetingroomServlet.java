package com.chinasofti.meeting.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.meeting.dao.PageDao;
import com.chinasofti.meeting.service.DepartmentService;
import com.chinasofti.meeting.service.MeetingRoomService;
import com.chinasofti.meeting.vo.Employee;
import com.chinasofti.meeting.vo.MeetingRoom;

public class AddMeetingroomServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	doPost(request, response);	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer roomnum=Integer.parseInt(request.getParameter("roomnum"));
		Integer capacity=Integer.parseInt(request.getParameter("capacity"));
		String roomname=request.getParameter("roomname");
		String status =request.getParameter("status");
		String description =request.getParameter("description");
		
		MeetingRoom room=new MeetingRoom();
		room.setCapacity(capacity);
		room.setRoomnum(roomnum);
		room.setRoomname(roomname);
		room.setStatus(status);
		room.setDesciption(description);
		
		
		MeetingRoomService service = new MeetingRoomService();
		service.addMeetingRoom(room);
		
		
		request.getRequestDispatcher("viewAllMeetingRoomsServlet").forward(request, response);
		
		
	}

}
