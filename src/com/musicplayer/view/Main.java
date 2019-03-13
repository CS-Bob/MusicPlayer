package com.musicplayer.view;

import java.util.ArrayList;

import org.w3c.dom.css.CSSImportRule;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	private TopAndBottonPage topAndBottonPage; // 音乐播放器主界面

	private LocalMusicPane localMusicPane; // 本地音乐界面

	private LeftMusicList leftMusicList;	// 左边列表界面
	@Override
	public void start(Stage primaryStage) throws Exception {
		topAndBottonPage = new TopAndBottonPage();
		localMusicPane = new LocalMusicPane();
		leftMusicList = new LeftMusicList();
		topAndBottonPage.initData();
		localMusicPane.initData();
		leftMusicList.initData();

		BorderPane BorderPane_mainPage = topAndBottonPage.getBorderPane_mainPage();
//		localMusicPane.start(primaryStage);
//		leftMusicList.initLayout();
		StackPane StackPane = localMusicPane.getStackPane_center();
		AnchorPane leftAnchorPane = leftMusicList.getAnchorPane_left();

		Scene scene = new Scene(BorderPane_mainPage,1300,880);
		ArrayList<String> cssList = new ArrayList<String>();
		cssList.add("com/musicplayer/css/topandbottom/TopAndBottomPage.css");
		cssList.add("com/musicplayer/css/localmusicpage/LocalMusicPageCss.css");
		cssList.add("com/musicplayer/css/leftmusiclist/LeftMusicList.css");
		scene.getStylesheets().addAll(cssList);
		BorderPane_mainPage.setRight(StackPane);
		BorderPane_mainPage.setLeft(leftAnchorPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
