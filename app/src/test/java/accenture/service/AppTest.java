/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package accenture.service;

import org.junit.jupiter.api.Test;

import accenture.server.App;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
