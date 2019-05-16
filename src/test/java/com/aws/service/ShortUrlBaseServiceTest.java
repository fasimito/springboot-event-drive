package com.aws.service;

import com.events.driven.EventDrivenApplication;
import com.events.service.ShortUrlBaseService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EventDrivenApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShortUrlBaseServiceTest {

    @Autowired
    private ShortUrlBaseService shortUrlBaseService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void save() {
    }

    @Test
    public void pageQueryShortUrls() {
    }

    @Test
    public void selectByKey() {
    }
}