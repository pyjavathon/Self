package part11.api01;//equals()메소드

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	//이 부분 추가!
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}

