package egovframework.example.sample.service;

import java.io.Serializable;

public class UserVo implements Serializable {
	private static final long serialVersionUID = -5817021412630105195L;
	private String searchWord="";
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
}
