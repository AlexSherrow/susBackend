package com.susBackend.entity;

import javax.persistence.*;


@Entity
public class Image {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	public String fileURL;
	
	public Image() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileURL() {
		return fileURL;
	}

	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
	};

}
