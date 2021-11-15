package ru.dexsys.client;
import io.restassured.RestAssured;

public class ThroughputSystem {
    private static final String BASE_URL = "http://localhost:8080/";

    public int entranceExit(String entrance, int keyId, int roomId) {
        return RestAssured.given()
                .baseUri(BASE_URL)
                .basePath("/check")
                .param("entrance", entrance)
                .param("keyId", keyId)
                .param("roomId", roomId)
                .get().statusCode();
    }
}
