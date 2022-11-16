package efforter.ToDoList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
	@RequestMapping("/TodoList")
	@ResponseBody
	public String TodoList(@RequestParam String id, @RequestParam String title) {
        System.out.println(id);
        System.out.println(title);
		return "hello Todo List";
	}
}
