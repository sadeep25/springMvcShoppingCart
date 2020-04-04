package com.shoppingcart.application.model;

import java.beans.PropertyEditorSupport;

public class CustomExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        UserRole userRole = (UserRole) getValue();
        return userRole == null ? "" : userRole.getRole();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        UserRole userRole = new UserRole();
        userRole.setRole(text.toUpperCase());
        setValue(userRole);
    }
}