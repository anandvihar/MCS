package mcs.controller.admin.model;

import java.util.ArrayList;
import java.util.List;

public class AdminResponse {
private String name;
private List<String> abc;


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<String> getAbc() {
	abc=new ArrayList<String>();
	abc.add("Sahil");
	abc.add("kapoor");
	return abc;
}

public void setAbc(List<String> abc) {
	this.abc = abc;
}

}
