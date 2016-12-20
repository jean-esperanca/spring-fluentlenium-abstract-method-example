package com.example;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Wait
public class DuckDuckGoTest extends FluentTest {
    @Test
    public void title_of_duck_duck_go_should_contain_search_query_name() {
        goTo("http://stackoverflow.com/");
        $("[name=q]").fill().with("FluentLenium");
        $("[name=q]").submit();
        System.out.println(window().title());
        assertThat(window().title()).contains("FluentLenium");
    }
}