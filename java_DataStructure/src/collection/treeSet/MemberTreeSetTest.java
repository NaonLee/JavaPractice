package collection.treeSet;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member member1 = new Member(100, "Lee");
		Member member2 = new Member(102, "Kim");	
		Member member3 = new Member(101, "Im");

		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);				//descend(depends on 'compareTo' in Member)
		memberTreeSet.showAll();
		
		Member member4 = new Member(101, "Shin");		//Id is duplicated->equals should be override to check the duplication
		memberTreeSet.addMember(member4);				//override equals in Member, member4 cannot be inserted
		memberTreeSet.showAll();
	}

}
