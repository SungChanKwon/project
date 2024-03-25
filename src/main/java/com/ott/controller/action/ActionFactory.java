package com.ott.controller.action;


public class ActionFactory{
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		
	}
	public static ActionFactory getInstance() {
		return instance;
	}
	

	public Action getAction(String command) {
		Action action = null;
		
		
		if(command.equals("main")) {
			action = new MainFormAction();
		}else if(command.equals("header")) {
			action = new HeaderFormAction();
		}else if(command.equals("admin_menu")) {
			action = new AdminMenu();
		}else if(command.equals("member_info")) {
			action = new MemberInfoAction();
		}else if(command.equals("delete_member")) {
			action = new DeleteMemberAction();
		}else if(command.equals("content_info")) {
			action = new ContentInfoAction();
		}else if(command.equals("insert_content_form")) {
			action = new InsertContentFormAction();
		}else if(command.equals("content_detail")) {
			action = new ContentDetailAction();
		}else if(command.equals("delete_content")) {
			action = new DeleteCotentAction();
		}else if(command.equals("update_content_form")) {
			action = new UpdateContentFormAction();
		}else if(command.equals("delete_bulletin_form")) {
			action = new DeleteBulletinFormAction();
		}else if(command.equals("bulletin_detail")) {
			action = new BulletinDetailAction();
		}else if(command.equals("delete_bulletin")) {
			action = new DeleteBulletinAction();
		}else if(command.equals("qna_list")){
			action = new QnAListFormAction();
		}else if(command.equals("qna_detail")){
			action = new QnADetailFormAction();
		}else if(command.equals("qna_reply_form")){
			action = new QnAReplyFormAction();
		}else if(command.equals("qna_reply")){
			action = new QnAReplyAction();
		}else if(command.equals("member_login_form")) {
			action = new MemberLoginFormAction();
		}else if(command.equals("member_login")) {
			action = new MemberLoginAction();
		}
		return action;
	}

}
