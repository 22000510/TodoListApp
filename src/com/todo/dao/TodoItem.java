package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
	private String category;
    private String title;
    private String desc;
    private String current_date;
    private String due_date;
	private int num;


	public TodoItem(int num, String category, String title, String desc, String due_date){
        this.num=num;
		this.category=category;
    	this.title=title;
        this.desc=desc;
        this.due_date=due_date;
        SimpleDateFormat f =new SimpleDateFormat("yyy/MM/dd kk:mm:ss");
        this.current_date= f.format(new Date());
    }
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getCategory() {
			return category;
	}

	public void setCategory(String category) {
			this.category = category;
	}
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }

	@Override
	public String toString() {
		return num + "." + "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date;
	}
    
    public String toSaveString() {
    	return num+ "##" + category + "##" + title + "##" + desc + "##" + due_date + " ## " +current_date + "/n";
    }

	
}
