package resources;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
//import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named(value = "myTimeBean")
//@ManagedBean(name = "myTimeBean")
@RequestScoped
public class TimeBean {
	
	public String getTime() {
		return new Date().toString();
	}
}
