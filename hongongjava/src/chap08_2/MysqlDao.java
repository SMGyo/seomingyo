package chap08_2;

public class MysqlDao implements DataAccessObject{
	@Override
	public void select() {System.out.println("Mysql DB에서 검색");}
	@Override
	public void insert() {System.out.println("Mysql DB에 삽입");}
	@Override
	public void update() {System.out.println("Mysql DB를 수정");}	
	@Override
	public void delete() {System.out.println("Mysql DB에서 삭제");}

}
