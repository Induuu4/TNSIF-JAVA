package jdbcprograms.executor;

import jdbcprograms.service.CRUD;

public class JdbcMain {

	public static void main(String[] args) {
		CRUD.addStudent(101, "Sneha");
		CRUD.addStudent(102, "Shiva");
		CRUD.addStudent(103, "Priya");

	}

}