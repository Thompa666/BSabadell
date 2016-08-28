package com.ideaknow.api.client.model;

public interface IDKDisplayData {

    public String getTitle();
    public String getValue();
    public IDKDisplayData[] getMenuItems();
    public boolean isClickable();
}
