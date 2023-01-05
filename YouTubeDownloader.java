import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class YouTubeDownloader extends Frame implements ActionListener {
    private TextField linkField;
    private Button downloadButton;
    private Label statusLabel;

    public YouTubeDownloader() {
        setLayout(new FlowLayout());

        linkField = new TextField(30);
        add(linkField);

        downloadButton = new Button("Download");
        downloadButton.addActionListener(this);
        add(downloadButton);

        statusLabel = new Label("");
        add(statusLabel);

        setTitle("YouTube Downloader");
        setSize(400, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new YouTubeDownloader();
    }

    public void actionPerformed(ActionEvent e) {
        String link = linkField.getText();
        try {
            Process p = Runtime.getRuntime().exec("youtube-dl " + link);
            p.waitFor();
            statusLabel.setText("Finished!");
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
