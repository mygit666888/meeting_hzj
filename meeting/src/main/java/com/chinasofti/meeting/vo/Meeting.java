package com.chinasofti.meeting.vo;

import java.sql.Timestamp;

public class Meeting {
	private int meetingid;
	private String meetingname;

	private int roomid;
	private int reservationistid;
	private int numberofparticipants;//参会人员个数

	private Timestamp starttime;
	private Timestamp endtime;
	private Timestamp reservationtime;
	private Timestamp canceledtime;

	private String description;
	private String status="0";


	public int getMeetingid() {
		return meetingid;
	}
	public void setMeetingid(int meetingid) {
		this.meetingid = meetingid;
	}
	public String getMeetingname() {
		return meetingname;
	}
	public void setMeetingname(String meetingname) {
		this.meetingname = meetingname;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getReservationistid() {
		return reservationistid;
	}
	public void setReservationistid(int reservationistid) {
		this.reservationistid = reservationistid;
	}
	public int getNumberofparticipants() {
		return numberofparticipants;
	}
	public void setNumberofparticipants(int numberofparticipants) {
		this.numberofparticipants = numberofparticipants;
	}
	public Timestamp getStarttime() {
		return starttime;
	}
	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}
	public Timestamp getEndtime() {
		return endtime;
	}
	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}
	public Timestamp getReservationtime() {
		return reservationtime;
	}
	public void setReservationtime(Timestamp reservationtime) {
		this.reservationtime = reservationtime;
	}
	public Timestamp getCanceledtime() {
		return canceledtime;
	}
	public void setCanceledtime(Timestamp canceledtime) {
		this.canceledtime = canceledtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Meeting [meetingid=" + meetingid + ", meetingname=" + meetingname + ", roomid=" + roomid
				+ ", reservationistid=" + reservationistid + ", numberofparticipants=" + numberofparticipants
				+ ", starttime=" + starttime + ", endtime=" + endtime + ", reservationtime=" + reservationtime
				+ ", canceledtime=" + canceledtime + ", description=" + description + ", status=" + status + "]";
	}






}