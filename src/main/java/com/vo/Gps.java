package com.vo;

public class Gps {
	
	private double wgLat;
	private double wgLon;

	public Gps() {
		super();
	}
	
	public Gps(double wgLat, double wgLon) {
		this();   // 调用无参构造函数,使用this调用构造方法必须放在构造方法的第一行。
		
//		this.wgLat = wgLat;
//		this.wgLon = wgLon;
		setWgLon(wgLon);
		setWgLat(wgLat);

	}

	public double getWgLat() {
		return wgLat;
	}

	public void setWgLat(double wgLat) {
		this.wgLat = wgLat;
	}

	public double getWgLon() {
		return wgLon;
	}

	public void setWgLon(double wgLon) {
		this.wgLon = wgLon;
	}

	@Override
	public String toString() {
		return wgLat + "," + wgLon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(wgLat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wgLon);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gps other = (Gps) obj;
		if (Double.doubleToLongBits(wgLat) != Double.doubleToLongBits(other.wgLat))
			return false;
		if (Double.doubleToLongBits(wgLon) != Double.doubleToLongBits(other.wgLon))
			return false;
		return true;
	}
	
	
}
