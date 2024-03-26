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
			action = new CommentInsertAction();
		}else  if (command.equals("admin_menu")) {
			action = new AdminMenu();
		} else if (command.equals("admin_member_info")) {
			action = new AdminMemberInfoAction();
		} else if (command.equals("admin_delete_member")) {
			action = new AdminDeleteMemberAction();
		} else if (command.equals("admin_content_info")) {
			action = new AdminContentInfoAction();
		} else if (command.equals("admin_insert_content_form")) {
			action = new AdminInsertContentFormAction();
		} else if (command.equals("admin_content_detail")) {
			action = new AdminContentDetailAction();
		} else if (command.equals("admin_delete_content")) {
			action = new AdminDeleteCotentAction();
		} else if (command.equals("admin_update_content_form")) {
			action = new AdminUpdateContentFormAction();
		} else if (command.equals("admin_delete_bulletin_form")) {
			action = new AdminDeleteBulletinFormAction();
		} else if (command.equals("admin_bulletin_detail")) {
			action = new AdminBulletinDetailAction();
		} else if (command.equals("admin_delete_bulletin")) {
			action = new AdminDeleteBulletinAction();
		} else if (command.equals("qna_list")) {
			action = new QnAListFormAction();
		} else if (command.equals("qna_detail")) {
			action = new QnADetailFormAction();
		} else if (command.equals("admin_qna_reply_form")) {
			action = new AdminQnAReplyFormAction();
		} else if (command.equals("admin_qna_reply")) {
			action = new AdminQnAReplyAction();
		} else if (command.equals("update_qna_form")) {
			action = new UpdateQnAFormAction();
		} else if (command.equals("update_qna")) {
			action = new UpdateQnAAction();
		}else if (command.equals("insert_qna_form")) {
			action = new InsertQnAFormAction();
		}else if (command.equals("insert_qna")) {
			action = new InsertQnAAction();
		}else if (command.equals("changeUser_InformationForm")) {
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
