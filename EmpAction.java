package cn.web.emp.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.web.emp.entity.Empss;
import cn.web.emp.service.EmpService;

/**
 * Ա������ģ�� �����������ֲ㣩
 * 
 * @author hadoop
 * @param <V>
 *
 */

@Controller
@RequestMapping(value = "/find")
public class EmpAction {

	@Resource
	private EmpService empService;

	@RequestMapping(value = "/findAll")
	public @ResponseBody Map<String, Object> findAll() throws Exception {

		List<Empss> empList = empService.findAll();
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("total", empList.size());
		map.put("rows", empList);
		return map;

	}
	public static void main(String[] args) {
		Date date = new  Date();
		long time = date.getTime();
		Date date2 = new Date(time+123425);
		System.out.println(date2);
		
		
		
		
		
	}
/*	public void test() throws SQLException{
		
	  
		Connection connection = DriverManager.getConnection("");
		Statement createStatement = connection.createStatement();
		String sql = null;
		ResultSet executeQuery = createStatement.executeQuery(sql);
		
	}*/
}
