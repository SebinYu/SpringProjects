package net.skhu.dto;

import java.math.BigInteger;

public class Studygroup {
    BigInteger studyGroup_id;
    String title;
    String contents;
    String leader;
    int totalNum;
    int currentNum;


	public int getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}
	public BigInteger getStudyGroup_id() {
		return studyGroup_id;
	}
	public void setStudyGroup_id(BigInteger studyGroup_id) {
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
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}



}
