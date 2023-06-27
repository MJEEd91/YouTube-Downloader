# YouTube Downloader

YouTube Downloader is a simple Java application that allows users to download YouTube videos by providing the video link. It utilizes the `youtube-dl` command-line tool to perform the download. The application provides a graphical user interface (GUI) built with Java AWT (Abstract Window Toolkit) for ease of use.

## Usage

1. Enter the YouTube video link in the provided text field.

2. Click the "Download" button to initiate the download process.

3. The application will execute the `youtube-dl` command with the provided link.

4. The downloaded video will be saved to the default location specified by `youtube-dl`.

## Dependencies

The project requires the `youtube-dl` command-line tool to be installed on your system. Make sure you have `youtube-dl` installed and available in your system's PATH.

You can install `youtube-dl` by following the instructions provided in the official documentation: [youtube-dl](https://github.com/ytdl-org/youtube-dl#installation)

## Running the Application

To run the YouTube Downloader application:

1. Compile the Java source file using the following command: javac YouTubeDownloader.java
2. Run the application with the following command: java YouTubeDownloader
