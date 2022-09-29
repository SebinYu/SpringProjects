package net.skhu.dto;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Studygroup {
    BigInteger studyGroup_id;
    String title;
    String contents;
    int learningMaterial_id;
    String leader;
    int totalNum;
    int currentNum;
    private Timestamp regDate;


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

	public int getLearningMaterial_id() {
		return learningMaterial_id;
	}
	public void setLearningMaterial_id(int learningMaterial_id) {
		this.learningMaterial_id = learningMaterial_id;
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
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	
	
}
