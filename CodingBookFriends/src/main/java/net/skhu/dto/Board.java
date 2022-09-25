package net.skhu.dto;

public class Board {
	int studyGroup_id;
	String title;
	String contents;
	int totalNum;

	public int getStudyGroup_id() {
		return studyGroup_id;
	}

	public void setStudyGroup_id(int studyGroup_id) {
		this.studyGroup_id = studyGroup_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}


}
