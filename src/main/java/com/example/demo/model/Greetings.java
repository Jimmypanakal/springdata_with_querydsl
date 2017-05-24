package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greetings {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String text;
	private String textcolor;
	private String textstyle;
	private int fontsize;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTextcolor() {
		return textcolor;
	}
	public void setTextcolor(String textcolor) {
		this.textcolor = textcolor;
	}
	public String getTextstyle() {
		return textstyle;
	}
	public void setTextstyle(String textstyle) {
		this.textstyle = textstyle;
	}
	public int getFontsize() {
		return fontsize;
	}
	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}
	

}
