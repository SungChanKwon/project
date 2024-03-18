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
			action = new MemberInfo();
		}else if(command.equals("content_info")) {
			action = new ContentInfo();
		}
		
		return action;
	}

}
