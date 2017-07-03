package com.wisely.highlight_spring4.ch3.conditional;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
