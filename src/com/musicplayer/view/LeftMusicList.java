package  com.musicplayer.view;

import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LeftMusicList extends Application{

    private Scene scene;
    private AnchorPane AnchorPane_left;	//整个歌单列表面板

    private VBox VBox_items;//控制各控件纵向排序

    private VBox VBox_leftMainField;//左侧区域纵向排序

    private VBox VBox_leftButtons;//按钮们纵向排序

    private JFXButton Button_localMusic;//“本地音乐”按钮

    private JFXButton Button_addLocalMusic;//“添加本地音乐”按钮

    private JFXButton Button_addLocalDirectory;//“添加本地音乐文件夹”按钮

    private HBox HBox_leftManageField;//左中标题栏横向排序

    private Label Label_musicListTitle;//“我的歌单：”文本

    private JFXButton Button_addMusicList;//按钮“+”按钮

    private JFXButton Button_displayMusicList; //展示歌单的按钮

    private ListView<String> ListView_musicList;//歌单按钮列表

    private AnchorPane AnchorPane_CurrentSongInfo;//当前播放歌曲小窗口

    private HBox Hbox_leftImageAndTitle;//控制排序

    private ImageView ImageView_albumCover;//专辑封面

    private VBox Vbox_leftTitleAndSinger;//控制纵向排序的

    private Label Label_musicTitle;//音乐标题

    private Label Label_singer;//歌手

    public AnchorPane getAnchorPane_left() {
        return AnchorPane_left;
    }

    public VBox getVBox_items() {
        return VBox_items;
    }


    public VBox getVBox_leftMainField() {
        return VBox_leftMainField;
    }

    public VBox getVBox_leftButtons() {
        return VBox_leftButtons;
    }

    public JFXButton getButton_localMusic() {
        return Button_localMusic;
    }

    public JFXButton getButton_addLocalMusic() {
        return Button_addLocalMusic;
    }

    public JFXButton getButton_addLocalDirectory() {
        return Button_addLocalDirectory;
    }
    public JFXButton getButton_displayMusicList() {
        return Button_displayMusicList;
    }
    public HBox getHBox_leftManageField() {
        return HBox_leftManageField;
    }

    public Label getLabel_musicListTitle() {
        return Label_musicListTitle;
    }

    public JFXButton getButton_addMusicList() {
        return Button_addMusicList;
    }

    public ListView<String> getListView_musicList() {
        return ListView_musicList;
    }

    public AnchorPane getAnchorPane_CurrentSongInfo() {
        return AnchorPane_CurrentSongInfo;
    }

    public HBox getHbox_leftImageAndTitle() {
        return Hbox_leftImageAndTitle;
    }

    public ImageView getImageView_albumCover() {
        return ImageView_albumCover;
    }

    public VBox getVbox_leftTitleAndSinger() {
        return Vbox_leftTitleAndSinger;
    }

    public Label getLabel_musicTitle() {
        return Label_musicTitle;
    }

    public Label getLabel_singer() {
        return Label_singer;
    }
    public Scene getScene() {
        return scene;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {


        initLayout();
        setCss();
        Scene scene1 = getScene();
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    //初始化布局
    public void initLayout() {

        AnchorPane_left = new AnchorPane();	//整个歌单列表面板
        scene = new Scene(getAnchorPane_left(), 300, 720);
        scene.getStylesheets().add("com/musicplayer/css/leftmusiclist/LeftMusicList.css");
        VBox_items = new VBox();//控制各控件纵向排序

        VBox_leftMainField = new VBox();//左侧区域纵向排序的

        VBox_leftButtons = new VBox();//按钮们纵向排序的

        Button_localMusic = new JFXButton();//“本地音乐”按钮的

        Button_addLocalMusic = new JFXButton();//“添加本地音乐”按钮的

        Button_addLocalDirectory = new JFXButton();//“添加本地音乐文件夹”按钮的

        HBox_leftManageField = new HBox();//左中标题栏横向排序

        Label_musicListTitle = new Label();//“我的歌单：”文本

        Button_addMusicList = new JFXButton();//按钮“+”按钮

        Button_displayMusicList = new JFXButton();//展示歌单按钮

        ListView_musicList = new ListView<String>();//歌单按钮列表的

        AnchorPane_CurrentSongInfo = new AnchorPane();//当前播放歌曲小窗口

        Hbox_leftImageAndTitle = new HBox();//控制排序

        ImageView_albumCover = new ImageView();//专辑封面

        Vbox_leftTitleAndSinger = new VBox();//控制纵向排序

        Label_musicTitle = new Label();//音乐标题

        Label_singer = new Label();//歌手

        AnchorPane_left.getChildren().add(VBox_items);

        //控制各控件纵向排序的纵向排序的布局
        VBox_items.setPrefSize(300, 720);
        VBox_items.getChildren().addAll(VBox_leftMainField,AnchorPane_CurrentSongInfo);

        // 左侧区域纵向排序布局
        VBox_leftMainField.getChildren().addAll(VBox_leftButtons, HBox_leftManageField, ListView_musicList);
        VBox_leftMainField.setPrefSize(300, 600);
        AnchorPane_CurrentSongInfo.setPrefSize(300, 120);

        // 左侧区域纵向排序按钮布局
        VBox_leftButtons.getChildren().addAll(Button_localMusic, Button_addLocalMusic, Button_addLocalDirectory);
        VBox_leftButtons.setSpacing(10);
        VBox_leftButtons.setPrefSize(300, 150);
        Button_localMusic.setPrefSize(250, 30);
        VBox_leftButtons.setPadding(new Insets(5,25,5,25));
        Button_localMusic.setText("本地音乐");

        Button_addLocalMusic.setPrefSize(250, 30);
        Button_addLocalMusic.setText("添加本地音乐歌曲");

        Button_addLocalDirectory.setPrefSize(250, 30);
        Button_addLocalDirectory.setText("添加本地音乐文件夹");

        // 左侧收藏歌单布局
        HBox_leftManageField.getChildren().addAll(Label_musicListTitle, Button_addMusicList, Button_displayMusicList);
        HBox_leftManageField.setPadding(new Insets(5,10,5,50));
        HBox_leftManageField.setPrefSize(300, 50);
        Label_musicListTitle.setPrefSize(170, 50);
        Label_musicListTitle.setText("收藏的歌单");

        ListView_musicList.setPrefSize(300, 410);
        ObservableList<String> datalist = FXCollections.observableArrayList();
        ListView_musicList.setItems(datalist);
        datalist.add("华语速爆新歌");
        datalist.add("欧美民谣");

        // 当前播放歌曲窗口布局
        AnchorPane_CurrentSongInfo.getChildren().addAll(Hbox_leftImageAndTitle);
        AnchorPane_CurrentSongInfo.setPrefSize(300, 120);

        Hbox_leftImageAndTitle.getChildren().addAll(ImageView_albumCover,Vbox_leftTitleAndSinger);
        Vbox_leftTitleAndSinger.getChildren().addAll(Label_musicTitle,Label_singer);
        ImageView_albumCover.setFitHeight(120);
        ImageView_albumCover.setFitWidth(120);
//        Image ImageView_music = new Image(getClass().getResourceAsStream("com/musicplayer/view/Image_albun.png"));
//        ImageView_albumCover.setImage(ImageView_music);
        Vbox_leftTitleAndSinger.setPrefSize(180, 120);
        Label_musicTitle.setPrefSize(180, 60);
        Label_musicTitle.setText("平凡之路 ");
        Label_singer.setPrefSize(180, 60);
        Label_singer.setText("朴树");
    }

    private void setCss() {
        AnchorPane_left.getStyleClass().add("AnchorPane_left");
        ImageView imageViewLocalMusic = new ImageView(new Image("com/musicplayer/css/leftmusiclist/Button_localMusic.png"));
        Button_localMusic.setGraphic(imageViewLocalMusic);
        Button_localMusic.getStyleClass().add("Button_localMusic");
        ImageView imageViewAddLocalMusic = new ImageView(new Image("com/musicplayer/css/leftmusiclist/ButtonAddLocalMusic.png"));
        Button_addLocalMusic.setGraphic(imageViewAddLocalMusic);
        Button_addLocalMusic.getStyleClass().add("Button_addLocalMusic");
        ImageView imageViewAddLocalDirectory = new ImageView(new Image("com/musicplayer/css/leftmusiclist/ButtonAddLocalDirectory.png"));
        Button_addLocalDirectory.setGraphic(imageViewAddLocalDirectory);
        Button_addLocalDirectory.getStyleClass().add("Button_addLocalDirectory");
        Label_musicTitle.getStyleClass().add("Label_musicTitle");
        Label_singer.getStyleClass().add("Label_singer");
        ImageView imageViewMusicListTitle = new ImageView(new Image("com/musicplayer/css/leftmusiclist/LabelMusicListTitle.png"));
        Label_musicListTitle.setGraphic(imageViewMusicListTitle);
        Label_musicListTitle.getStyleClass().add("Label_musicListTitle");
        Button_addMusicList.getStyleClass().add("Button_addMusicList");
        Button_displayMusicList.getStyleClass().add("Button_displayMusicList");
//		ListView_musicList.getStyleClass().add("ListView_musicList");
    }

    public void initData() {
        initLayout();
        setCss();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
