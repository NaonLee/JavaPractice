package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(100, "Lee");
		Member member2 = new Member(101, "Kim");	
		Member member3 = new Member(102, "Im");

		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.showAll();
		
		Member member4 = new Member(101, "Shin");		//Id is duplicated->equals should be override to check the duplication
		memberHashSet.addMember(member4);				//override equals in Member, member4 cannot be inserted
		memberHashSet.showAll();
	}

}
