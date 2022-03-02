package com.data.error;

import java.util.Set;

public class BookUnSupportedFieldPatchException extends RuntimeException {

	private static final long serialVersionUID = -8083915057211187175L;

	public BookUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}