package vn.smartdev.demo_aop.service;

public class CustomerService {

	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public CustomerService(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	
	public void printName(){
		System.out.println("Customer name :"+name);
	}
	
	public void printURL(){
		System.out.println("URL :"+url);
	}
	public void printThrowException(){
		throw new IllegalArgumentException();
	}
	CustomerService() {
		
	}
}
