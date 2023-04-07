package org.zerock.wego.domain;

import java.util.Date;

import lombok.Value;

@Value
public class ReviewViewVO {

	private Integer sanReviewId; 
	private String sanName; 
	private Integer userId; 
	private String nickName; 
	private String userPic; 
	private Date createdDt; 
	private String modifiedDt; 
	private String title; 
	private String contents; 
	private Integer likeCnt; 
	private Integer reportCnt; 
	
} // end class
