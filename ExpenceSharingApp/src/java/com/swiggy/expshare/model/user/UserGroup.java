package java.com.swiggy.expshare.model.user;

import java.util.List;

public class UserGroup {

	List<User> groupMembersList;

	public UserGroup(List<User> groupMemberList) {
		super();
		this.groupMembersList = groupMemberList;
	}

	public List<User> getGroupMemberList() {
		return groupMembersList;
	}

	public void setGroupMemberList(List<User> groupMemberList) {
		this.groupMembersList = groupMemberList;
	}

	@Override
	public String toString() {
		return "UserGroup [groupMemberList=" + groupMembersList + "]";
	}

}
