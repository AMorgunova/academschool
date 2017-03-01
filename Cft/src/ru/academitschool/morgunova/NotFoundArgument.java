package ru.academitschool.morgunova;

/**
 * Created by DNS on 01.03.2017.
 */
public class NotFoundArgument extends RuntimeException {
    public NotFoundArgument (String message) {
        super(message);
    }
}
