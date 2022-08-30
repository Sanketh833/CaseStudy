package com.reader.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReaderEntity {

	@Id

	private int rid;
	private String readerPassword;
	private String name;
	private String emailId;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getReaderPassword() {
		return readerPassword;
	}

	public void setReaderPassword(String readerPassword) {
		this.readerPassword = readerPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ReaderEntity [rid=" + rid + ", readerPassword=" + readerPassword + ", name=" + name + ", emailId="
				+ emailId + "]";
	}

}
