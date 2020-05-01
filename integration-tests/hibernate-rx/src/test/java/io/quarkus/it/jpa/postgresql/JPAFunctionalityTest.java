package io.quarkus.it.jpa.postgresql;

import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

/**
 * Test various JPA operations running in Quarkus
 */
@QuarkusTest
public class JPAFunctionalityTest {

    @Test
    public void reactiveFindRx() {
        RestAssured.when()
                .get("/tests/reactiveFindRx")
                .then()
                .body(is("{\"id\":5,\"name\":\"Aloi\"}"));
    }

    @Test
    public void reactiveFindMutiny() {
        RestAssured.when()
                .get("/tests/reactiveFindMutiny")
                .then()
                .body(is("{\"id\":5,\"name\":\"Aloi\"}"));
    }

    @Test
    public void reactivePersist() {
        RestAssured.when()
                .get("/tests/reactivePersist")
                .then()
                .body(is("Tulip"));
    }

    @Test
    public void reactiveRemoveTransientEntity() {
        RestAssured.when()
                .get("/tests/reactiveRemoveTransientEntity")
                .then()
                .body(is("OK"));
    }

    @Test
    public void reactiveRemoveManagedEntity() {
        RestAssured.when()
                .get("/tests/reactiveRemoveManagedEntity")
                .then()
                .body(is("OK"));
    }

    @Test
    public void reactiveUpdate() {
        RestAssured.when()
                .get("/tests/reactiveUpdate")
                .then()
                .body(is("Tina"));
    }
}
