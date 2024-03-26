package com.ott.controller.action;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;

		System.out.println("command값 >>" + command);
	//	
		if (command.equals("login_Form")) {
			action = new LoginFormAction();
		} else if (command.equals("login_Check")) {
			action = new LoginCheckAction();
		} else if (command.equals("changeUser_InformationForm")) {
			action = new ChangeUserInformationFormAction();
		} else if (command.equals("update_member")) {
			action = new UpdateMemberAction();
		} else if (command.equals("BulletinList_View")) {
			action = new BulletinListViewFormAction();
		} else if (command.equals("bulletinWishList_View")) {
			action = new BulletinWishListFormAction();
		} else if (command.equals("delete_User")) {
			action = new DeleteMemberAction();
		} else if (command.equals("contentWishList_View")) {
			action = new ContentWishListFormAction();
		} else if (command.equals("bulletin_content_View")) {
			action = new SelectBulletinContentViewAction();
		} else if (command.equals("myBulletin_content_View")) {
			action = new SelectMyBulletinContentViewAction();
		} else if (command.equals("Bulletin_delete")) {
			action = new DeleteBulletinAction();
		} else if (command.equals("comment_Insert")) {
			action = new CommentInsertAction();
		} else if (command.equals("comment_Update_Form")) {
			action = new CommentUpdateFormAction();
		} else if (command.equals("comment_Delete")) {
			action = new CommentDeleteAction();
		} else if (command.equals("Bulletin_Update_Form")) {
			action = new BulletinUpdateFormAction();
		} else if (command.equals("bulletin_update")) {
			action = new BulletinUpdateAction();
		} else if (command.equals("comment_Update")) {
			action = new CommentUpdateAction();
		}else if(command.equals("serach_bulletin")) {
			action = new BulletinSearchAction();
		}else if(command.equals("logout_User")) {
			action = new LogoutAction();
		}

		return action;

	}

}
