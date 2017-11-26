package com.itheima.domain;

import java.util.Date;

public class Window {
	private int wid;
	private String wfloor;
	private String wimage;
	private double wlength;
	private double wheight;
	private double wprice;
	private String wdeadline;
	private int wstate;
	private String wdesc;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWfloor() {
		return wfloor;
	}
	public void setWfloor(String wfloor) {
		this.wfloor = wfloor;
	}
	public String getWimage() {
		return wimage;
	}
	public void setWimage(String wimage) {
		this.wimage = wimage;
	}
	public double getWlength() {
		return wlength;
	}
	public void setWlength(double wlength) {
		this.wlength = wlength;
	}
	public double getWheight() {
		return wheight;
	}
	public void setWheight(double wheight) {
		this.wheight = wheight;
	}
	public double getWprice() {
		return wprice;
	}
	public void setWprice(double wprice) {
		this.wprice = wprice;
	}
	public String getWdeadline() {
		return wdeadline;
	}
	public void setWdeadline(String wdeadline) {
		this.wdeadline = wdeadline;
	}
	public int getWstate() {
		return wstate;
	}
	public void setWstate(int wstate) {
		this.wstate = wstate;
	}
	public String getWdesc() {
		return wdesc;
	}
	public void setWdesc(String wdesc) {
		this.wdesc = wdesc;
	}
	@Override
	public String toString() {
		return "Window [wid=" + wid + ", wfloor=" + wfloor + ", wimage=" + wimage + ", wlength=" + wlength
				+ ", wheight=" + wheight + ", wprice=" + wprice + ", wdeadline=" + wdeadline + ", wstate=" + wstate
				+ ", wdesc=" + wdesc + "]";
	}
	
	
	

}
