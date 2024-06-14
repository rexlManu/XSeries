package com.cryptomorin.xseries.profiles.skull;

import com.cryptomorin.xseries.profiles.exceptions.ProfileChangeException;

/**
 * An object that has all the information about failed attempts.
 * @param <T> the object that has its profile set. See {@link com.cryptomorin.xseries.profiles.ProfileContainer} for a list.
 */
public final class ProfileFallback<T> {
    private final ProfileInstruction<T> instruction;
    private T object;
    private final ProfileChangeException error;

    public ProfileFallback(ProfileInstruction<T> instruction, T object, ProfileChangeException error) {
        this.instruction = instruction;
        this.object = object;
        this.error = error;
    }

    public T getObject() {
        return object;
    }

    public ProfileInstruction<T> getInstruction() {
        return instruction;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public ProfileChangeException getError() {
        return error;
    }
}
