package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {					
		/*for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberID();
			if(memberID == tempId) {
				arrayList.remove(i);
				return true;
			}
			
		}*/
	
		Iterator<Member> iterator = arrayList.iterator();	//<> Generic
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempId = member.getMemberId();
			if(memberID == tempId) {
				arrayList.remove(member);
				return true;
			}	
		}
		System.out.println("There is no such member ID : " + memberID);
		return false;
	}
	
	
	
	public void showAll() {
		/*for(Member m : arrayList) {
			System.out.println(m);
		}*/
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member=iterator.next();
			System.out.println(member);
		}
		System.out.println(arrayList);		//Vector toString. show all elements' toString include ','
		
		//Vector VS ArrayList : vector supports synchronization -> single thread doesn't need
	}
}
