package com.sist.main;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컨테이너에 등록 
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		EmpDAO dao = (EmpDAO)app.getBean("dao");
		List<EmpVO> list = dao.empListData();
		for(EmpVO vo:list) {
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getDbday()+" "
					+vo.getSal());
			
			
			
		}
	}

}
