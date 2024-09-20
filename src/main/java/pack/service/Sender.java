package pack.service;

import pack.model.Sendable;

public interface Sender<T extends Sendable> {
    void send(T sendable);
}
