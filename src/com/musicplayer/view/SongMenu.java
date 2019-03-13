package com.musicplayer.view;

import java.util.List;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;



public class SongMenu {
	private SimpleStringProperty songMenuName;
	private SimpleStringProperty title;
	private SimpleStringProperty singer;
	private SimpleStringProperty album;
	private SimpleStringProperty size;
	private SimpleStringProperty length;
	
	
	public SongMenu(String title, String singer, String album, String length,String size) {

		this.title = new SimpleStringProperty(title);
		this.singer = new SimpleStringProperty(singer);
		this.album = new SimpleStringProperty(album);
		this.size = new SimpleStringProperty(size);
		this.length = new SimpleStringProperty(length);
		
	}
	public String getTitle() {
		return title.get();
	}
	public void setTitle(String Stitle) {
		title.set(Stitle);
	}
	public String getSinger() {
		return singer.get();
	}
	public void setSinger(String Ssinger) {
		singer.set(Ssinger);
	}
	public String getAlbum() {
		return album.get();
	}
	public void setAlbum(String Salbum) {
		album.set(Salbum);
	}
	public String getSize() {
		return size.get();
	}
	public void setSize(String Ssize) {
		size.set(Ssize);
	}
	public String getCreateDate() {
		return length.get();
	}
	public void setCreateDate(String Slength) {
		length.set(Slength);;
	}
	public String getSongMenuName() {
		return songMenuName.get();
	}
	public void setSongMenuName(String SsongMenuName) {
		songMenuName.set(SsongMenuName);
	}
	
	public String getLength() {
		return length.get();
	}
	
	public void setLength(String Slength) {
		length.set(Slength);
	}
}
 