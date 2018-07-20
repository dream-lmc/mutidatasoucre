package com.dm;

import com.dm.domain.Student;
import com.dm.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MutidatasourceApplicationTests {
	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void contextLoads() {
		Student student = new Student();
		student.setAge(123);
		student.setName("qqweqwe");
		int i = studentMapper.insertSelective(student);
		System.out.println(i);

	}

}
