package com.takaaki18.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    // test.htmlに画面遷移
    @GetMapping("/test")
    public String getTest() {
        return "test";
    }

    // 画面からの入力内容を受け取ることができる
    @PostMapping("/test")
    public String postRequest(@RequestParam("text1") String str, Model model) {
        model.addAttribute("sample", str);
        return "testResponse";
    }

    @PostMapping("test/db")
    public String postDbRequest(@RequestParam("text2") String str, Model model) {
        int id = Integer.parseInt(str);

        // 1件検索
        Employee employee = testService.findEmployee(id);

        // 結果をModelに登録
        model.addAttribute("id", employee.getEmployeeId());
        model.addAttribute("name", employee.getEmployeeName());
        model.addAttribute("age", employee.getAge());

        return "testResponseDB";
    }

}
