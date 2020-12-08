package collection.hashMap;

import collection.Member;
import collection.hashset.MemberHashSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(100, "Lee");
		Member member2 = new Member(101, "Kim");	
		Member member3 = new Member(102, "Im");

		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		
		Member member4 = new Member(101, "Shin");		
		memberHashMap.addMember(member4);				
		memberHashMap.showAllMember();
		
		memberHashMap.removeMameber(101);
		memberHashMap.showAllMember();

	}

}
