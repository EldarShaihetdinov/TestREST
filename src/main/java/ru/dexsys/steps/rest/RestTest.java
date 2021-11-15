package ru.dexsys.steps.rest;


import io.cucumber.java.en.And;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import ru.dexsys.client.ThroughputSystem;


public class RestTest {
    private final ThroughputSystem throughputSystem = new ThroughputSystem();

    //Проверка возможности входа/выхода
    @And("\"{}\" используя ключ {int} и номер комнаты {int} и код ответа {int}")
    public void entranceTest(String command, int keyId, int roomId, int expectedCode) {
        String action = command.equals("войти") ? "ENTRANCE" : "EXIT";
        int statusCode = throughputSystem.entranceExit(action, keyId, roomId);
        Assert.assertEquals(expectedCode, statusCode);
    }
}



