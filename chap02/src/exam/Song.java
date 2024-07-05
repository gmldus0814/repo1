package exam;

public class Song {
    /*
    멜론 노래 관리 DB
    class Song
    필드 : 제목, 가수명, 장르, 가사, 곡 길이
    메소드
    각각의 값을 지정하는 것(제목바꾸기 같이)
    모든 정보 표시
    class SongExam
    3곡 이상의 노래를 등록해서 관리
     */
    String title;
    String name;
    String genre;
    String lyrics;
    int length;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void allPrint() {
        System.out.println("title = " + title);
        System.out.println("name = " + name);
        System.out.println("genre = " + genre);
        System.out.println("lyrics = " + lyrics);
        System.out.println("length = " + length);
    }


}
