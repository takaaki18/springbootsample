package com.takaaki18.test;

import lombok.Data;

@Data
// 従業員クラス
public class Employee {
    // 従業員ID
    private int employeeId;
    // 従業員名
    private String employeeName;
    // 年齢
    private int age;

    // ゲッター
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // セッター
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
