import java.util.Arrays;

public class AppDate {

    private String [] header;
    private int [][] date;

    public AppDate() {

    }

    public AppDate(String[] header, int[][] date) {
        this.header = header;
        this.date = date;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getDate() {
        return date;
    }

    public void setDate(int[][] date) {
        this.date = date;
    }

    @Override
    public String toString() {

        return "AppDate{" +
                "header=" + Arrays.toString(header) +
                ", date=" + Arrays.toString(date) +
                '}';
    }
}
