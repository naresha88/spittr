package com.spittr.web;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception {
        HomeController homeController = new HomeController();
        //MockMvc mockMvc = standaloneSetup(homeController).build();
        //mockMvc.perform(get("/")).andExpect(view().name("home"));
        assertEquals("home", homeController.home());
    }
}
