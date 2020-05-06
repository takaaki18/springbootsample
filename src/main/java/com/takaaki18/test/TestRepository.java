package com.takaaki18.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class TestRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 従業員IDに一致する従業員のデータを取得するメソッド
    public Map<String, Object> findOne(int id) {
        String query = "SELECT "
                + "employee_id,"
                + "employee_name,"
                + "age "
                + "FROM employee "
                + "WHERE employee_id=?";

        // 検索実行
        Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);

        return employee;
    }
}
