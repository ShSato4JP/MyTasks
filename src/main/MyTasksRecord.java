package main;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class MyTasksRecord {
	//TableViewとバインド
	private SimpleStringProperty title;
	private SimpleStringProperty owner;
	private SimpleStringProperty startdate;
	private SimpleStringProperty clsdate;
	private SimpleStringProperty path;

	//普通の変数
	private SimpleIntegerProperty process;
	private SimpleStringProperty priority;
	private SimpleStringProperty detail;

	public MyTasksRecord(String title, String owner, String start,    String end,
			             String path,  int process,  String priority, String detail) {

		this.title = new SimpleStringProperty(title);
		this.owner = new SimpleStringProperty(owner);
		this.startdate = new SimpleStringProperty(start);
		this.clsdate = new SimpleStringProperty(end);
		this.path = new SimpleStringProperty(path);
		this.process = new SimpleIntegerProperty(process);
		this.priority = new SimpleStringProperty(priority);
		this.detail = new SimpleStringProperty(detail);
	}

	public String getTitle() {
		return title.get();
	}
	public void setTitle(String title) {
		this.title.set(title);
	}

	public String getOwner() {
		return owner.get();
	}
	public void setOwner(String owner) {
		this.owner.set(owner);
	}

	public String getStartDate() {
		return startdate.get();
	}
	public void setStartDate(String start) {
		this.startdate.set(start);
	}

	public String getClsDate() {
		return clsdate.get();
	}
	public void setClsDate(String end) {
		this.clsdate.set(end);
	}

	public String getPath() {
		return path.get();
	}
	public void setPath(String path) {
		this.path.set(path);
	}

	public int getProcess() {
		return process.get();
	}
	public void setProcess(int process) {
		this.process.set(process);
	}

	public String getPriority() {
		return priority.get();
	}
	public void setDetail(String detail) {
		this.detail.set(detail);
	}
}
