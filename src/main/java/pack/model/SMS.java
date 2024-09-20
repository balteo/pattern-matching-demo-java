package pack.model;

import java.time.Instant;

public record SMS(String to, String from, String message, Instant date) implements Sendable {
}
