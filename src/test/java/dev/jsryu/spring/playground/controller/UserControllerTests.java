package dev.jsryu.spring.playground.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.test.web.servlet.MockMvc;


import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@AutoConfigureMockMvc
@WebMvcTest(controllers = UserController.class)
public class UserControllerTests {

    @Autowired
    MockMvc mvc;

    @Test
    void shouldReturnHelloMessage() throws Exception {
        mvc.perform(get("/users/hello"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, User!"));

    }
}
