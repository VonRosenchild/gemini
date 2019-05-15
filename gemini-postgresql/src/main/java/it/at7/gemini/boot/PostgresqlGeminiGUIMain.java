package it.at7.gemini.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class PostgresqlGeminiGUIMain {
    public static void main(String[] args) {
        GeminiPostgresqlMain.startWithGui(args);
    }
}
