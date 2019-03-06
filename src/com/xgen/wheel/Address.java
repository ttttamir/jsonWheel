package com.xgen.wheel;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
	
	public Address(String province){
		this.province = province;
	}
	
	// 省
	String province;
	
	// 城市
	String city;
	
	String county;
	
	String town;
	
	String village;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
	
//	public  Address(String address){
//        String regex="(?<province>[^省]+自治区|.*?省|.*?行政区|.*?市)(?<city>[^市]+自治州|.*?地区|.*?行政单位|.+盟|市辖区|.*?市|.*?县)(?<county>[^县]+县|.+区|.+市|.+旗|.+海域|.+岛)?(?<town>[^区]+区|.+镇)?(?<village>.*)";
//        Matcher m=Pattern.compile(regex).matcher(address);
//        while(m.find()){
//            this.province=m.group("province");
//            this.city=m.group("city");
//            this.county=m.group("county");
//            this.town=m.group("town");
//            this.village=m.group("village");
//        }
//	}

	@Override
	public String toString() {
		return "Address [province=" + province.trim() + ", city=" + city.trim() + ", county=" + county.trim() + ", town=" + town.trim()
				+ ", village=" + village.trim() + "]";
	}
//	
	
	
	
	
}
