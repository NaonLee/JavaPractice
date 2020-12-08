package collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());		//for comparator-default constructor call
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = treeSet.iterator();	//<> Generic
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				treeSet.remove(member);
				return true;
			}	
		}
		System.out.println("There is no such member ID : " + memberId);
		return false;
	}
	
	public void showAll() {
		
		Iterator<Member> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			System.out.println(member);
		}
	}
	
}
