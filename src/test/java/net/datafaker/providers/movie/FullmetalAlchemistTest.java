package net.datafaker.providers.movie;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FullmetalAlchemistTest extends MovieFakerTest {

    @Test
    void characterTest() {
        assertThat(faker.fullMetalAlchemist().character()).isNotEmpty();
    }

    @Test
    void cityTest() {
        assertThat(faker.fullMetalAlchemist().city()).isNotEmpty();
    }

    @Test
    void countryTest() {
        assertThat(faker.fullMetalAlchemist().country()).isNotEmpty();
    }

}
