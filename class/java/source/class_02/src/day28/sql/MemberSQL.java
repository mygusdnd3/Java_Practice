package day28.sql;

public class MemberSQL {
	public final int SEL_MEMB_LIST = 1001;
	public final int SEL_MEMB_INFO = 1002;
	
	//질의명령을 반환해줄 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		// 코드값에 따라 반환해줄 질의 명령 분기처리
		switch(code) {
		case SEL_MEMB_LIST:
			buff.append("select ");
			buff.append("	id ");
			buff.append("from ");
			buff.append("	member01 ");
			buff.append("where ");
			buff.append("	isshow = 'Y'");
			break;
		case SEL_MEMB_INFO:
			buff.append("select ");
			buff.append("	mno, id, name, pw, mail, tel, gen, avt, joindate ");
			buff.append("from ");
			buff.append("	member01 ");
			buff.append("where ");
			buff.append("	id = ?");
			break;
		}
		return buff.toString();
		
	}

}
