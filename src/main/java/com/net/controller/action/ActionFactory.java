package com.net.controller.action;


public class ActionFactory{
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		
	}
	public static ActionFactory getInstance() {
		return instance;
	}
	

	public Action getAction(String command) {
		Action action = null;
		
		
		if(command.equals("admin_menu")) {
			action = new AdminMenu();
		}else if(command.equals("member_info")) {
			action = new MemberInfoAction();
		}else if(command.equals("delete_member")) {
			action = new DeleteMemberAction();
		}else if(command.equals("content_info")) {
			action = new ContentInfoAction();
		}else if(command.equals("insert_content_form")) {
			action = new InsertContentFormAction();
		}else if(command.equals("insert_content")) {
			action = new InsertContentAction();
		}else if(command.equals("content_detail")) {
			action = new ContentDetailAction();
		}else if(command.equals("delete_content")) {
			action = new DeleteCotentAction();
		}else if(command.equals("update_content_form")) {
			action = new UpdateContentFormAction();
		}else if(command.equals("update_content")) {
			action = new UpdateContentAction();
		}else if(command.equals("delete_bulletin_form")) {
			action = new DeleteBulletinFormAction();
		}else if(command.equals("bulletin_detail")) {
			action = new BulletinDetailAction();
		}else if(command.equals("delete_bulletin")) {
			action = new DeleteBulletinAction();
		}
		
		return action;
	}

}
