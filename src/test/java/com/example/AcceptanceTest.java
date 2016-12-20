package com.example;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@Wait
public class AcceptanceTest extends FluentTest {

    @Value("${local.server.port}")
    private String port;

    @Test
    public void shitWorks() {
        goTo("http://localhost:" + this.port + "/");

        assertThat($("body").text()).contains("Hello!");

        $("a").click();

        assertThat($("body").text()).contains("Other!");
    }

}
