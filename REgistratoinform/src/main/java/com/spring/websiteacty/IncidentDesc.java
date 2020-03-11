package com.spring.websiteacty;

import java.util.Date;

public class IncidentDesc {
  String no;
  String tno;
  String rootcause;
  String pcause;
  String caction;
  Date dateof;
  
  public Date getDateof() {
	return dateof;
}
public void setDateof(Date dateof) {
	this.dateof = dateof;
}
public IncidentDesc()
  {
	  
	  
  }
 @Override
public String toString() {
	return "IncidentDesc [no=" + no + ", tno=" + tno + ", rootcause=" + rootcause + ", pcause=" + pcause + ", caction="
			+ caction + "]";
}
public IncidentDesc(String no, String tno, String rootcause, String pcause, String caction) {
	super();
	this.no = no;
	this.tno = tno;
	this.rootcause = rootcause;
	this.pcause = pcause;
	this.caction = caction;
}
// Date time;
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getTno() {
	return tno;
}
public void setTno(String tno) {
	this.tno = tno;
}
public String getRootcause() {
	return rootcause;
}
public void setRootcause(String rootcause) {
	this.rootcause = rootcause;
}
public String getPcause() {
	return pcause;
}
public void setPcause(String pcause) {
	this.pcause = pcause;
}
public String getCaction() {
	return caction;
}
public void setCaction(String caction) {
	this.caction = caction;
}
  
}
