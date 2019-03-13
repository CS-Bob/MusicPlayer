package com.musicplayer.view;

import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXSlider;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TopAndBottonPage extends Application{

    private BorderPane BorderPane_mainPage;		// 主页面的底层面板

    private AnchorPane AnchorPane_top;			//	顶部区域面板

    private HBox Hbox_topItemHbox;						// 顶部横向Box

    private HBox HBox_bottomItems; 					// 底部横向Box

    private Label Label_FXName;		// 音乐播放器的logo

    private Button Button_back;			// “后退”按钮

    private Button Button_forward;		// “前进”按钮

    private TextField TextField_searchSong;		// 查找歌曲的搜索框

    private Button Button_search;				//  查找歌曲的按钮

    private Button Button_login;			// 播放器登录的按钮

    private Button Button_setting;		// 设置按钮

    private Button Button_minimize;			// 最小化按钮

    private Button Button_close;			// 关闭按钮

    private AnchorPane AnchorPane_bottom;		// 底部区域面板

    private Button Button_last;										// “上一首”按钮

    private Button Button_pause;									// “暂停/播放”按钮

    private Button Button_next;										// “下一首”按钮

    private Button Button_modeSwitch;								// 切换播放模式的按钮id

    private Label Label_playListNum;								// 文本“播放列表”按钮旁边的播放列表歌曲数量id

    private Label Label_currentTime;								//当前播放歌曲的当前播放时间id

    private Label Label_totalTime;									//当前播放歌曲的总时长id

    private JFXSlider Slider_songProgress;								// 当前播放歌曲的进度条id

    private JFXSlider Slider_volumn;									// 当前播放歌曲的音量条id

    private StackPane StackPane_songProgress;						// 进度条的背景

    private Button Button_changeVolumn;								// 按钮“音量键”的id

    private StackPane StackPane_volumn;								// 音量条的背景

    private JFXProgressBar ProgressBar_songProgress;					//进度条的红条

    private JFXProgressBar ProgressBar_volumn;							// 音量条的红条

    private Button Button_playList;									//按钮“播放列表”


    public BorderPane getBorderPane_mainPage() {
        return BorderPane_mainPage;
    }

    public AnchorPane getAnchorPane_top() {
        return AnchorPane_top;
    }

    public HBox getHbox_topItemHbox() {
        return Hbox_topItemHbox;
    }

    public HBox getHBox_bottomItems() {
        return HBox_bottomItems;
    }

    public Label getLabel_FXName() {
        return Label_FXName;
    }

    public Button getButton_back() {
        return Button_back;
    }

    public Button getButton_forward() {
        return Button_forward;
    }

    public TextField getTextField_searchSong() {
        return TextField_searchSong;
    }

    public Button getButton_search() {
        return Button_search;
    }

    public
    Button getButton_login() {
        return Button_login;
    }

    public Button getButton_setting() {
        return Button_setting;
    }

    public Button getButton_minimize() {
        return Button_minimize;
    }

    public Button getButton_close() {
        return Button_close;
    }

    public AnchorPane getAnchorPane_bottom() {
        return AnchorPane_bottom;
    }

    public Button getButton_last() {
        return Button_last;
    }

    public Button getButton_pause() {
        return Button_pause;
    }

    public Button getButton_next() {
        return Button_next;
    }

    public Button getButton_modeSwitch() {
        return Button_modeSwitch;
    }

    public Label getLabel_playListNum() {
        return Label_playListNum;
    }

    public Label getLabel_currentTime() {
        return Label_currentTime;
    }

    public Label getLabel_totalTime() {
        return Label_totalTime;
    }

    public JFXSlider getSlider_songProgress() {
        return Slider_songProgress;
    }

    public JFXSlider getSlider_volumn() {
        return Slider_volumn;
    }

    public StackPane getStackPane_songProgress() {
        return StackPane_songProgress;
    }

    public Button getButton_changeVolumn() {
        return Button_changeVolumn;
    }

    public StackPane getStackPane_volumn() {
        return StackPane_volumn;
    }

    public JFXProgressBar getProgressBar_songProgress() {
        return ProgressBar_songProgress;
    }

    public JFXProgressBar getProgressBar_volumn() {
        return ProgressBar_volumn;
    }

    public Button getButton_playList() {
        return Button_playList;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        initLayout();
        setCss();

        BorderPane_mainPage = getBorderPane_mainPage();
        Scene scene = new Scene(BorderPane_mainPage,1300,880);

        scene.getStylesheets().add("com/musicplayer/css/topandbottom/TopAndBottomPage.css");

        LocalMusicPane l = new LocalMusicPane();
        l.start(primaryStage);
        LeftMusicList leftMusicList = new LeftMusicList();
        leftMusicList.initLayout();
//		leftMusicList.start(primaryStage);
        StackPane n = l.getStackPane_center();
        AnchorPane leftAnchorPane = leftMusicList.getAnchorPane_left();

        BorderPane_mainPage.setRight(n);
        BorderPane_mainPage.setLeft(leftAnchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void initLayout() {
        BorderPane_mainPage = new BorderPane();		// 主页面的底层面板

        AnchorPane_top = new AnchorPane();			//	顶部区域面板

        Hbox_topItemHbox = new HBox();						// 顶部横向Box

        HBox_bottomItems = new HBox(); 					// 底部横向Box

        Label_FXName = new Label();		// 音乐播放器的logo

        Button_back = new Button();			// “后退”按钮

        Button_forward = new Button();		// “前进”按钮

        TextField_searchSong = new TextField();		// 查找歌曲的搜索框

        Button_search = new Button();				//  查找歌曲的按钮

        Button_login = new Button();			// 播放器登录的按钮

        Button_setting = new Button();		// 设置按钮

        Button_minimize = new Button();			// 最小化按钮

        Button_close = new Button();			// 关闭按钮

        AnchorPane_bottom = new AnchorPane();		// 底部区域面板

        Button_last = new Button();										// “上一首”按钮

        Button_pause = new Button();									// “暂停/播放”按钮

        Button_next = new Button();										// “下一首”按钮

        Button_modeSwitch = new Button();								// 切换播放模式的按钮id

        Label_playListNum = new Label();								// 文本“播放列表”按钮旁边的播放列表歌曲数量id

        Label_currentTime = new Label();								//当前播放歌曲的当前播放时间id

        Label_totalTime = new Label();									//当前播放歌曲的总时长id

        Slider_songProgress = new JFXSlider();								// 当前播放歌曲的进度条id

        Slider_volumn = new JFXSlider();									// 当前播放歌曲的音量条id

        StackPane_songProgress = new StackPane();						// 进度条的背景

        Button_changeVolumn = new Button();								// 按钮“音量键”的id

        StackPane_volumn = new StackPane();								// 音量条的背景

        ProgressBar_songProgress = new JFXProgressBar();					//进度条的红条

        ProgressBar_volumn = new JFXProgressBar();							// 音量条的红条

        Button_playList = new Button();

        AnchorPane_top.setPrefSize(1300, 60);

        AnchorPane_top.getChildren().add(Hbox_topItemHbox);

        Hbox_topItemHbox.getChildren().addAll(Label_FXName, Button_back,
                Button_forward, TextField_searchSong, Button_search,
                Button_login, Button_setting, Button_minimize,
                Button_close);


        // 设置logo的位置以及大小
        Label_FXName.setPrefSize(190, 50);
        Hbox_topItemHbox.setMargin(Label_FXName, new Insets(5, 0, 0, 10));

        // 设置后退的位置以及大小
//		Button_back.setPadding(new Insets(0,0,0,50));
        Button_back.setPrefSize(32, 32);
        Hbox_topItemHbox.setMargin(Button_back, new Insets(20, 0, 0, 30));

        // 设置前进按钮的位置以及大小
        Button_forward.setPrefSize(32, 32);
        Hbox_topItemHbox.setMargin(Button_forward, new Insets(20, 5, 0, 0));

        // 设置搜索框的位置以及大小
        TextField_searchSong.setPrefSize(194, 32);
        Hbox_topItemHbox.setMargin(TextField_searchSong, new Insets(20, 0, 0, 40));
        TextField_searchSong.setPadding(new Insets(0, 0, 0 , 10));
        // 搜索按钮的位置以及大小
        Button_search.setPrefSize(32, 32);
        Hbox_topItemHbox.setMargin(Button_search, new Insets(20, 0, 0, 0));

        // 登录头像的位置以及大小
        Button_login.setPrefSize(32, 32);
        Hbox_topItemHbox.setMargin(Button_login, new Insets(20, 0, 0, 250));

        // 设置按钮的位置以及大小
        Button_setting.setPrefSize(30, 30);
        Hbox_topItemHbox.setMargin(Button_setting, new Insets(20, 0, 0, 250));

        // 最小化按钮的位置以及大小
        Button_minimize.setPrefSize(32, 32);
        Hbox_topItemHbox.setMargin(Button_minimize, new Insets(20, 0, 0, 50));

        // 关闭按钮的位置以及大小
        Button_close.setPrefSize(32, 32);
        Hbox_topItemHbox.setMargin(Button_close, new Insets(20, 0, 0, 15));

        // 主界面top顶部添加顶部面板
        BorderPane_mainPage.setTop(AnchorPane_top);
        // 以下为底部部件
        AnchorPane_bottom.getChildren().add(HBox_bottomItems);

        HBox_bottomItems.getChildren().addAll(Button_last, Button_pause
                ,Button_next, Label_currentTime, StackPane_songProgress, Label_totalTime
                ,Button_changeVolumn, StackPane_volumn, Button_modeSwitch, Button_playList
                ,Label_playListNum);

        // 进度条背景的大小及位置
        StackPane_songProgress.getChildren().addAll(ProgressBar_songProgress, Slider_songProgress);
        StackPane_songProgress.setPrefSize(530, 105);
        HBox_bottomItems.setMargin(StackPane_songProgress, new Insets(35,0,0,20));

        // 时间进度条的位置以及大小
        ProgressBar_songProgress.setPrefSize(530, 35);
        HBox_bottomItems.setMargin(StackPane_songProgress, new Insets(5,0,0,20));

        AnchorPane_bottom.setPrefSize(1300, 100);
        // 上一首 暂停 下一首的位置以及大小
        Button_last.setPrefSize(48, 48);
        HBox_bottomItems.setMargin(Button_last, new Insets(30,0,0,20));

        Button_pause.setPrefSize(48, 48);
        HBox_bottomItems.setMargin(Button_pause, new Insets(30,0,0,20));

        Button_next.setPrefSize(48, 48);
        HBox_bottomItems.setMargin(Button_next, new Insets(30,0,0,20));

        // 歌曲时长的位置以及大小
        Label_totalTime.setText("%totalTime");
        Label_totalTime.setPrefSize(100, 50);
        HBox_bottomItems.setMargin(Label_totalTime, new Insets(30,0,0,20));
        // 歌曲当前时间的位置以及大小
        Label_currentTime.setText("%currentTime");
        Label_currentTime.setPrefWidth(50);
        HBox_bottomItems.setMargin(Label_currentTime, new Insets(40,0,0,20));

        // 音量键按钮的位置以及大小

        HBox_bottomItems.setMargin(Button_changeVolumn, new Insets(40,0,0,10));

        // 音量条背景的位置以及大小
        StackPane_volumn.setPrefSize(150, 60);
        HBox_bottomItems.setMargin(StackPane_volumn, new Insets(5,0,0,0));


        StackPane_volumn.getChildren().addAll(ProgressBar_volumn,Slider_volumn);
        ProgressBar_volumn.setPrefSize(150, 20);
//		HBox_bottomItems.setMargin(StackPane_volumn, new Insets(5,0,0,0));
//		StackPane_volumn.setMargin(child, value);
        Slider_volumn.setPrefSize(150, 50);
        //切换播放模式的位置及大小

        HBox_bottomItems.setMargin(Button_modeSwitch, new Insets(35,0,0,10));

        //底部面板的位置
        BorderPane_mainPage.setBottom(AnchorPane_bottom);
//		AnchorPane_bottom.setPadding(new Insets(30,0,0,0));
        //音乐播放列表的位置及大小
        HBox_bottomItems.setMargin(Button_playList, new Insets(35,0,0,10));

        // 歌曲数量标签的位置及大小
        Label_playListNum.setPrefSize(40, 40);
        Label_playListNum.setText("%playListNum");
        HBox_bottomItems.setMargin(Label_playListNum, new Insets(35,0,0,10));
    }

    public void setCss() {
        BorderPane_mainPage.setId("BorderPane_mainPage");
        AnchorPane_top.setId("AnchorPane_top");
        AnchorPane_bottom.setId("AnchorPane_bottom");

        ImageView imageViewLogo = new ImageView(new Image("com/musicplayer/css/topandbottom/LabelLogo.png"));
        Label_FXName.setGraphic(imageViewLogo);
        Label_FXName.setText("音乐播放器");
        Label_FXName.getStyleClass().add("Label_FXName");

        Button_back.getStyleClass().remove(0);
        Button_back.getStyleClass().add("Button_back");
        Button_last.getStyleClass().remove(0);
        Button_last.getStyleClass().add("Button_last");
        TextField_searchSong.getStyleClass().remove(0);
        TextField_searchSong.getStyleClass().add("TextField_searchSong");
        Button_forward.getStyleClass().remove(0);
        Button_forward.getStyleClass().add("Button_forward");
        Button_search.getStyleClass().remove(0);
        Button_search.getStyleClass().add("Button_search");
        Button_login.getStyleClass().remove(0);
        Button_login.getStyleClass().add("Button_login");
        Button_pause.getStyleClass().remove(0);
        Button_pause.getStyleClass().add("Button_pause");
        Button_next.getStyleClass().remove(0);
        Button_next.getStyleClass().add("Button_next");
        Button_setting.getStyleClass().remove(0);
        Button_setting.getStyleClass().add("Button_setting");
        Button_minimize.getStyleClass().remove(0);
        Button_minimize.getStyleClass().add("Button_minimize");
//		Button_close.getStyleClass().remove(0);
        Button_close.getStyleClass().add("Button_close");
        Button_changeVolumn.getStyleClass().remove(0);
        Button_changeVolumn.getStyleClass().add("Button_changeVolumn");
        Button_modeSwitch.getStyleClass().remove(0);
        Button_modeSwitch.getStyleClass().add("Button_modeSwitch");
        Button_playList.getStyleClass().remove(0);
        Button_playList.getStyleClass().add("Button_playList");
//		ProgressBar_songProgress.getStyleClass().remove(0);
        Slider_songProgress.getStyleClass().remove(0);
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void initData() {
        initLayout();
        setCss();

        BorderPane_mainPage = getBorderPane_mainPage();
    }

}
