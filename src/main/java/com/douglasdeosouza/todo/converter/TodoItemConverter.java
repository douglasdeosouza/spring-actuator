package com.douglasdeosouza.todo.converter;

import com.douglasdeosouza.todo.dto.TodoItemDto;
import com.douglasdeosouza.todo.model.TodoItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TodoItemConverter implements Converter<TodoItem, TodoItemDto> {

    @Override
    public TodoItemDto convert(TodoItem item) {
        return new TodoItemDto(item.getItem(), item.isComplete());
    }
}
