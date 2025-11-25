package ss19_string_regex_to_java.thuc_hanh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            URLConnection connection = url.openConnection();

            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            Scanner scanner = new Scanner(new InputStreamReader(connection.getInputStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("title=\"(.*?)\"");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                String title = matcher.group(1);
                if (!title.contains("Nhạc") && !title.contains("Playlist") && title.length() > 3) {
                    System.out.println(title);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
