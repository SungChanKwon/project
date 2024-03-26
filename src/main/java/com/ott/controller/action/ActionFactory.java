package com.ott.controller.action;

public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		
		Action action = null;
		
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("bulletin_list")) {
			action = new BulletinListAction();
		}else if(command.equals("bulletin_write_form")) {
			action = new BulletinInsertFormAction();
		}else if(command.equals("bulletin_write")) {
			action = new BulletinInsertAction();
		}else if(command.equals("bulletin_view")) {
			action = new BulletinViewAction();
		}else if(command.equals("bulletin_update_form")) {
			action = new BulletinUpdateFormAction();
		}else if(command.equals("bulletin_update")) {
			action = new BulletinUpdateAction();
		}else if(command.equals("bulletin_delete")) {
			action = new BulletinDeleteAction();
		}else if(command.equals("comment_Insert")) {
			action = new commentInsertAction();
		}else if(command.equals("main")) {
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
		}else if (command.equals("changeUser_InformationForm")) {
			action = new changeUserInformationFormAction();
		} else if (command.equals("BulletinList_View")) {
			action = new BulletinListViewFormAction();
		} else if (command.equals("bulletinWishList_View")) {
			action = new bulletinWishListFormAction();
		} else if (command.equals("contentWishList_View")) {
			action = new contentWishListFormAction();
		} else if (command.equals("bulletin_content_View")) {
			action = new selectBulletinContentViewAction();
		} else if (command.equals("myBulletin_content_View")) {
			action = new selectMyBulletinContentViewAction();
		} else if (command.equals("Bulletin_delete")) {
			action = new deleteBulletinAction();
		} else if (command.equals("comment_Update_Form")) {
			action = new commentUpdateFormAction();
		} else if (command.equals("comment_Delete")) {
			action = new commentDeleteAction();
		}else if (command.equals("comment_Update")) {
			action = new commentUpdateAction();
		}else if(command.equals("serach_bulletin")) {
			action = new bulletinSearchAction();
		}else if(command.equals("member_login_form")) {
			action = new MemberLoginActionForm();
		}else if(command.equals("member_insert_form")) {
			action = new MemberInsertActionForm();
		}else if(command.equals("member_insert")) {
			action = new MemberInsertAction();
		}else if(command.equals("member_idcheck_form")) {
			action = new MemberIdcheckFormAction();
		}else if(command.equals("idCheck")) {
			action = new MemberIdcheckAction();
		}else if(command.equals("member_login")) {
			action = new MemberLoginAction();
		}else if(command.equals("member_findid_form")) {
			action = new MemberFindidFormAction();
		}else if(command.equals("member_findid")) {
			action = new MemberFindidAction();
		}else if(command.equals("member_findpw_form")) {
			action = new MemberFindpwFormAction();
		}else if(command.equals("member_findpw")) {
			action = new MemberFindpwAction();
		}else if(command.equals("member_findid_after_form")) {
			action = new MemberFindidAfterFormAction();
		}
		return action;
	}
}
		
