package demo.sse.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classname: TestController </p>
 * Description: TODO </p>
 * Created by Leobert on 2023/11/28.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    public static class Obj {
        private String msg;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    @GetMapping(path = "/words")
    Obj test() {
        Obj obj = new Obj();
        obj.setMsg("test");
        return obj;
    }
}
