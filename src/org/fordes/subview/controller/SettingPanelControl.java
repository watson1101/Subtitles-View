package org.fordes.subview.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingPanelControl implements Initializable {
    @FXML
    private GridPane Setting;
    //全局主题
    private Object LightTheme=getClass().getClassLoader().getResource("resources/css/mainStyle_Light.css").toString();
    private Object DarkTheme=getClass().getClassLoader().getResource("resources/css/mainStyle_Dark.css").toString();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //默认主题
        Setting.getStylesheets().add(LightTheme.toString());
    }

    /**
     * 切换颜色模式
     * @param ModeState
     */
    public void modeChange(Boolean ModeState){
        /*移除所有样式表*/
        Setting.getStylesheets().remove(LightTheme);
        Setting.getStylesheets().remove(DarkTheme);
        if(ModeState)//深色->浅色模式
            Setting.getStylesheets().add(LightTheme.toString());
        else//浅色->深色模式
            Setting.getStylesheets().add(DarkTheme.toString());
        //ModeState=!ModeState;
    }
}
