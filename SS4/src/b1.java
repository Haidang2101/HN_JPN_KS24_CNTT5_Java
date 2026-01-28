import java.util.Scanner;

public class b1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();

        title = title.trim();
        title = title.replaceAll("\\s+", " ");
        title = title.toUpperCase();

        author = author.trim();
        author = author.replaceAll("\\s+", " ");

        String[] words = author.split(" ");
        StringBuilder authorBuilder = new StringBuilder();

        for (String w : words) {
            w = w.toLowerCase();
            authorBuilder.append(
                    Character.toUpperCase(w.charAt(0))
                            + w.substring(1)
            ).append(" ");
        }

        author = authorBuilder.toString().trim();

        // ===== IN KẾT QUẢ =====
        System.out.println();
        System.out.println("[" + title + "] - Tác giả: " + author);
    }
}
