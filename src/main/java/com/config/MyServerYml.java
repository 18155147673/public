package com.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="myProps")//读取yml中的myServer属性
public class MyServerYml {
	private String port;
	private String[] arrayProps;
	private Map<String,String>mapProps=new HashMap<String,String>();
	private List<Map<String,String>>listMapProps=new ArrayList<Map<String,String>>();
	private List<String>listProps=new ArrayList<String>();
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String[] getArrayProps() {
		return arrayProps;
	}
	public void setArrayProps(String[] arrayProps) {
		this.arrayProps = arrayProps;
	}
	public Map<String, String> getMapProps() {
		return mapProps;
	}
	public void setMapProps(Map<String, String> mapProps) {
		this.mapProps = mapProps;
	}
	public List<Map<String, String>> getListMapProps() {
		return listMapProps;
	}
	public void setListMapProps(List<Map<String, String>> listMapProps) {
		this.listMapProps = listMapProps;
	}
	public List<String> getListProps() {
		return listProps;
	}
	public void setListProps(List<String> listProps) {
		this.listProps = listProps;
	}
}
