package com.takaaki18.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public Employee findEmployee(int id) {
        // 1件検索実行
        Map<String, Object> map = testRepository.findOne(id);

        // Mapから値を取得
        int employeeId = (Integer)map.get("employee_id");
        String employeeName = (String)map.get("employee_name");
        int age = (Integer)map.get("age");

        // Employeeクラスにセット
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);
        employee.setAge(age);

        return employee;
    }
}
