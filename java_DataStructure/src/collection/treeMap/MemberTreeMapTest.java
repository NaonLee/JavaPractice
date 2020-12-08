package collection.treeMap;

import collection.Member;
import collection.hashset.MemberHashSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member member1 = new Member(102, "Lee");
		Member member2 = new Member(101, "Kim");	
		Member member3 = new Member(103, "Im");

		memberTreeMap.addMember(member1);
		memberTreeMap.addMember(member2);
		memberTreeMap.addMember(member3);
		
		Member member4 = new Member(101, "Shin");		
		memberTreeMap.addMember(member4);				
		memberTreeMap.showAllMember();
		

	}

}
