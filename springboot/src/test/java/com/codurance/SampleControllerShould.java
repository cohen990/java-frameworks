package com.codurance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SampleController.class)
public class SampleControllerShould {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void return_hello_world(){
        String result = this.restTemplate.getForObject("/poop", String.class);
        assertThat(result).isEqualTo("Hello World!");
    }
}
