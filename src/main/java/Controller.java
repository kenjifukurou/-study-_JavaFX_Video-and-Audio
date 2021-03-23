import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller {

    @FXML
    private Button btn_play;

    @FXML
    private Button btn_stop;

    @FXML
    private MediaView mv;

    MediaPlayer mediaPlayer;
    AudioClip clickSFX;
    AudioClip overlaySFX;


    public void initialize() {

        // get SoundFX
        clickSFX = new AudioClip(getClass().getResource("SFXMouseClick.mp3").toString());
        overlaySFX = new AudioClip(getClass().getResource("SFXMouseOver.mp3").toString());

        // get Media a path
        String mediaPath = getClass().getResource("SplittekIntro.mp4").toString();
//        System.out.println(mediaPath);

        // setup Media and MediaPlayer
        Media media = new Media(mediaPath);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        // setup MediaView
        mv.setMediaPlayer(mediaPlayer);
        mv.setFitWidth(640);
        mv.setFitHeight(360);

    }

    @FXML
    void handleButtonPlay(ActionEvent event) {
//        System.out.println("play button clicked");
        clickSFX.play();
        if (mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.play();
        }
    }

    @FXML
    void handleButtonStop(ActionEvent event) {
//        System.out.println("stop button clicked");
        clickSFX.play();
        mediaPlayer.stop();
    }

    @FXML
    void handleMouseOver(MouseEvent event) {
        System.out.println("mouse entered");
        overlaySFX.play();
    }

}