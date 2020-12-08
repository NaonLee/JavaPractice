package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member Member1 = new Member(100, "Lee");
		Member Member2 = new Member(100, "Kim");
		Member Member3 = new Member(100, "Im");
		
		memberArrayList.addMember(Member1);
		memberArrayList.addMember(Member2);
		memberArrayList.addMember(Member3);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(Member2.getMemberId());		//remove Kim
		
		memberArrayList.showAll();
	}

}
