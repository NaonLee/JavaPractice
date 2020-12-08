package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = hashSet.iterator();	//<> Generic
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashSet.remove(member);
				return true;
			}	
		}
		System.out.println("There is no such member ID : " + memberId);
		return false;
	}
	
	public void showAll() {
		
		Iterator<Member> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			System.out.println(member);
		}
	}
	
}
