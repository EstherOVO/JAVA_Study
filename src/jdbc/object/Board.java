package jdbc.object;

import java.sql.Blob;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Board {

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date date;
    private String filename;
    private Blob filedata;

    public Board(int boardNo, String title, String content, String writer, Date date, String filename, Blob filedata) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.filename = filename;
        this.filedata = filedata;
    }

    public int getBoardNo() {
        return boardNo;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getDate() {
        return date;
    }

    public String getFilename() {
        return filename;
    }

    public Blob getFiledata() {
        return filedata;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass());
        Board board = (Board) obj;
        return Objects.equals(boardNo, board.boardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardNo);
    }

    @Override
    public String toString() {
        return String.format("Board No. : %d - Title : %s | Content : %s | Writer : %s | Date : %s | File Name : %s | Data : %s",
                boardNo, title, content, writer, date, filename, filedata);
    }
}
