package com.example.abcService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@AllArgsConstructor
@Data
public class User {
    @PrimaryKey
    private UUID id = UUID.randomUUID();
    private String name;
    private int age;

    @Override
    public String toString() {
        return String.format("{ @type = %1$s, id = %2$s, name = %3$s, age = %4$d }", getClass().getName(), getId(),
                getName(), getAge());
    }
}
