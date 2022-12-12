package com.lucidiovacas.security.jmptask.mockdata;

import com.lucidiovacas.security.jmptask.model.User;

import java.util.Arrays;
import java.util.List;

public class MockData {

    public static final List<User> USERS = Arrays.asList(
            new User(1L, "lucidio@email.com", "lucidio_vj", "mypass"),
            new User(2L, "paula@email.com", "paula_pm", "herpass")
    );
}
