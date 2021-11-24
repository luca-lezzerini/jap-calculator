package al.polis.calc01.service.impl;

import al.polis.calc01.service.TodoListService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoListServiceImpl implements TodoListService {

    // usually we do not put properties in services
    // but this is a special case and we will di
    // please do not do in the future!
    private List<String> tasks = new ArrayList<>();

    @Override
    public List<String> addTask(String task) {
        tasks.add(task);
        return tasks;
    }

}
