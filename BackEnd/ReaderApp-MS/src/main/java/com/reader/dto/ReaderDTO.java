package com.reader.dto;

import com.reader.entity.ReaderEntity;

public class ReaderDTO {

	private int rid;
	private String readerPassword;
	private String name;
	private String emailId;
	private Book

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
		return "ReaderDTO [rid=" + rid + ", readerPassword=" + readerPassword + ", name=" + name + ", emailId="
				+ emailId + "]";
	}

	public static ReaderDTO ReaderEntitytoDTOconversion() {

		ReaderEntity readerEntity = new ReaderEntity();
		ReaderDTO rdto = new ReaderDTO();
		rdto.setRid(readerEntity.getRid());
		rdto.setEmailId(readerEntity.getEmailId());
		rdto.setName(readerEntity.getName());
		rdto.setReaderPassword(readerEntity.getReaderPassword());
		return rdto;
	}

	public static ReaderEntity ReaderDTOtoEntityConversion(ReaderDTO readerDTO) {
		// TODO Auto-generated method stub
		ReaderEntity readerEntity = new ReaderEntity();
		readerEntity.setRid(readerDTO.getRid());
		readerEntity.setEmailId(readerDTO.getEmailId());
		readerEntity.setName(readerDTO.getName());
		readerEntity.setReaderPassword(readerDTO.getReaderPassword());

		return readerEntity;
	}

}
